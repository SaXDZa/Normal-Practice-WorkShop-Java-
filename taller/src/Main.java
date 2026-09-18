//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main
{
    void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); // Creo el lector

        System.out.println("Please, Enter the name"); //Se pide un dato al usuario

        String name = sc.nextLine(); //Leo el nombre con nextLine() y me retorna un string del dato

        System.out.println("Please, Enter the last name"); //Pido otro dato al usuario

        String lastname = sc.nextLine(); //Leo el last name con nextLine() y me retorna un string del dato

        System.out.println("Welcome" + " " + name + " " + lastname);


    }
}

