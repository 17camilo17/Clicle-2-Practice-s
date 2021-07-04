import java.util.Scanner;

public class IsCapitalize {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        char char1 ;
        String char1string, isupper;

        System.out.println("Escribe un carcter: ");
        char1 = sc.next().charAt(0);
        char1string = String.valueOf(char1);
        isupper = char1string.toUpperCase();

        System.out.println(char1string == isupper ? "La letra " + char1 + " esta en mayúscula. " : "la letra "+ char1+" esta en minúscula." );

        System.out.println(isupper);

        











        sc.close();
    }
}
