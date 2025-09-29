import java.util.Scanner;

public class ingresos {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = ingreso.nextLine();

        System.out.print("Ingrese su edad ");
        int edad = ingreso.nextInt();

        System.out.println("Hola " + nombre + " tu edad es: " + edad);
    }
}
