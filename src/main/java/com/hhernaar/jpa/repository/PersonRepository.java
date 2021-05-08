package com.hhernaar.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import com.hhernaar.jpa.model.PersonModel;

public interface PersonRepository extends CrudRepository<PersonModel, Long> {

}
