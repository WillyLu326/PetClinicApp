package guru.framework.petclinic.services;

import guru.framework.petclinic.models.Person;

import java.util.Set;

/**
 * @author zhenglu
 */
public interface PersonService {
    Person findById(Long id);

    Person save(Person person);

    Set<Person> findAll();
}
