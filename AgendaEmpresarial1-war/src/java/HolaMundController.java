/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author luis.aguero
 */
@Named(value = "holaMundo")
@ViewScoped
public class HolaMundController implements Serializable{

    private String nombre;
    private String saludo;
           
    public void saludar(){
    saludo = "Hola, " + nombre;
    }   
    
    public String getNombre(){
    return nombre;
    }
    
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
    
    public String getSaludo(){
    return saludo;
    }
    
    public void setSaludo(String saludo){
     this.saludo=saludo;
    }  
    
    
    /**
     * Creates a new instance of HolaMundController
     */
   public HolaMundController(){
      }
    
}
