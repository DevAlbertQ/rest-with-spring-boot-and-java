package br.com.albert.exceptions.hadler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.albert.exceptions.ExceptionResponse;
import br.com.albert.exceptions.UnsupportedMathOperationException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHadler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleAllExceptions(Exception ex,
			WebRequest request){
		
		ExceptionResponse exceptionResp = new ExceptionResponse(new Date(),
				ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(exceptionResp, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(UnsupportedMathOperationException.class)
	public final ResponseEntity<ExceptionResponse> handleBadRequestExceptions(Exception ex,
			WebRequest request){
		
		ExceptionResponse exceptionResp = new ExceptionResponse(new Date(),
				ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(exceptionResp, HttpStatus.BAD_REQUEST);
	}

}
