/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moroccojug.jugup.registration.control;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.moroccojug.jugup.registration.entity.User;
import org.moroccojug.jugup.utils.JsfUtils;

/**
 *
 * @author faissalboutaounte
 */
public class RegistrationContstraintValidator implements ConstraintValidator<RegistrationContstraint, User> {
    
    @Override
    public void initialize(RegistrationContstraint constraintAnnotation) {
        
    }
    //@Inject
    //JsfUtils jsfUtils;
    @Override
    public boolean isValid(User value, ConstraintValidatorContext context) {
        if(!value.getPassword().equals(value.getPasswordConfirmation())){
//            jsfUtils.addFacesMessage(null, "ppaswword confirmation");
            return false;
        }
        return true;
    }
}
