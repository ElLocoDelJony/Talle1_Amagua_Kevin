import java.util.Scanner;

public class while_bucle {
    public static void main(String[] args) {
        int x=0;
        Scanner validar = new Scanner(System.in);
        while(x<=4){
            System.out.println(x);
            x+=1;
        }

        String contraseña="hola";
        String log_pass="";
        while (!log_pass.equals(contraseña)){
            System.out.print("Introduzca su contraseña: ");
            log_pass=validar.nextLine();
        }
    }
}
