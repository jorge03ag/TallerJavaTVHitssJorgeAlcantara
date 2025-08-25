package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int total;
        float numeroIngresado, numeroMenor = 0;
        //Bucle dowhile que permite que se ingresen mínimo 10 dígitos 
        do {
            System.out.print("Ingresa la cantidad de números a comparar (Mínimo 10): ");
            total = entrada.nextInt();
        } while (total < 10);
        for (int i = 1; i <= total; i++) {
            System.out.println("Ingresa el número " + i);
            numeroIngresado = entrada.nextFloat();
            if (i ==1) {
                numeroMenor = numeroIngresado;
            }
            if (numeroIngresado < numeroMenor) {
                numeroMenor = numeroIngresado;
            }
        }
        if (numeroMenor < 10) {
            System.out.println("El menor número ingresado (" + numeroMenor + ") es menor que 10!");
        }else{
            System.out.println("El menor número ingresado (" + numeroMenor + ") es igual o mayor que 10!");
        }
        entrada.close();
    }
}