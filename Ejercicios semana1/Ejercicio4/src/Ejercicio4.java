import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
      /* Calcular centigrados a farenheit */  
      System.out.println(calculate());
    }

    public static String calculate(){
        var sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de grado a Convertir a Fahrenheit: ");
        float grados = sc.nextFloat();
        
        float formule = 32 + (9*grados/5);
        sc.close();
        return (grados) + " Grados Centigrados, equevalen a: " + formule + " Fahrenheit." ;
        

    }

}
