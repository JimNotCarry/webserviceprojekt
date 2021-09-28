package com.g7.webserviceprojekt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountsService {

    @Autowired
    private AccountRepository AccountRepository;

    public String addNewPerson(String name, String email, String password, String image) {

        String status;

        try {
            Accounts n = new Accounts();
            n.setName(name);
            n.setEmail(email);
            n.setPassword(password);
            n.setImage(image);
            AccountRepository.save(n);

            status = "Success!";
        } catch(Exception e) {

            status = "Failed to post!";
        }
        return status;
    }

    public Iterable<Accounts> getAllPersons() {
        return AccountRepository.findAll();
    }

    public Accounts findAccountById(int id) {
        Accounts acc = AccountRepository.findById(id).get();

        return acc;
    }

    public Accounts updateAccountByName(int id, String name) {
        Accounts acc = findAccountById(id);

        acc.setName(name);

        AccountRepository.save(acc);

        acc = findAccountById(id);

        return acc;
    }

    public Accounts updateAccount(int id, String name, String email, String password) {

        Accounts account = findAccountById(id);
        if (name != null) {
            account.setName(name);
        }
        if (email != null) {
            account.setEmail(email);
        }
        if (password != null) {
            account.setPassword(password);
        }

        AccountRepository.save(account);
        return account;
    }

    public String deleteById(int id) {
        Accounts acc = findAccountById(id);
        AccountRepository.deleteById(id);

        return "Id " + id + " has been deleted \n" +acc.toString();
    }

    public List<Accounts> findByName(String name) {
        return AccountRepository.findByNameContains(name);

    }

    public List<Accounts> findByEmail(String email) {
        return AccountRepository.findByEmailContains(email);

    }

}
