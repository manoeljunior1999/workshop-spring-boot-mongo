package com.manoeljunior.workshopmongo.services.exception;


public class ObjectNotFoundException extends RuntimeException { //Fazer uma classe auxiliar para tratar a excessão//
	private static final long serialVersionUID = 1L; 
	
	public ObjectNotFoundException(String msg) {
		super(msg);
	}
}
