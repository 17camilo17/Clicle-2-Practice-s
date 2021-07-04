import java.util.Scanner;

public class CalcularIva {
    public static void main(String[] args){
        var sc = new Scanner(System.in);
        float price, iva, amount, total;

        System.out.println("Ingrese el valor del artículo (sin IVA). ");
        price = sc.nextFloat();
        System.out.println("Cantidad de articulos vendidos?: ");
        amount = sc.nextFloat();
        System.out.println("Valor de IVA: ");
        iva = sc.nextFloat();       
    
        total = price * amount + (iva *price * amount )/100;

        System.out.println("Valor unitario: " + price);
        System.out.println("Cantidad de Artículos: " + amount);
        System.out.println("IVA: " + iva);
        System.out.println("Total compra: " + total);
        sc.close();
        
    }
}
