package com.hhernaar.jpa.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.hhernaar.jpa.model.PersonModel;
import com.hhernaar.jpa.service.PersonService;
import com.hhernaar.jpa.util.GenericResponse;
import com.hhernaar.jpa.util.Response;
import javassist.NotFoundException;

@RestController
@RequestMapping("/person")
public class PersonController {

  @Autowired
  private PersonService personService;

  @PostMapping
  @ResponseStatus(value = HttpStatus.CREATED)
  public GenericResponse create(@RequestBody PersonModel personModel) {
    return Response.create(personService.createUpdate(personModel));
  }

  @GetMapping
  public List<PersonModel> list() {
    return personService.list();
  }

  @GetMapping("/{id}")
  public PersonModel find(@PathVariable("id") Long id) throws NotFoundException {
    return personService.find(id);
  }

  @PutMapping("/{id}")
  public GenericResponse update(@PathVariable("id") Long id, @RequestBody PersonModel personModel) {
    personModel.setId(id);
    return Response.update(personService.createUpdate(personModel));
  }

  @DeleteMapping("/{id}")
  public GenericResponse delete(@PathVariable("id") Long id) {
    personService.delete(id);
    return Response.delete();
  }

}
