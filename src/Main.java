import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre = "";
        String primerApellido = "";
        String genero = "";
        int edad = 0;

        Scanner dato = new Scanner(System.in);

        System.out.print(" Ingrese su Nombre: ");
        nombre = dato.nextLine();

        System.out.print(" Ingrese su PrimeApellido: ");
        primerApellido = dato.nextLine();

        System.out.print(" Ingrese su Genero (Masculino - Femenino): ");
        genero = dato.nextLine();

        System.out.print(" Ingrese su Edad: ");
        edad = dato.nextInt();

        System.out.println("* Nombre: " + nombre);
        System.out.println("* Primer Apellido: " + primerApellido);
        System.out.println("* Ingrese su Genero: " + genero);
        System.out.println("* Edad: " + edad);
    }
}
