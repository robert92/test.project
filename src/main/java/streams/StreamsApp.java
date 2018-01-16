package streams;

import dao.HumanDao;
import data.Human;
import data.HumanGender;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsApp {

    private HumanDao humanDao = new HumanDao();

    public void test1() {
        List<Human> authors = humanDao.getBookAuthors();

        System.out.println("Sequential stream:");
        authors.stream().forEach(System.out::println);
        System.out.println("\nParallel stream:");
        authors.parallelStream().forEach(System.out::println);

        System.out.println("\nMap to show only first name:");
        authors.stream().map(p -> p.getFirstname()).forEach(System.out::println);

        System.out.println("\nFilter authors age lower equals to 30:");
        authors.stream().filter(p -> p.getAge() <= 30).forEach(System.out::println);

        System.out.println("\nDistinct authors ages:");
        authors.stream().map(p -> p.getAge()).distinct().forEach(System.out::println);

        System.out.println("\nSorted authors by surname:");
        authors.stream().sorted(Comparator.comparing(Human::getSurname)).forEach(System.out::println);
        //authors.stream().sorted((s, p) -> s.getSurname().compareTo(p.getSurname())).forEach(System.out::println);

        System.out.println("\nSorted authors by age then by surname then by firstname:");
        authors.stream().sorted(Comparator.comparing(Human::getAge).thenComparing(Human::getSurname).thenComparing(Human::getFirstname)).forEach(System.out::println);

        System.out.println("\nLimit first 3 authors:");
        authors.stream().limit(3).forEach(System.out::println);

        System.out.println("\nAll authors and all ages:");
        authors.stream().peek(System.out::println).map(Human::getAge).forEach(System.out::println);
    }

    public void test2() {
        List<Human> authors = humanDao.getBookAuthors();

        System.out.println("\nUnique surnames in uppercase of the first 2 book authors that are 28 years old or over:");
        authors.stream()
                .filter(p -> p.getAge() >= 28)
                .map(Human::getSurname)
                .map(String::toUpperCase)
                .distinct()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\nCompute sum of ages of all male authors younger than 30:");
        Integer res = authors.stream()
                .filter(p -> p.getGender().equals(HumanGender.MALE))
                .filter(p -> p.getAge() < 30)
                .map(Human::getAge)
                .reduce(0, Integer::sum);
        System.out.println(res);

        System.out.println("\nDistinct authors by age:");
        Map<Integer, Human> result = authors.stream().collect(Collectors.toMap(Human::getAge, Function.identity(), (s, p) -> {System.out.println("Duplicate found!"); return s;}));
        System.out.println(result.size());
    }
}
