package com.company;

import java.util.Scanner;

public class Triangle implements Shape{

    public Scanner teclado = new Scanner(System.in);
    public double b, h, a, p;

    @Override
    public void getArea() {
        //A=(b*h)2
        System.out.print("Ingrese la Base: ");
        b = teclado.nextDouble();
        System.out.print("Ingrese la Altura: ");
        h = teclado.nextDouble();

        a = (b*h)*2;

        System.out.println("El Area es: " + a);
    }

    @Override
    public void getPerimeter() {
        //P=b+b+b
        System.out.print("Ingrese la Base: ");
        b = teclado.nextDouble();

        p = b+b+b;

        System.out.println("El Perimetro es: " + p);
    }
}
