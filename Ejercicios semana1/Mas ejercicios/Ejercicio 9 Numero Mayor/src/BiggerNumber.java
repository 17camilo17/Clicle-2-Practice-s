import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        int num1,num2,num3;

        System.out.println("<---------- El Numero Mayor ---------->");
        System.out.println("Ingresa el primer numero a Comparar");
        num1 = sc.nextInt();
        System.out.println("Ingresa el Segundo numero a Comparar");
        num2 = sc.nextInt();
        System.out.println("Ingresa el Tercer numero a Comparar");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero " + num1 + " es mayor que "+ num2+ " y que "+ num3);
        }else if (num2 > num3) {
         System.out.println("El numero " + num2 + " es mayor que "+ num1+ " y que "+ num3);            
        }else{
            System.out.println("El numero " + num3 + " es mayor que "+ num1+ " y que "+ num2);
        sc.close();
    }
 }
}
