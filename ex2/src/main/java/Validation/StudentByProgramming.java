package Validation;

import java.util.Set;

import org.springframework.stereotype.Service;

import ir.freeland.spring.validator.Input;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
@Service
public class StudentByProgramming {
	  private Validator validator;

	  public StudentByProgramming(Validator validator) {
	    this.validator = validator;
	  }

	  public void validateInput(StudentByAnnotation s) {
	    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	    Validator validator = factory.getValidator();
	    Set<ConstraintViolation<StudentByAnnotation>> violations = validator.validate(s);
	    if (!violations.isEmpty()) {
	      throw new ConstraintViolationException(violations);
	    }
	  }

	  public void validateInputWithInjectedValidator(StudentByAnnotation s) {
	    Set<ConstraintViolation<StudentByAnnotation>> violations = validator.validate(s);
	    if (!violations.isEmpty()) {
	      throw new ConstraintViolationException(violations);
	    }
	  }

}
