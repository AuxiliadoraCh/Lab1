/*Realiza un programa el cual despliegue un menú indicando las siguientes opciones: sumar, restar, multiplicar, dividir, y salir.

El usuario al escoger una opción podrá ingresar dos números y el programa deberá devolverle el resultado y
 volver a desplegar el menú hasta que este decida terminar con la opción de ‘salir’. */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        int opcion, num1 = 0, num2 = 0;

        do {
            System.out.println("-----------------------");
            System.out.println("Seleccione una opción: ");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            opcion = scanner.nextInt();

            if (opcion !=5 ){
                System.out.println("Ingrese el primer numero: ");
                num1 = scanner.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                num2 = scanner.nextInt();
            }


            switch (opcion) {
                case 1:
                    System.out.print("La suma es:");
                    System.out.println(suma(num1, num2));
                    break;
                case 2:
                    System.out.print("La resta es:");
                    System.out.println(resta(num1, num2));
                    break;
                case 3:
                    System.out.print("La multiplicacion es:");
                    System.out.println(multi(num1, num2));
                    break;
                case 4:
                    System.out.print("La division es:");
                    System.out.println(division(num1, num2));
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora");
                    break;
                default:
                    System.out.println("La opcion no exite");
                    break;
            }

        } while (opcion != 5);

    }
    public static int suma(int a, int b) {
        return a + b;
    }
    public static int resta(int a, int b) {
        return a - b;
    }
    public static int multi(int a, int b) {
        return a * b;
    }
    public static int division(int a, int b) {
        return a / b;
    }
}