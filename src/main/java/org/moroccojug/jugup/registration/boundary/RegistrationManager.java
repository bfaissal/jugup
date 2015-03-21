/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moroccojug.jugup.registration.boundary;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.moroccojug.jugup.registration.control.NewConstraint;
import org.moroccojug.jugup.registration.control.RegistrationContstraint;
import org.moroccojug.jugup.registration.entity.User;
import org.moroccojug.jugup.utils.JsfUtils;

/**
 *
 * @author faissalboutaounte
 */
@Named
@RequestScoped
public class RegistrationManager implements Serializable {
    
    User user;
    @Inject
    JsfUtils jsfUtils;
    //@NewConstraint
    String name;
    
    @PostConstruct
    public void init(){
        user = new User();
    }
    
    @PersistenceContext
    EntityManager em;
    @Transactional
    public void save(){
        try{
        System.out.println("??????????????????????????????????? ");
        user.setId(em.merge(user).getId());
        jsfUtils.addFacesMessage(null, "registration.savesuccess.message");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void cancel(){
        
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        System.out.println(" ++++++++++++++++++++++++++++++++++++++++ ");
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
