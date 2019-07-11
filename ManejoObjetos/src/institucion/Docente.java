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
public class Docente {
    private int edaddoc;
    private String docente;
    private int anioexp;
    
    public void estableceNombre(String n){
        docente = n;
    }
    
     public String obtenerNombre(){
        return docente;
    }
     
     public void establecerEdad(int n){
        edaddoc = n;
    }
    
     public int obtenerEdad(){
        return edaddoc;
    }
     
     public void establecerAniosExp(int n){
        anioexp = n;
    }
    
     public int obtenerAniosExp(){
        return anioexp;
    }
}
