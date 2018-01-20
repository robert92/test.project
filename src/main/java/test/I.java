package test;

import data.Human;
import data.HumanGender;

public interface I {

    Human i1 = new Human("test", "test", 10, HumanGender.MALE);

    void goo();

    default void goo2() {
        System.out.println("goo2");
        i1.setAge(20);
    }
}
