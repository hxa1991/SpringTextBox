package cap.hxa.com.validator;

import java.util.logging.Logger;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import cap.hxa.com.model.Customer;

public class CustomerValidator implements Validator{
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	@Override
	public boolean supports(Class clazz) {
		// TODO Auto-generated method stub
		LOGGER.info("supports(Class clazz) ");
		return Customer.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		LOGGER.info("validate(Object target, Errors errors ");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName",
				"required.userName", "Field name is required.");
		
		
	}

}
 