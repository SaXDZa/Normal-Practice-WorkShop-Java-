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
    static int point2Sumar(int n){//Suma de los números del 1 al N
        if(n == 1){
            return 1;
        }
            int resultado = point2Sumar (n-1) + n;
            return resultado;

        }
    static int point1Factorial(int n){
        if(n == 0){
            return 1;
        }
        int resultado = point1Factorial (n-1) * n;
        return resultado;
    }
    static int point3Potencia(int base, int exponente){
        if (exponente == 0) {
            return 1;
        }
        return base * point3Potencia(base,exponente - 1);
    }
    static int point4contar(int n) {
        if (n < 10) {
            return 1;
        }
        int cuentahastaelMomento = 1 + point4contar(n / 10);
        return cuentahastaelMomento;
    }
    static String point5InvertirCadena(String cadena){
        if cadena.length() <= 1 {
                return cadena:
    }
        return point5InvertirCadena(cadena.substring(1 + ))
}
