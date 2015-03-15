/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moroccojug.jugup.registration.boundary;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import org.moroccojug.jugup.registration.entity.User;

/**
 *
 * @author faissalboutaounte
 */
@Named
@ViewScoped
public class RegistrationManager implements Serializable {
    @Inject
    User user;
    
    @PostConstruct
    public void init(){
        
    }
    
    @PersistenceContext
    EntityManager em;
    public void save(){
        
    }
    
    public void cancel(){
        
    }
    
}
