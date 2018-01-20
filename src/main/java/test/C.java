package test;

import data.Human;

public class C extends A {

    public void goo() {
        System.out.println("goo");
    }

    @Override
    public void foo() {
        System.out.println("foo");
    }

    public void test() {
        A obj = new B();
        obj.printS();
        B obj2 = new B();
        obj2.printS();
        C obj3 = new C();

        obj.goo();
        obj.goo2();
        obj3.goo2();

        System.out.println(C.stA);
        obj3.printS();
        System.out.println(A.stA);
        C.i1.setAge(100);
        System.out.println(I.i1);

        System.out.println(obj);
        System.out.println(obj.hashCode());

        B.staticFoo();
        obj.staticFoo();
        obj2.staticFoo();
        A.staticFoo();
        C.staticFoo();
        obj3.staticFoo();
    }
}
