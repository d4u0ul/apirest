package com.polipfc.apirestese.api.exceptionhandler;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.polipfc.apirestese.domain.exception.NegocioException;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler{
	
	@Autowired
	private MessageSource messageSource; 
	
	@ExceptionHandler(NegocioException.class)
	public ResponseEntity<Object> handleNegocio(NegocioException ex, WebRequest request) {
		var status = HttpStatus.BAD_REQUEST;
		
		var problema = new Problema();
		problema.setStatus(status.value());
		problema.setTitulo(ex.getMessage());
		problema.setDataHora(OffsetDateTime.now());
		
		return handleExceptionInternal(ex, problema, new HttpHeaders(), status, request);
	}
	
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		var campos = new ArrayList<Problema.Campo>();
		for (ObjectError error : ex.getBindingResult().getAllErrors()) {
			String nome = ((FieldError) error).getField();
			String mensagem= messageSource.getMessage(error , LocaleContextHolder.getLocale()); //getlocale vem de java.util.Locale.getDefault() e pega a localiza????o da linguagem, onde a jvm est?? rodando a api pode ser usada em v??rias l??nguas diferentes.
			
			campos.add(new Problema.Campo(nome ,mensagem));
		}
		
		
		var problema = new Problema();
		problema.setStatus(status.value());
		problema.setTitulo("Um ou mais campos est??o inv??lidos. fa??a o preenchimento correto e tente novamente");
		problema.setDataHora(OffsetDateTime .now());
		problema.setCampos(campos);
		
		return super.handleExceptionInternal(ex, problema, headers, status, request);
	}
	
	
	
	
}































































