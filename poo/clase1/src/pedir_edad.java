import java.util.Scanner;

public class pedir_edad {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.print("Cual es tu nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Cual es tu edad: ");
        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre + " tu edad es: " + edad);
    }
}

