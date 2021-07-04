import java.util.Scanner;

public class Division {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        float num1 , num2;

        System.out.println("Escribe un numero Entero: ");
        num1 = sc.nextFloat();
        System.out.println("Dividir en: ");
        num2 = sc.nextFloat();

        System.out.println(num2 != 0 ? "El resultado de dividir " +num1 + " en "+ num2 + " es: " + num1/num2  : "No se puede Dividir por 0");


        sc.close();
    }
}
