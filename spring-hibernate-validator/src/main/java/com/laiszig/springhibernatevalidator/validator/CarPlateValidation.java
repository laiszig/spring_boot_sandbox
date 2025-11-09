package com.laiszig.springhibernatevalidator.validator;

import com.laiszig.springhibernatevalidator.validator.constraints.CarPlate;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CarPlateValidation implements ConstraintValidator<CarPlate, String> {
    @Override
    public void initialize(CarPlate constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        String carPlate = value == null ? "" : value;
        return carPlate.matches("[a-zA-Z]{3}[0-9][A-Za-z0-9][0-9]{2}");
    }
}
