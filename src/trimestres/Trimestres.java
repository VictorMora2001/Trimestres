/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trimestres;
import java.util.Scanner;
/**
 *
 * @author amigo
 */
public class Trimestres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes;
        String text = null;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número del mes que quiere conocer usando la siguiente numeración (1-Enero, 2-Febrero, etc.)");
        mes = sc.nextInt ();
        
        if (mes > 0 && mes <= 12){
            switch (mes){
                case 1:
                System.out.println("El mes de Enero se encuentra dentro del primer trimestre del año");
                break;
                case 2:
                System.out.println("El mes de Febrero se encuentra dentro del primer trimestre del año");
                break;
                case 3:
                System.out.println("El mes de Marzo se encuentra dentro del primer trimestre del año");
                break;
                case 4:
                System.out.println("El mes de Abril se encuentra dentro del segundo trimestre del año");
                break;
                case 5:
                System.out.println("El mes de Mayo se encuentra dentro del segundo trimestre del año");
                break;
                case 6:
                System.out.println("El mes de Junio se encuentra dentro del segundo trimestre del año");
                break;
                case 7:
                System.out.println("El mes de Julio se encuentra dentro del tercer trimestre del año");
                break;
                case 8:
                System.out.println("El mes de Agosto se encuentra dentro del tercer trimestre del año");
                break;
                case 9:
                System.out.println("El mes de Septiembre se encuentra dentro del tercer trimestre del año");
                break;
                case 10:
                System.out.println("El mes de Octubre se encuentra dentro del cuarto trimestre del año");
                break;
                case 11:
                System.out.println("El mes de Noviembre se encuentra dentro del cuarto trimestre del año");
                break;
                case 12:
                System.out.println("El mes de Diciembre se encuentra dentro del cuarto trimestre del año");
                break;
            }
        }
    }
    
}
