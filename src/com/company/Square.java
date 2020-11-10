package com.company;

import java.util.Scanner;

public class Square implements Shape{

    public Scanner teclado = new Scanner(System.in);
    public double A, P, b, h;

    @Override
    public void getArea() {
        //A=b*h
        System.out.print("Ingrese la Base: ");
        b = teclado.nextDouble();
        System.out.print("Ingrese la Altura: ");
        h = teclado.nextDouble();

        A = b*h;

        System.out.println("El Area es: " + A);
    }

    @Override
    public void getPerimeter() {
        //P=b+b+b+b
        System.out.print("Ingrese la Base: ");
        b = teclado.nextDouble();

        P = h+h+h+h;

        System.out.println("El Perimetro es: " + P);
    }
}
