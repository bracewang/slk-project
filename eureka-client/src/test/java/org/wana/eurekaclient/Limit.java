package org.wana.eurekaclient;

import java.util.ArrayList;
import java.util.List;

public class Limit {

    static class Base{

    }

    static class A extends Base{
        void f() {
            System.out.println("A.f");
        }
    }

    static class B extends A {
        void f() {
            System.out.println("B.f");
        }
    }

    static class C extends B {
        void f() {
            System.out.println("C.f");
        }
    }

    private static void jokeIn(List<? extends A> list){

        A a = new B();
        A b = new C();
        C c = new C();

    /*    list.add(a);
        list.add(b);
        list.add(c);*/
    }

    public static void main(String[] args) {
        List<? extends A> list = new ArrayList<>();
        List<? extends B> list1 = new ArrayList<>();
        List<? extends C> list2 = new ArrayList<>();

        jokeIn(list);
        jokeIn(list1);
        jokeIn(list2);


    }
}
