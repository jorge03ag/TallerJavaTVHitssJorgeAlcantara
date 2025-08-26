package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalMayor = 0, totalMenor = 0, nota1 = 0, i;
        double nota, sumaMayor = 0, sumaMenor = 0;
        for (i = 1; i <= 20; i++) {
            System.out.print("Ingrese la nota " + i + ": ");
            nota = entrada.nextDouble();
            if (nota < 1.0 || nota > 10.0) {
                System.out.println("Nota no valida");
                return;
            } else if (nota >= 6.0) {
                sumaMayor += nota;
                totalMayor++ ;
            } else if (nota == 1.0) {
                nota1++;
                sumaMenor += nota;
                totalMenor++;
            } else {
                sumaMenor += nota;
                totalMenor++ ;
            }
        }
        if (totalMayor == 0) {
            System.out.println("No existieron calificaciones mayores o iguales a 6");
        } else {
            System.out.println(String.format("Promedio de notas mayores o iguales a 6: %.2f", sumaMayor / totalMayor));
        }
        if (totalMenor == 0){
            System.out.println("No existieron calificaciones menores a 6");
        } else {
            System.out.println(String.format("Promedio de notas inferiores a 6: %.2f", sumaMenor / totalMenor));
        }
        System.out.println("Total de notas iguales a 1: " + nota1);
        System.out.println(String.format("Promedio total: %.2f", (sumaMenor + sumaMayor) / (i - 1)));
        entrada.close();
    }
}
