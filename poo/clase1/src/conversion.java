import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {
        Scanner transformar = new Scanner(System.in);

        System.out.println("Ingrese un numero decimal: ");
        double decimal = transformar.nextDouble();
        int enteroC = (int)decimal;
        System.out.println("Numero convertido de decimal a entero : "+ enteroC);

        System.out.println("Ingresa un numero entero: ");
        int entero = transformar.nextInt();
        double decimalC = entero;
        System.out.println("Numero convertido de entero a decimal : " + decimalC);

    }
}
