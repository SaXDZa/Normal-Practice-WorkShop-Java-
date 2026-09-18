import java.util.Scanner;

public class Funciones {
    Scanner sc = new Scanner(System.in); // Creo el lector
    void punto1y2(){

        System.out.println("Please, Enter the name"); //Se pide un dato al usuario

        String name = sc.nextLine(); //Leo el nombre con nextLine() y me retorna un string del dato

        System.out.println("Please, Enter the last name"); //Pido otro dato al usuario

        String lastname = sc.nextLine(); //Leo el last name con nextLine() y me retorna un string del dato

        System.out.println("Welcome" + " " + name + " " + lastname);


    }
    void punto3(){ //Dar un numero y que arroje el cuadrado

        System.out.println("Ingresa un numero"); //Pido un dato ("Numero) al usuario

        double numero = sc.nextDouble();

        System.out.println("El cuadrado del numero es" + "=" + numero * numero);

    }
    void point4(){

    }
}
