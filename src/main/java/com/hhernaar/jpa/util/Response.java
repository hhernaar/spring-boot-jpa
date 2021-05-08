package com.hhernaar.jpa.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Response {

  private String CREATE_MSG = "El registo se creo correctamente.";
  private String UPDATE_MSG = "Registro actualizado con \u00e9xito.";
  private String DELETE_MSG = "Se elimino correctamente el registro.";
  private String GENERIC_ERROR = "Ops! error no controlado.";

  public GenericResponse create(Object data) {
    return new GenericResponse(CREATE_MSG, data);
  }

  public GenericResponse update(Object data) {
    return new GenericResponse(UPDATE_MSG, data);
  }

  public GenericResponse delete() {
    return new GenericResponse(DELETE_MSG);
  }

  public GenericResponse error(String msg) {
    return new GenericResponse(msg);
  }

  public GenericResponse error() {
    return new GenericResponse(GENERIC_ERROR);
  }

}
