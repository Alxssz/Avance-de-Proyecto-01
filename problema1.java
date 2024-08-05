import java.util.Scanner;
/**

/* Esta clase fue creada para calcular el promedio 
de 5 calificaciones de un estudiante
Esta clase se encarga de calcular el promedio.
 * @author Eddy Ruiz
 * @since 30-07-2024
*/
public class problema1 {
/**
    * Metodo principal del calculo del promedio
    * @param args parametros introducidos para iniciar programa 
    * @since 30-07-2024
        */
public static void main (String[]args){

// Se declara la variable Scan para obtener datos de la linea//
    Scanner scan= new Scanner (System.in);

//se obtienen las calificaciones del estudiante 
    int nota1 = scan.nextInt();
    int nota2 = scan.nextInt();
    int nota3 = scan.nextInt();
    int nota4 = scan.nextInt();
    int nota5 = scan.nextInt();

//se imprime el promedio de las notas 
    int resultado = (nota1 + nota2 +nota3 +nota4 +nota5 )/5;
System.out.println (resultado);
    }
}