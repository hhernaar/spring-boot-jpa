package com.hhernaar.jpa.service;

import java.util.List;
import com.hhernaar.jpa.model.PersonModel;
import javassist.NotFoundException;


/**
 * Person Service
 * 
 * Basic CRUD to Person
 */
public interface PersonService {

  /**
   * Create/Update new item.
   * 
   * @param personModel The person entity representation {@link PersonModel}
   * @return The new item.
   * @author hhernaar
   */
  public PersonModel createUpdate(PersonModel personModel);


  /**
   * Find person by its id.
   * 
   * @param id The person id
   * @return The indicated item.
   * 
   * @throws NotFoundException If the resource is nor found
   * 
   * @author hhernaar
   */
  public PersonModel find(Long id) throws NotFoundException;


  /**
   * List all persons in repository.
   * 
   * @return List of {@link PersonModel }
   * @author hhernaar
   */
  public List<PersonModel> list();


  /**
   * Delete person by its id.
   * 
   * @param id The person id
   * @author hhernaar
   */
  public void delete(Long id);

}
