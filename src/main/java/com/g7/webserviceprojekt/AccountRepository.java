package com.g7.webserviceprojekt;

import org.springframework.data.repository.CrudRepository;

import com.g7.webserviceprojekt.Accounts;

public interface AccountRepository extends CrudRepository<Accounts, Integer> {

}