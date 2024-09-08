package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {
    public static String evaluar(int numVictoriasA, int numVictoriasB) {
if (numVictoriasA - numVictoriasB == 6) {
            return "Ganó A";
        }
        if (numVictoriasB - numVictoriasA == 6) {
            return "Ganó B";
        }
        if (numVictoriasA == 7 && numVictoriasB == 6) {
            return "Ganó A";
        }
        if (numVictoriasA == 6 && numVictoriasB == 7) {
            return "Ganó B";
        }else if (numVictoriasA == 5 && numVictoriasB == 5) {
            if (numVictoriasA == 7 || numVictoriasB == 7) {
                return "Resultado final: " + Math.max(numVictoriasA, numVictoriasB) + "-6";
            }
        }
        if (numVictoriasA >= 8 || numVictoriasB >= 8) {
            return "Inválido";
        } else {
            if (numVictoriasA >= 6 && numVictoriasA - numVictoriasB == 2) {
                return "Ganó A";
            } else if (numVictoriasB >= 6 && numVictoriasB - numVictoriasA == 2) {
                return "Ganó B";
            }
            if ((Math.abs(numVictoriasA - numVictoriasB) >= 3) || (numVictoriasA >= 8 && numVictoriasB >= 8)) {
                return "Inválido";
            }
        }
        return "Aún no termina";
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();
        
        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
