import java.util.Scanner;

public class IdealWeight {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);
        String gender;
        float height;

        System.out.println("<---------- El peso Ideal ---------->");
        System.out.println("Introduce tu género 'H' para Hombre , ó 'M' para mujer");
        gender = sc.nextLine();
        gender = gender.toUpperCase();
        System.out.println("Introduce tu altura (CM)");
        height = sc.nextFloat();        

        if(gender.equals("H") ){
            System.out.println("El peso ideal es: " + (height-110) + "kg.");
        }else if(gender.equals("M")){
            System.out.println("El peso ideal es: " + (height-120) + "kg.");
        }else{
            System.out.println("La opcion ingresada es errónea");
        }
        sc.close();
        
    }
}
