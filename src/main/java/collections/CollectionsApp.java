package collections;

import dao.HumanComparableDao;
import dao.HumanDao;
import data.Human;
import data.HumanComparable;
import data.HumanGender;

import java.util.*;

public class CollectionsApp {

    public void test1() {
        HumanDao humanDao = new HumanDao();

        List<Human> arrayList = new ArrayList<>();
        arrayList.addAll(humanDao.getBookAuthors());

        System.out.println("\nAll book authors ArrayList: \n" + arrayList);

        System.out.println("\nSecond book author ArrayList: \n" + arrayList.get(1));

        System.out.println("\nContains book author ArrayList: \n" + arrayList.contains(arrayList.get(1)));

        System.out.println("\nRemoved second author ArrayList:");
        arrayList.remove(1);
        System.out.println(arrayList);

        System.out.println("\nAdd new author ArrayList:");
        arrayList.add(new Human("test_firstname", "test_surname", 0, HumanGender.MALE));
        System.out.println(arrayList);

        System.out.println("\nAdd duplicated author ArrayList:");
        arrayList.add(arrayList.get(0));
        System.out.println(arrayList);

        System.out.println("\nPrint authors ArrayList:");
        for (Human h : arrayList) {
            System.out.println(h);
        }
    }

    public void test2() {
        HumanDao humanDao = new HumanDao();

        List<Human> linkedList = new LinkedList<>();
        linkedList.addAll(humanDao.getBookAuthors());

        System.out.println("\nAll book authors LinkedList: \n" + linkedList);

        System.out.println("\nSecond book author LinkedList: \n" + linkedList.get(1));

        System.out.println("\nContains book author LinkedList: \n" + linkedList.contains(linkedList.get(1)));

        System.out.println("\nRemoved second author LinkedList:");
        linkedList.remove(1);
        System.out.println(linkedList);

        System.out.println("\nAdd third new author LinkedList:");
        linkedList.add(2, new Human("test_firstname", "test_surname", 0, HumanGender.MALE));
        System.out.println(linkedList);

        System.out.println("\nAdd duplicated author LinkedList:");
        linkedList.add(2, linkedList.get(0));
        System.out.println(linkedList);

        System.out.println("\nPrint authors LinkedList:");
        for (Human h : linkedList) {
            System.out.println(h);
        }
    }

    public void test3() {
        HumanDao humanDao = new HumanDao();

        Set<Human> hashSet = new HashSet<>();
        hashSet.addAll(humanDao.getBookAuthors());

        System.out.println("\nAll book authors HashSet: \n" + hashSet);

        System.out.println("\nSecond book author HashSet:");
        int i = 1;
        for (Human h : hashSet) {
            if (i == 2) {
                System.out.println(h);
                break;
            }
            i++;
        }

        System.out.println("\nContains book author HashSet:");
        i = 1;
        Human ref = null;
        for (Human h : hashSet) {
            if (i == 2) {
                ref = h;
                break;
            }
            i++;
        }
        System.out.println(hashSet.contains(ref));

        System.out.println("\nRemoved second author HashSet:");
        hashSet.remove(ref);
        System.out.println(hashSet);
    }

    public void test4() {
        HumanDao humanDao = new HumanDao();
        HumanComparableDao humanComparableDao = new HumanComparableDao();

        Set<Human> hashSet = new HashSet<>();
        hashSet.addAll(humanDao.getBookAuthors());

        Set<Human> linkedHashSet = new HashSet<>();
        linkedHashSet.addAll(humanDao.getBookAuthors());

        Set<HumanComparable> treeSet = new TreeSet<>();
        treeSet.addAll(humanComparableDao.getBookAuthors());

        System.out.println("\nHashSet vs LinkedHashSet vs TreeSet print:");
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);

        System.out.println("\nAdd element in HashSet vs LinkedHashSet vs TreeSet:");
        Human h = new Human("test_firstname", "test_surname", 0, HumanGender.MALE);
        HumanComparable hc = new HumanComparable("test_firstname", "test_surname", 0, HumanGender.MALE);
        hashSet.add(h);
        linkedHashSet.add(h);
        treeSet.add(hc);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }

    public void test5() {
        HumanDao humanDao = new HumanDao();

        Map<Integer, Human> hashMap = new HashMap();
        humanDao.getBookAuthors().forEach(p -> hashMap.put(p.hashCode(), p));

        Map<Integer, Human> hashtable = new Hashtable<>();
        humanDao.getBookAuthors().forEach(p -> hashtable.put(p.hashCode(), p));

        Map<Integer, Human> treeMap = new TreeMap<>();
        humanDao.getBookAuthors().forEach(p -> treeMap.put(p.hashCode(), p));

        System.out.println("\nHashMap vs Hashtable vs TreeMap print:");
        System.out.println(hashMap);
        System.out.println(hashtable);
        System.out.println(treeMap);

        System.out.println("\nAdd element in HashMap vs Hashtable vs TreeMap print:");
        Human h = new Human("test_firstname", "test_surname", 0, HumanGender.MALE);
        hashMap.put(h.hashCode(), h);
        hashtable.put(h.hashCode(), h);
        treeMap.put(h.hashCode(), h);
        System.out.println(hashMap);
        System.out.println(hashtable);
        System.out.println(treeMap);
    }
}
