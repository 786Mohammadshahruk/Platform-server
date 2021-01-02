package com.Ugam.PlatformServer.controller;

import com.Ugam.PlatformServer.entity.Person;
import com.Ugam.PlatformServer.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(value = "/addPerson",method = RequestMethod.POST)
    public Person addPerson(@RequestBody Person person) {
        return  personRepository.addPerson(person);
    }

    @RequestMapping(value = "/getPerson",method = RequestMethod.GET)
    public Person getPerson(@RequestParam String personId) {
        return  personRepository.findPersonByPersonId(personId);
    }
    @RequestMapping(value = "/deletePerson",method = RequestMethod.DELETE)
    public String deletePerson(@RequestBody Person person) {
        return  personRepository.DeletePerson(person);
    }
    @RequestMapping(value = "/updatePerson",method = RequestMethod.PUT)
    public String updatePerson(@RequestBody Person person) {
        return  personRepository.editPerson(person);
    }
}
