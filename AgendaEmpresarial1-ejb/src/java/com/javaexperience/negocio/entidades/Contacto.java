/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaexperience.negocio.entidades;

import java.util.Objects;

/**
 *
 * @author luis.aguero
 */
public class Contacto {

    private String nombre;
    private String telefonoPrincipal;
    private String telefonoAlternativo;
    private String correoElectronico;
    private String direccion;   
    private String cambio;
    
    
    public String getNombre() {
         return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefonoPrincipal() {
        return telefonoPrincipal;
    }

    public void setTelefonoPrincipal(String telefonoPrincipal) {
        this.telefonoPrincipal = telefonoPrincipal;
    }

    public String getTelefonoAlternativo() {
        return telefonoAlternativo;
    }

    public void setTelefonoAlternativo(String telefonoAlternativo) {
        this.telefonoAlternativo = telefonoAlternativo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
 
    @Override
    public int hashCode(){
    int hash = 5;
    hash = 31 * hash + Objects.hashCode(this.nombre);
    return hash;    
    }
    
    @Override
    public boolean equals(Object obj){
    if(obj == null){
    return false;
    }    
    if(getClass() != obj.getClass()){
    return false;
    }
    
    final Contacto other = (Contacto) obj;
    return Objects.equals(this.nombre, other.nombre);
    
    }
    
}
