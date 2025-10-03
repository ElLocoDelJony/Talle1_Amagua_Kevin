import java.util.Scanner;

public class for_bucle {
    public static void main(String[] args) {
        int x;
        Scanner tabla = new Scanner(System.in);

        System.out.print("Ingrese numero para la tabla de multiplicar: ");
        x = tabla.nextInt();

        for(int i=0; i<=10; i++){
            System.out.println(x+" * "+i+" = "+(x*i));
        }
    }
}
