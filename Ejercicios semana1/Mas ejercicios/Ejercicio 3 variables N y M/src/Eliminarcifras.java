import java.util.Scanner;

public class Eliminarcifras {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        int N, m, figures;

        System.out.println("Ingresa un numero entero: ");
        N = sc.nextInt();
        System.out.println("CUantas cifras deseas Borrar?: ");
        m = sc.nextInt();

        figures = (int)Math.pow(10,m);
        N = N/figures;
        System.out.println("Número modificado " + N);
        sc.close();

        
    }
}
