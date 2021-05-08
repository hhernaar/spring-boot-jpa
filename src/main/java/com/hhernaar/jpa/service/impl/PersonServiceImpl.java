package com.hhernaar.jpa.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hhernaar.jpa.exception.NotFoundException;
import com.hhernaar.jpa.model.PersonModel;
import com.hhernaar.jpa.repository.PersonRepository;
import com.hhernaar.jpa.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

  @Autowired
  private PersonRepository personRepository;

  @Override
  public PersonModel createUpdate(PersonModel personModel) {
    return personRepository.save(personModel);
  }

  @Override
  public PersonModel find(Long id) throws NotFoundException {
    Optional<PersonModel> person = personRepository.findById(id);
    if (!person.isPresent()) {
      throw new NotFoundException("Person not found");
    }
    return person.get();
  }

  @Override
  public List<PersonModel> list() {
    List<PersonModel> persons = new ArrayList<>();
    personRepository.findAll().forEach(persons::add);
    return persons;
  }

  @Override
  public void delete(Long id) {
    personRepository.deleteById(id);
  }

}
