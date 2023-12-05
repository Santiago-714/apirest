package com.santiago.apirest.Person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepo;

    public Person createPersona(Person person) {
        return personRepo.save(person);
    }

    public void borrarPerson(Integer id) {
        personRepo.deleteById(id);
    }

    public List<Person> listarPerson(){
        return personRepo.findAll();
    }

    public Person buscarPersonPorId(Integer id) {
        return personRepo.findById(id).orElse(null);
    }

    public void modificarPerson(Person person) {
        personRepo.save(person);
    }

    public PersonDTO login(String user, String password){
        Person person = personRepo.findByUserAndPassword(user, password);
        PersonDTO personDTO = new PersonDTO(person.getId(), person.getName(), person.getLastName());
        return personDTO;
    }
}
