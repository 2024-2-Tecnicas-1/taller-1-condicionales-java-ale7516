
package ejercicios;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Ordenamiento {
    public static String evaluar(int numero1, int numero2, int numero3, int numero4) {
     int []numeros = {numero1, numero2, numero3, numero4};
        int n = numeros.length;
        boolean intercambio;
        do{
            intercambio = false;
            for (int i=0; i< n-1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    int temp = numeros [i];
                    numeros [i] = numeros[i+1];
                    numeros [i+1] = temp;
                    intercambio = true;
                }    
            }
        } while (intercambio);
        StringBuilder respuesta = new StringBuilder();
        for (int i = 0; i<n ; i++) {
            respuesta.append(numeros[i]);
            if (i<n-1){
                respuesta.append(" ");
            }
        }
       return respuesta.toString();
    } 
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Número 1:");
        int numero1 = lector.nextInt();
        System.out.print("Número 2:");
        int numero2 = lector.nextInt();
        System.out.print("Número 3:");
        int numero3 = lector.nextInt();
        System.out.print("Número 4:");
        int numero4 = lector.nextInt();
        
        String respuesta = evaluar(numero1, numero2, numero3, numero4);
        System.out.println(respuesta);
    }
}
