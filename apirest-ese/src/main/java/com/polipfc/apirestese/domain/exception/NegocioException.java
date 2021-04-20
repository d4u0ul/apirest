package com.polipfc.apirestese.domain.exception;

public class NegocioException extends RuntimeException{
	
	private static final long serialversionUId=1L;
	
	public NegocioException(String mensagem) {
		super(mensagem);
	}

}
