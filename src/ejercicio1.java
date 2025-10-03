import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        String usuario="perro";
        String contraseña="gato";

        Scanner nuevo = new Scanner(System.in);
        System.out.println("Ingrese el usuario: ");
        String log_user = nuevo.nextLine();
        System.out.println("Ingrese la contraseña: ");
        String log_pass = nuevo.nextLine();

        if (usuario.equals(log_user) && contraseña.equals(log_pass)){
            System.out.print("El usuario es correcto");
        }else{
            System.out.print("El usuario no es correcto");
        }



    }
}

