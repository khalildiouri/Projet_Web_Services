package com.upem.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.upem.bibliotheque.beans.Book;


public class BookValid implements Validator{


	@Override
	public boolean supports(Class clazz) {
		
		return Book.class.isAssignableFrom(clazz);
	}
	@Override
	public void validate(Object target, Errors errors) {
		Book b =(Book)target;
		ValidationUtils.rejectIfEmpty(errors, "isbn","isbn.empty", "champs Isbn est obligatoire !");
		ValidationUtils.rejectIfEmpty(errors, "title","title.empty", "champs Titre est obligatoire !");
		ValidationUtils.rejectIfEmpty(errors, "author","author.empty", "champs author est obligatoire!");

		ValidationUtils.rejectIfEmpty(errors, "category","category.empty", "champs Prix est obligatoire!");
		ValidationUtils.rejectIfEmpty(errors, "description","description.empty", "champs Description est obligatoire!");
		if(!(b.getPrice()>0)){
        	errors.rejectValue("price", "price", "prix doit être > 0");
        }
		if(!(b.getCopy_number()>1)){
        	errors.rejectValue("copy_number", "copy_number", "au moins une copie ");
        }
		
		
	}
	}