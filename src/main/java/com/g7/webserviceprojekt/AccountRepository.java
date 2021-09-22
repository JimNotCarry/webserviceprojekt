package com.g7.webserviceprojekt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AccountRepository extends JpaRepository<Accounts, Integer> {

    @Query ("FROM Accounts WHERE Name LIKE %?1%")
    List<Accounts> findByNameContains(String name);

    @Query ("FROM Accounts WHERE Email LIKE %?1%")
    List<Accounts> findByEmailContains(String email);

}
