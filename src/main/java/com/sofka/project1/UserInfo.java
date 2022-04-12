package com.sofka.project1;

import javax.swing.*;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
    /*
    Realice un proyecto de java en Intellij IDE en donde se reciba por consola la siguiente información:
    - Nombre de usuario
    - Celular
    - Edad
    El sistema debe imprimir el siguiente mensaje:
    Bienvenido señor (Nombre de usuario), es un placer para nosotros contar con una persona de (Edad) años.
    Próximamente nos comun icaremos con usted al numero (Celular).

    Feliz día
    */
        int number = 0;
        int edad=0;
        String name = "";
        System.out.print("Ingrese su nombre: ");
        Scanner captura_name = new Scanner(System.in);
        name = captura_name.nextLine();

        System.out.print("ingrese su edad: ");
        Scanner captura_edad = new Scanner(System.in);
        edad = captura_edad.nextInt();

        System.out.print("Ingrese su celular: ");
        Scanner captura_number = new Scanner(System.in);
        number = captura_number.nextInt();

        JOptionPane.showMessageDialog(null, "Bienvenido señor "+name+"," + " es un placer para nosotros contar con una persona de "+edad+"\n" +
                "años. Próximamente nos comunicaremos con usted al numero "+number+"\n Feliz resto de día.");
    }
}
