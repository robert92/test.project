package test;

public abstract class A implements I {

    String s = "s from A";
    static String stA;
    final String fnA = "tw";

    void printS() {
        System.out.println(s);
        stA = "sa";
        //fnA = "sa";
    }

    abstract void foo();

    static void staticFoo() {
        System.out.println("staticFoo from A");
    }
}
