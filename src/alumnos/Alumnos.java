package alumnos;
import alumno.Alumno;
import java.util.Scanner;

/**
 *
 * @author Nicolás Moreno
 * @version 1.0
 */
public class Alumnos {

    /**
     *
     * @param args
     * @param escala
     */
    public static void main(String[] args, java.lang.Integer escala) {
    Scanner entrada = new Scanner(System.in);
    
    Alumno[] IstAlumnos = new Alumno[5];
    
    

    String nombreIntroducido;
    double notaIntroducida;

        introduceNotas(IstAlumnos, entrada);
    
    
  
    double  sumaDeMedias = 0;
  
        sumaDeMedias = muestraResultados(IstAlumnos, sumaDeMedias); 
    System.out.println("La media global de la clase es " + sumaDeMedias / 5);
  
  }

    /**
     *
     * @param IstAlumnos
     * @param sumaDeMedias
     * @return sumaDeMedias
     */
    public static double muestraResultados(Alumno[] IstAlumnos, double sumaDeMedias) {
        System.out.println("Los datos introducidos son los siguientes:");
        for(int i = 0; i < 5; i++) {
            System.out.println("Alumno " + i);
            System.out.println("Nombre: " + IstAlumnos[i].getNombre());
            System.out.println("Nota media: " + IstAlumnos[i].getNotaMedia());
            System.out.println("----------------------------");
            sumaDeMedias += IstAlumnos[i].getNotaMedia();
        }   return sumaDeMedias;
    }

    /**
     *
     * @param IstAlumnos
     * @param entrada
     * @throws NumberFormatException
     */
    public static void introduceNotas(Alumno[] IstAlumnos, Scanner entrada) throws NumberFormatException {
        String nombreIntroducido;
        double notaIntroducida;
        System.out.println("A continuacion debera introducir el nombre y la nota media de 5 alumnos.");
        for (int i = 0; i < 5; i++) {
            
            IstAlumnos[i] = new Alumno();
            System.out.println("Alumno " + i);
            System.out.print("Nombre: ");
            nombreIntroducido = entrada.nextLine();
            //(alum[i]).nombre = nombreIntroducido;
            System.out.print("Nota media: ");
            notaIntroducida = Double.parseDouble(entrada.nextLine());
            //alum[i].notaMedia = notaIntroducida;
            
            IstAlumnos[i].AsignarNota(nombreIntroducido, notaIntroducida);
            
        }
    }
}

