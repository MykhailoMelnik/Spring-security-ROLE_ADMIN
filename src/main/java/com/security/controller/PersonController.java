package com.security.controller;

import com.security.domain.Person;
import com.security.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonRepository personRepository;

    /**@RolesAllowed Need prefix on BG for using ROLE_ADMIN..**/
    @RolesAllowed({"USER", "ADMIN"})
    @GetMapping
    public List<Person> getAll(){
        return personRepository.findAll();
    }

    @RolesAllowed("ADMIN")
    @PutMapping("/{id}")
    public void updatePerson(@PathVariable Long id, @RequestBody Person person){
        personRepository.save(person);
    }
}
