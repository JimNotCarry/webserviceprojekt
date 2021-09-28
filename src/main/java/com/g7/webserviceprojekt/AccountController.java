package com.g7.webserviceprojekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/accounts", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class AccountController {

    @Autowired
    AccountsService accountsService;

    @PostMapping(path="/add")
    public String addNewPerson (@RequestParam String name, @RequestParam String email, @RequestParam String password, @RequestParam String image) {
        String status = accountsService.addNewPerson(name,email,password, image);

        return status;
    }

    @RequestMapping(path="/all")
    public Iterable<Accounts> getAllPersons() {
        // This returns a JSON or XML with the users
        return accountsService.getAllPersons();
    }

    @GetMapping(path="/id")
    public Accounts getById(int id) {

        return accountsService.findAccountById(id);
    }

    @PutMapping(path="/update")
    public Accounts updateAccountByName(int id, String name, String email, String password) {
        return accountsService.updateAccount(id, name, email, password);
    }

    @DeleteMapping(path="/delete")
    public String deleteById(int id) {
        return accountsService.deleteById(id);
    }

    @GetMapping(path="/name")
    public List<Accounts> findByName(String name) {
        return accountsService.findByName(name);
    }

    @GetMapping(path="/email")
    public List<Accounts> findByEmail(String email) {
        return accountsService.findByEmail(email);
    }


}