/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.excepcionesej05;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento
 */
public class ExcepcionesEj05 {

    public static void main(String[] args) {
        //Generar un numero aleatorio
        int num = (int) (Math.random() * 500);
        System.out.println("numero " + num);
        boolean acierto = false;
        do {
            int resp = capturarNumero();    //Llamar a metodo para ingresar numero
            if (resp < num) {
                System.out.println("El numero es mayor");
            } else if (resp > num) {
                System.out.println("El numero es menor");
            } else {
                System.out.println("Acertaste");
                acierto = true;
            }
        } while (!acierto);

    }

    //Ingresar numero y capturar error (si existe)
    public static int capturarNumero() {
        Scanner lr = new Scanner(System.in);
        int resp = 0;
        try {
            System.out.println("Adivie el numero ");
            resp = lr.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error al ingresar un numero ");
        }
        return resp;
    }
    
}
