/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moroccojug.jugup.registration.control;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author faissalboutaounte
 */
public class NewConstraintValidator implements ConstraintValidator<NewConstraint, String> {
    
    @Override
    public void initialize(NewConstraint constraintAnnotation) {
        
    }
    
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return false;
    }
}
