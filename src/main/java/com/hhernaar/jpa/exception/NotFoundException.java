package com.hhernaar.jpa.exception;


public class NotFoundException extends Exception {
  private static final long serialVersionUID = 1L;

  public NotFoundException() {
    super();
  }

  public NotFoundException(String msg) {
    super(msg);
  }

}
