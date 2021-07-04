import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
    
        System.out.println(number());
    }

    /* Programa que lee por teclado un numero y muestra el doble y el triple del mismo. */

    public static String number(){
        var sc = new Scanner(System.in);
        System.out.println("Escribe un numero entero: ");
        int number = sc.nextInt();        
        
        String result = "El numero es: " + number + ", El doble es: " + number*2 + ",100 El triple es: " + number*3 ;
        sc.close();
        return result;

    }
}


