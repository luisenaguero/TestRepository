/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaexperience.negocio.entidades;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis.aguero
 */
@Named(value = "agenda")
@SessionScoped
public class AgendaController implements Serializable {
    
 
    private Contacto contacto = new Contacto();
    private Contacto contactoSeleccionado = new Contacto();
    private List<Contacto> listaContactos = new ArrayList<>();
    
    
    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Contacto getContactoSeleccionado() {
        return contactoSeleccionado;
    }

    public void setContactoSeleccionado(Contacto contactoSeleccionado) {
        this.contactoSeleccionado = contactoSeleccionado;
    }

    public List<Contacto> getListaContactos() {
        return listaContactos;
    }
      
    public void setListaContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }
    
    public void prepararCrearContacto(){
        contacto = new Contacto();
     }
    
    public void agregarContacto(){
      listaContactos.add(contacto);
    }
    
    public void actualizarContacto(){
      
    }
    
    public void eliminarContacto(){
       listaContactos.remove(contactoSeleccionado);
    }
    /**
     * Creates a new instance of AgendaController
     */
   

    
   
    
    
    public AgendaController() {
    }
    
}
