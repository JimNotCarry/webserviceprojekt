package com.g7.webserviceprojekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller // This means that this class is a Controller
@RequestMapping(path="/accounts") // This means URL's start with /demo (after Application path)
public class AccountController {

    @Autowired
    AccountsService accountsService;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewPerson (@RequestParam String name
            , @RequestParam String email, @RequestParam String password) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        accountsService.addNewPerson(name,email,password);

        return "Hej";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Accounts> getAllPersons() {
        // This returns a JSON or XML with the users
        return accountsService.getAllPersons();
    }

    @PutMapping(path="/update")
    public @ResponseBody Accounts updateAccountByName(int id, String name, String email, String password) {
        return accountsService.updateAccount(id, name, email, password);
    }

    @DeleteMapping(path="/delete")
    public @ResponseBody String deleteById(int id) {

        return accountsService.deleteById(id);
    }




}