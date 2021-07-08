package com.ejercicio2.app;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Estructura if");
        System.out.print( "Ingresa un numero: " );
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        if (numero == 47)
        {
            System.out.print("Estamos en el grupo 47.");
        } else if (numero == 77)
        {
            System.out.print("Estamos en el grupo 77.");
        } else if (numero == 17)
        {
            System.out.println("Estamos en el grupo 17.");
        } else 
        {
            System.out.printf("Estamos en el grupo %d\n", numero);
        }

        System.out.printf("\nCiclo while (switch)\n");

        boolean band = true;
        int contador = 0;
        
        while (band){

            if (contador == 5)1
            {
                band = false;
            }
            contador += 1;
            
            System.out.printf("\nIngrese un numero: ");
            numero = input.nextInt();
            switch (numero)
            {
                case 47:
                    System.out.print("Estamos en el grupo 47");
                    break;
                case 77:
                    System.out.print("Estamos en el grupo 77");
                    break;
                case 17:
                    System.out.print("Estamos en el grupo 17");
                    break;
                default:
                    System.out.printf("Estamos en el grupo %d", numero);
            }


        }

        System.out.printf("\nciclo do-while\n");
        band = false;

        do {

            if (contador == 5)
            {
                band = false;
            }
            contador += 1;
            
            System.out.printf("\nIngrese un numero: ");
            numero = input.nextInt();
            switch (numero)
            {
                case 47:
                    System.out.print("Estamos en el grupo 47");
                    break;
                case 77:
                    System.out.print("Estamos en el grupo 77");
                    break;
                case 17:
                    System.out.print("Estamos en el grupo 17");
                    break;
                default:
                    System.out.printf("Estamos en el grupo %d", numero);
            }


        }while (band);



        input.close();

    }
}
