import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        int number;
    
     System.out.println(" ");
     System.out.println("<---------- Tabla De Multiplicar ---------->");
     System.out.print("Ingresa un numero para Imprimir sus multiplos hasta el 10: ");
     number = sc.nextInt();

     for (int i = 0; i <= 10; i++) {
        System.out.println(number + " X " + i + " = " + number*i);
      }
     sc.close();
    }
}
