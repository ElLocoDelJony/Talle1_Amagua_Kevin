import java.util.Scanner;

public class switch_bucle {
    public static void main(String[] args) {
        Scanner casos = new Scanner(System.in);
        String letra="";

        System.out.println("Ingrese su letra A,B,C,D: ");
        letra=casos.nextLine();
        letra = letra.toLowerCase();
        switch(letra){
            case "a":System.out.print("Excelente");
            break;
            case "b":System.out.print("Bueno");
            break;
            case "c":System.out.print("Regular");
            break;
            case "d":System.out.print("Insufuciente");
            break;
            default:System.out.print("Opcion no valida");
        }

    }
}
