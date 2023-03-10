package com.company;
 import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leer = new Scanner(System.in);
        // obtenemos el valor recibido
        int max;
        int i=0,j=0;

        System.out.println("Ingrese el max: ");

        max = leer.nextInt();

        for(i=1;i<=max;i=i+1)
        {
            // Mostramos los asteriscos en cada fila
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
