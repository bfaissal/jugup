/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moroccojug.jugup.registration.boundary;

import java.io.Serializable;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.moroccojug.jugup.registration.entity.User;

/**
 *
 * @author faissalboutaounte
 */
public class LoginManager implements Serializable {
    @Inject
    User user;
    
    @PersistenceContext
    EntityManager em;
    
    public String login(){
        return null;
    }
    
    public void cancel(){
        
    }
}
