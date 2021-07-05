import java.util.Random;
import java.util.Scanner;

public class AleatoryNumber {
    public static void main(String[] args) throws Exception {
        var alnumber = new Random();
        var sc = new Scanner(System.in);
        int number = alnumber.nextInt(100);
        System.out.println(number);
        int choice = 0;

        System.out.println(" ");
        System.out.println("<---------------- Adivina el Numero Oculto Entre 1 & 100 ---------------->");
        
        while (number != choice) {
            System.out.print("Ingresa el numero que creeas que es el Numero Oculto: ");
            choice = sc.nextInt();
            if(number > choice){
                System.out.println("El numero oculto es mayor que " + choice);
            }else{
                System.out.println("El numero oculto es menor que " + choice);
            }
            
        }
        System.out.println("Acertaste!.. El numero oculto es el " + number);
        sc.close();
    }
}
