package com.company;

import java.util.Scanner;

public class Circle implements Shape{

    public Scanner teclado = new Scanner(System.in);
    public double a, p, r, pi=3.1416;

    @Override
    public void getArea() {
        //A = pi *r2
        System.out.print("Ingrese el Radio: ");
        r = teclado.nextDouble();
        a = pi * (r*r);

        System.out.println("El Area es: " + a);
    }

    @Override
    public void getPerimeter() {
        //P=2*pi*r
        System.out.print("Ingrese el Perimetro: ");
        r = teclado.nextDouble();
        p = 2 * pi * r;

        System.out.println("El Perimetro es: " + p);
    }
}
