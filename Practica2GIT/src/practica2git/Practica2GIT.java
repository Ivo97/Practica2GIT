
package practica2git;
import java.util.Scanner;

/**
 * Este es el código proporcionado para la Practica1.
 *
 * @author Ivaylo
 * @param uf1 es la primera nota que hemos sacado.
 * @param uf2 es la segunda nota que hemos sacado.
 * @param uf3 es la segunda nota que hemos sacado.
 */
public class Practica2GIT {
//declaramos la variables que nos hacen falta

    double uf1, uf2, uf3;
    double acu1, acu2, acu3, def;
    String prueba;
    //utilizames ecaner para poder introducir datos
    Scanner entrada = new Scanner(System.in);

    ///vamos ca crear un metodo para ingresar 
    /**
     * Este es el metodo para ingresar las notas.
     */
    public void IngresaNotas() {
        //cuando ejeuctamos este metodo lo primnero que queremos es que nos 
        //pida notas
        System.out.println("ingrese las notas del estudiante");

        System.out.print("ingrese nota 1: ");

        uf1 = entrada.nextDouble();

        System.out.print("ingrese nota 2: ");

        uf2 = entrada.nextDouble();
        System.out.print("ingrese nota 3: ");

        uf3 = entrada.nextDouble();
    }

    /**
     * Este es el metodo para comprobar si se han introducido correctamenter las
     * notas.
     */
    public void comprobarcion() {
        // metodo para comprobar bien entroduccion de notas

        if (uf1 > 10) {
            System.out.println(" nota1 mal introducida");

        } else {
            System.out.println(" nota1 correcta");
        }

        if (uf2 > 10) {
            System.out.println(" nota2 mal introducida");

        } else {
            System.out.println(" nota2 correcta");
        }
        if (uf3 > 10) {
            System.out.println(" nota3 mal introducida");

        } else {
            System.out.println(" nota3 correcta");
        }

    }

    // metodo para calcular nota
    /**
     * Este es el metodo para calcular las notas.
     */
    public void Calculonotas() {
        acu1 = uf1 * 0.35;
        acu2 = uf2 * 0.35;
        acu3 = uf3 * 0.30;

        def = acu1 + acu2 + acu3;
        //hasta aqui la tenemos calculada peor no la mostramos

    }

    /**
     * Este es el metodo para mostrar las notas por pantalla.
     */
    public void Mostrar() {
        //print ln lo que hace es que al terminar el print baja la linea
        System.out.println(" notas introducidas son:");
        System.out.println(" nota1 = " + uf1);
        System.out.println(" nota2 = " + uf2);
        System.out.println(" nota3 = " + uf3);

        System.out.println(" acumuado 1 = " + acu1);
        System.out.println(" acumuado 2 = " + acu2);
        System.out.println(" acumuado 3 = " + acu3);

        System.out.println(" nota definitiva es = " + def);

    }

    /**
     * Este es el metodo para saber si se ha aprobado o suspendido.
     */
    public void aprobado() {

        if (def < 5 && def >= 0) {
            System.out.println("suspendio");
        } else {
            if (def >= 5 && def <= 10) {
                System.out.println("aprobado");
            } else {
                System.out.println(" error en la notas");
            }
        }
    }
    public static void main(String[] args) {
      // creamos mecanimos para llamar a cualquier metodo fuero de la clase
        Practica2GIT fc = new Practica2GIT();

        fc.IngresaNotas();

        fc.comprobarcion();

        fc.Calculonotas();

        fc.Mostrar();

        fc.aprobado();
    }
    //Esto es una prueba para ver los cambios.
    //Esta es una prueba para ver que se han realizado los cambios en el GIT
     
}
