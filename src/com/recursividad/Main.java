package com.recursividad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int i = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int j = scanner.nextInt();
        mcdIterativo(i,j);
        System.out.println("MCD metodo recursivo");
        mcdRecursivo(i,j);
    }
    public static void mcdIterativo(int i, int j){
        System.out.println("MCD metodo iterativo");
        while(i != j)
            if(i>j){
                i= i-j;
            }
            else{
                j= j -i;
            }
            System.out.println("El MCD es: " + i);

    }

    public static void mcdRecursivo(int i, int j){
        //caso base
        if(j == 0){
            System.out.println("El MCD es: " + i);
        }
        //recursivo
        else{
            mcdRecursivo(j,i % j);
        }
    }
}
