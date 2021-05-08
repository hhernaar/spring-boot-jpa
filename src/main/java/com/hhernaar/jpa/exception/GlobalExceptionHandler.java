package com.hhernaar.jpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.hhernaar.jpa.util.GenericResponse;
import com.hhernaar.jpa.util.Response;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(NotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  public GenericResponse notFoundException(NotFoundException ex) {
    return Response.error(ex.getMessage());
  }

  @ExceptionHandler(Exception.class)
  @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
  public GenericResponse exception(Exception ex) {
    return Response.error();
  }

}
