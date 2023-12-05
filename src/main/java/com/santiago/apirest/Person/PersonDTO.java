package com.santiago.apirest.Person;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class PersonDTO {
    private Integer id;
    private String name;
    private String lastName;
    
    public PersonDTO() {}

    public PersonDTO(Integer id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }


    
}
