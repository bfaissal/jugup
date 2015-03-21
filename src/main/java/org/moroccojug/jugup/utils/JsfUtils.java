/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moroccojug.jugup.utils;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author faissalboutaounte
 */
@ApplicationScoped
public class JsfUtils {
    public void addFacesMessage(String clientId, String message){
        FacesMessage fmessage  = new FacesMessage(message);
        FacesContext.getCurrentInstance().addMessage(clientId, fmessage);
    }
}
