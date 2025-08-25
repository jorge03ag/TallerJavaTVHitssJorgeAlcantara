package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int resultado = 0, numero1, numero2, auxiliar;
        System.out.println("Este programa te permitirá hacer la multiplicación de dos números enteros");
        System.out.print("Ingresa el primer dígito: ");
        numero1 = entrada.nextInt();
        System.out.print("Ingresa el segundo dígito: ");
        numero2 = entrada.nextInt();
        auxiliar = numero2;
        //Con este if se consigue que numero 2 siempre sea positivo para poder entrar al ciclo for sin problemas.
        if (numero2 < 0) {
            numero2 = -numero2;
        }
        //Se realiza la multiplicación mediante sumas sucesivas
        for (int i = 0; i < numero2; i++) {
            resultado += numero1;
        }
        //Con una variable auxiliar se define si el resultado es negativo o positivo
        if (auxiliar < 0) {
            resultado = -resultado;
        }
        System.out.println("El resultado de la multipliación de ambos números es: " + resultado);
        entrada.close();
    }
}