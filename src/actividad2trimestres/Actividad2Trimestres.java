/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2trimestres;
import java.util.Scanner;
/**
 *
 * @author Johnny Reveles
 */
public class Actividad2Trimestres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Tercer ejercicio");
        // CREAR UN MÉTODO QUE LEA UN VALOR ENTERO DEL 1 AL 12, VALIDE EL VALOR Y NOS DIGA EN QUE TRIMESTRE DEL AÑO NOS ENCONTRAMOS.
    
    int valor = 0;
    
    
    Scanner miConsola = new Scanner(System.in);
    
    System.out.println("Escribe un número entero del 1 al 12: ");
    valor = miConsola.nextInt();
    
    if (valor > 0 && valor < 4) {
    System.out.println("Estás en el Primer Trimestre");
    
    } else {
    if (valor > 3 && valor < 7) {
    System.out.println("Estás en el Segundo Trimestre");
    
    } else {
    if (valor > 6 && valor < 10) {
    System.out.println("Estás en el Tercer Trimestre");
    
    } else {
    if (valor > 9 && valor < 13) {
    System.out.println("Estás en el Cuarto Trimestre");
    
    } else {
    System.out.println("Lo sentimos, es un número incorrecto");   
    }
    
    }
    
    }
    
    }

    }

    }
    

