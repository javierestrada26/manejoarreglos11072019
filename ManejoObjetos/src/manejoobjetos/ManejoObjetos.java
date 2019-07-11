package manejoobjetos;

import institucion.Paralelo;
import institucion.Docente;

/**
 *
 * @author SALAS
 */
public class ManejoObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Docente d = new Docente();
        d.estableceNombre("Rodrigo");
        d.establecerAniosExp(10);
        d.establecerEdad(21);
        
        Docente d2 = new Docente();
        d2.estableceNombre("Santiago");
        d2.establecerAniosExp(15);
        d2.establecerEdad(20);
        
        Paralelo a1 = new Paralelo();

        a1.establecerNombre("Programacion");
        a1.establecerhorario("Viernes 8-11");
        a1.establecerCreditos(4);
        a1.estableceDocente(d);

        Paralelo a2 = new Paralelo();
        a2.establecerNombre("Bases de datos ");
        a2.establecerhorario("Jueves  10-13");
        a2.establecerCreditos(3);
        a2.estableceDocente(d2);

        Paralelo[] lista = new Paralelo[2];
        lista[0] = a1;
        lista[1] = a2;

        for (int i = 0; i < lista.length; i++) {
            System.out.printf("Asignatura; %s\nDocente:\n\tNombre: %s\n\tEdad:"
                    + "%d\n", 
                    lista[i].obtenerNombre(),
                    lista [i].obtenerDocente().obtenerNombre(),
                    lista[i].obtenerDocente().obtenerEdad());
        }
        
       /** for (int i = 0; i < lista.length; i++) {
            Paralelo a = lista [i];
            
            System.out.printf("Asignatura; %s\nDocente:\n\tNombre: %s\n\tEdad:"
                    + "%d\n", 
                   a.obtenerNombre(),
                   a.obtenerDocente().obtenerNombre(),
                   a.obtenerDocente().obtenerEdad());
        }*/
        
        
    }

}
