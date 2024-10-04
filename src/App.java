import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {  
        metodoOrdenamiento mO = new metodoOrdenamiento();

        Scanner scanner = new Scanner(System.in);
        
        int tam =0;
        do { 
            System.out.println("Ingrese el tamanio que sea entero positivo");
            while (!scanner.hasNextInt()) {
                System.out.println("Ingrese un numero entero positivo");
                System.out.println("Ingrese el tamanio que sea entero positivo");
                scanner.next();  // discard the invalid input
            }
            tam = scanner.nextInt();
            if(tam<=0){
                System.out.println("El tamanio debe ser entero");
            }
        } while (tam<=0);
        
        int[] arreglo = new int[tam];

        // int[] arreglo = {5, 8, 9, 3, 0};
        mO.sortBubbleAva(arreglo);
        mO.printArreglo(arreglo);

        scanner.close();
    }
}
