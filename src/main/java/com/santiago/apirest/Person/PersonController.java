package com.santiago.apirest.Person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/persona")
    public List <Person> listarPerson(){
        return personService.listarPerson();
    }


    @PostMapping("/persona")
    @ResponseBody
    public void createPersona(@RequestBody Person person){
        personService.createPersona(person);
    }

    @DeleteMapping("/persona/{id}")
    public void borrarPerson(@PathVariable Integer id){
        personService.borrarPerson(id);
    }

    @GetMapping("/persona/{id}")
    public Person buscarPersonPorId(@PathVariable Integer id){
        return personService.buscarPersonPorId(id);
    }

    @PutMapping("/persona")
    public void modificarPerson(@RequestBody Person person){
        personService.modificarPerson(person);
    }

    @PostMapping("/login")
    public PersonDTO login (@RequestBody Person person){
        return personService.login(person.getUser(), person.getPassword());
    }
}
