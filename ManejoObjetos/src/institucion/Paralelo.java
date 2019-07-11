
package institucion;

/**
 *
 * @author SALAS
 */
public class Paralelo {
    private String nombre;
    private String horario;
    private int creditos;
    private Docente docente;
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerhorario(String n){
        horario = n;
    }
    
    public void establecerCreditos(int n){
        creditos = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerhorario(){
       return horario;
    }
    
    public int obtenercredito(){
        return creditos;
    }
      public void estableceDocente(Docente n){
        docente = n;
    }
      
       
     public Docente obtenerDocente(){
        return docente;
    }
    
    
}
