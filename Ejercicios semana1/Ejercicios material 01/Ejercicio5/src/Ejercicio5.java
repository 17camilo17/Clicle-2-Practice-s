import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
    /* Determina si un numero es par o impar. */ 
        evenodd();
    }
public static void evenodd(){
    var sc = new Scanner(System.in);
    System.out.println("Escribe un numero entero: ");
    int number = sc.nextInt();
    sc.close();
    System.out.println(number%2==0 ? "El numero " + number + " es par" : "El numero " + number + " es impar");
}

}
