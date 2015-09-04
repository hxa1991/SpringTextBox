package cap.hxa.com.controller;


import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import cap.hxa.com.model.Customer;
import cap.hxa.com.validator.CustomerValidator;

@Controller
@RequestMapping("/customer.htm")
public class TextBoxController {
	
	private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	CustomerValidator customerValidator;
	
	@Autowired
	public TextBoxController(CustomerValidator customerValidator){
		this.customerValidator = customerValidator;
		LOGGER.info("Constructor TextBox");
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String processSubmit(@ModelAttribute("customer") Customer customer, BindingResult result, SessionStatus status){
		LOGGER.info("processSubmit");
		customerValidator.validate(customer, result);
		
		if(result.hasErrors()){
			return "CustomerForm" ;
		} else{
			return "CustomerFormSucess";
		}
		
	}
	
	
	
}
