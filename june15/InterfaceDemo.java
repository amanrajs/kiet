package com.company.june15;

import java.io.PrintStream;

interface Printable{
    public abstract void print();
}

    class Demo implements Printable{
    @Override
    public void print() {
        System.out.println("\n\t This is print() in Demo class");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Printable p1 = new Demo();
        p1.print();
    }
}
