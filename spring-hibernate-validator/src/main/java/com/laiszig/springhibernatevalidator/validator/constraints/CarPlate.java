package com.laiszig.springhibernatevalidator.validator.constraints;

import com.laiszig.springhibernatevalidator.validator.CarPlateValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CarPlateValidation.class)
@Target( {ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CarPlate {

    String message() default "Invalid carPlate";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
