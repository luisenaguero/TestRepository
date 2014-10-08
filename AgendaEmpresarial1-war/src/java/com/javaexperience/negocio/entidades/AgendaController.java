/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaexperience.negocio.entidades;

import com.javaexperience.negocio.dao.ContactoDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;

/**
 *
 * @author luis.aguero
 */
@Named(value = "agenda")
@ViewScoped
public class AgendaController implements Serializable {

    @Inject
    private ContactoDAO contactoDAO;
    private Contacto contacto = new Contacto();
    private Contacto contactoSeleccionado = new Contacto();
    private List<Contacto> listaContactos = new ArrayList<>();

    @PostConstruct
    private void inicializar() {
        listaContactos = contactoDAO.buscarTodos();
    }

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

    public void prepararCrearContacto() {
        contacto = new Contacto();
    }

    public void agregarContacto() {
        contactoDAO.guardarContacto(contacto);
        listaContactos = contactoDAO.buscarTodos();
    }

    public void actualizarContacto() {
        contactoDAO.modificarContacto(contactoSeleccionado);
        listaContactos = contactoDAO.buscarTodos();
    }

    public void eliminarContacto() {
        contactoDAO.eliminarContacto(contactoSeleccionado);
        listaContactos = contactoDAO.buscarTodos();
    }

    /**
     * Creates a new instance of AgendaController
     */
    public AgendaController() {
    }

}
