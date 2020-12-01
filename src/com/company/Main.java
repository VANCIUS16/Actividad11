package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Circle c = new Circle();
        Triangle t = new Triangle();
        Square s = new Square();

        int a=0, b=0, x=0;

        do{
            System.out.println("Bienvenido a la actividad 11");
            System.out.println("Menu: (Seleccione un numero y despues otro) \n1. Circulo \n\t1. Area \n\t2. Perimetro " +
                               "\n2. Triangulo \n\t1. Area \n\t2. Perimetro \n3. Cuadrado \n\t1. Area \n\t2. Perimetro ");
            System.out.print("primer filtro: ");
            a = teclado.nextInt();
            System.out.print("Segundo filtro: ");
            b = teclado.nextInt();

            if(a==1){
                if(b==1){
                    c.getArea();
                }else {
                    c.getPerimeter();
                }
            }else if(a == 2){
                if(b==1){
                    t.getArea();
                }else {
                    t.getPerimeter();
                }
            }else {
                if(b==1){
                    s.getArea();
                }else {
                    s.getPerimeter();
                }
            }
            System.out.println("Desea repetir el prorama? \n Si=> 1, No=> 0");
            x = teclado.nextInt();
        }while (x==1);
        System.out.println("Se termino el Programa :D");
    }
}