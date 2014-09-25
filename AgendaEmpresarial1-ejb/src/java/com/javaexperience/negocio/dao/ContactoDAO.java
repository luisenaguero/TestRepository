/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaexperience.negocio.dao;

import com.javaexperience.negocio.entidades.Contacto;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author luis.aguero
 */
@Stateless
@LocalBean
public class ContactoDAO {

    @PersistenceContext(unitName = "AgendaPU")
    private EntityManager entityManager;

    public Contacto guardarContacto(Contacto contacto) {
        entityManager.persist(contacto);
        return contacto;
    }

    public Contacto modificarContacto(Contacto contacto) {
        entityManager.merge(contacto);
        return contacto;
    }

    public boolean eliminarContacto(Contacto contacto) {
        entityManager.remove(entityManager.getReference(Contacto.class, contacto.getId()));
        return true;
    }

    public List<Contacto> buscarTodos() {
        Query query = entityManager.createNamedQuery(Contacto.BUSCAR_TODOS, Contacto.class);
        return query.getResultList();
    }
}
