package br.com.meli.concessionaria.controller.advice;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.concessionaria.dto.ErrorMessageDTO;
import br.com.meli.concessionaria.exceptions.CreateVehicleException;

@ControllerAdvice(annotations = RestController.class)
public class VehicleControllerHandler {
	
	@ExceptionHandler(CreateVehicleException.class)
	public ResponseEntity<ErrorMessageDTO> createVehicleExceptionHandler(Exception e){
		return ResponseEntity.badRequest().body(new ErrorMessageDTO(e.getMessage()));
	}

}
