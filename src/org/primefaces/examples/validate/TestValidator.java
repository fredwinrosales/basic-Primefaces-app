package org.primefaces.examples.validate;

import org.primefaces.validate.ClientValidator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import java.util.Map;

@FacesValidator("custom.testValidator")
public class TestValidator implements Validator, ClientValidator {
    public TestValidator() {

    }
    public void validate(FacesContext context, UIComponent component, Object value)
            throws ValidatorException {
        if(value == null) {
            return;
        }
        throw new ValidatorException(new
                FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Validation Error Campo 2",
                    value + " is a error;"
                )
        );
    }
    public Map<String, Object> getMetadata() {
        return null;
    }
    public String getValidatorId() {
        return "custom.testValidator";
    }
}
