import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Digite el numero a :");
        int a = scan.nextInt();
        System.out.print("Digite el numero b :");
        int b = scan.nextInt();

        int suma = a+b;
        int resta = a-b;
        int multiplicacion = a*b;

        System.out.println("El resultado es: " + suma);
        System.out.println("El resultado es: " + resta);
        System.out.println("El resultado es: " + multiplicacion);

        if(b==0) {
            System.out.println("No se puede dividir entre 0");
        } else {
            float division = a/b;
            System.out.println("El resultado de la division es: " + division);
        }



    }
}
