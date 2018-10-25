package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Pedimos los dos numeros por consola y los asignamos a sus variables.
        System.out.println("Introduzca el primer número a comparar:\n");
        Scanner sc=new Scanner(System.in);
        double numero1=sc.nextDouble();
        System.out.println("Introduzca el segundo número a comparar:\n");
        double numero2=sc.nextDouble();
        //Utilizamos las variables para compararlas en un if para mostrar la respuesta acorde al resultado.
        if(numero1==numero2){
            System.out.println("Los dos números son iguales:\n");
        }else{
            System.out.println("Los dos números no son iguales:\n");
        }
    }
}
