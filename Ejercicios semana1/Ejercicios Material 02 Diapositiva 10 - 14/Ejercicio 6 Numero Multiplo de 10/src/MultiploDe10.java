import java.util.Scanner;

public class MultiploDe10 {
    public static void main(String[] args) {
    var sc = new Scanner(System.in);

    System.out.println("Introduce un numero entero: ");
    long number = sc.nextLong();
    System.out.println(number%10 == 0 ?  "El numero "+ number+ " es multiplo de 10" : number + " no es multiplo de 10.");
    sc.close();
    }
}
