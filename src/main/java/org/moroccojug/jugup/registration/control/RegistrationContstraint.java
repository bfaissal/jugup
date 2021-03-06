/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.moroccojug.jugup.registration.control;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author faissalboutaounte
 */
@Documented
@Constraint(validatedBy = RegistrationContstraintValidator.class)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface RegistrationContstraint {

    String message() default "{org.moroccojug.jugup.registration.control.RegistrationContstraint}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
