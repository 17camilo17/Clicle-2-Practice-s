import java.util.Scanner;
public class NumerodeSuerte {
    public static void main(String[] args){

        /* software que calcula el numero de la suerte sumando el dia, el me, 
        y el año de nacimiento y despues sumando cada cifra de este resultado: */

        var sc = new Scanner(System.in);
        System.out.println("ingresa la fecha de nacimiento: ");
        int day, month, year, amount, figure1, figure2, figure3, figure4, luckynumber;

        System.out.println("Dia: ");
        day = sc.nextInt();

        System.out.println("Mes: ");
        month = sc.nextInt();

        System.out.println("Año: ");
        year = sc.nextInt();

        amount = day + month + year;

        figure1 = amount/1000;
        figure2 = amount/100%10;
        figure3 = amount/10%10;
        figure4 = amount%10;

        luckynumber = figure1 + figure2 + figure3 + figure4;

        System.out.println("El numero de la suerte para la fecha " + day +" / "+ month+" / "+ year+ " es: "+ luckynumber);

        sc.close();
    }
}
