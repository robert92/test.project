package test;

public class B extends A {

    String s = "s from B";

    void printS() {
        System.out.println(s);
    }

    void foo() {
        System.out.println("foo");
    }

    public void goo() {
        System.out.println("goo");
    }

    @Override
    public void goo2() {
        System.out.println("goo2 from B");
    }

    static void staticFoo() {
        System.out.println("staticFoo from B");
    }
}
