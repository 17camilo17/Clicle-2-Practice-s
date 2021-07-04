import java.util.Scanner;

public class KilometrosAmetros {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        float  kmh, meters, seconds;
        
        System.out.println("Ingresa los kilómetros: ");
        kmh = sc.nextFloat();
        meters = 1000/kmh ; 
        seconds = 60 * 60;
        System.out.println(kmh+ " kilometros/h, equivalen a "+ meters + " metros con " + seconds+ " segundos.");
        sc.close();
    }
}
