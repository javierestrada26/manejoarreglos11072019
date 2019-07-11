/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion;

/**
 *
 * @author SALAS
 */
public class Clase {
    private String nombre;
    private Paralelo[] lista;
    
     public void estableceNombre(String n){
        nombre = n;
    }
    
     public String obtenerNombre(){
        return nombre;
    }
     
     public void establecerClase(Paralelo [] k){
       lista = k;
    }
    
     public Paralelo obtenerClase(){
        return lista;
    }
}
