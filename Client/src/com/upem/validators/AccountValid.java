package com.upem.validators;

import java.util.Set;





import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.upem.bankservices.Account;

public class AccountValid  implements Validator{


	@Override
	public boolean supports(Class clazz) {
		
		return Account.class.isAssignableFrom(clazz);
	}
	@Override
	public void validate(Object target, Errors errors) {
		Account acocunt =(Account)target;
		ValidationUtils.rejectIfEmpty(errors, "iban","iban.empty", "champs Iban est obligatoire !");
		ValidationUtils.rejectIfEmpty(errors, "number","number.empty", "champs numéro de compte est obligatoire !");
		ValidationUtils.rejectIfEmpty(errors, "expireDate","expireDate.empty", "champs date d'expiration est obligatoire!");
		
      
	}


	public AccountValid() {
		// TODO Auto-generated constructor stub
	}
	

}
