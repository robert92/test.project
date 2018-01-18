package data;

import java.util.Comparator;

public class HumanComparable implements Comparable {

    private String firstname;
    private String surname;
    private Integer age;
    private HumanGender gender;

    public HumanComparable(String firstname, String surname, Integer age, HumanGender gender) {
        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public HumanGender getGender() {
        return gender;
    }

    public void setGender(HumanGender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "HumanComparable{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        HumanComparable hc = (HumanComparable) o;
        Comparator comparator = Comparator.comparing(HumanComparable::getFirstname)
                .thenComparing(HumanComparable::getSurname)
                .thenComparing(HumanComparable::getAge)
                .thenComparing(HumanComparable::getGender);
        return comparator.compare(this, hc);
    }
}
