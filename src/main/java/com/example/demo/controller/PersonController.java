package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.model.PersonId;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController //handles all incoming http reqs
public class PersonController {


//two methods createPerson and getAllPersons

    //end point post
    //accepts json body and create a unique id
    @PostMapping("/person")
    public ResponseEntity<PersonId> createPerson(@RequestBody Person person){
        PersonId result = new PersonId(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(result);
    }

    //get endpoint
    @GetMapping("/person")
    public List<Person> getAllPersons(){
        List<Person> result = new ArrayList<>();
        result.add(new Person("1",
                "Supi",
                "female"));

        result.add(new Person("2",
                "Tom",
                "male"));

        result.add(new Person("3",
                "Anne",
                "female"));

        return result;
    }
}
