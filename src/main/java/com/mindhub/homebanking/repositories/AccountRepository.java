package com.mindhub.homebanking.repositories;

import com.mindhub.homebanking.models.Account;
import com.mindhub.homebanking.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource              //CREA UN REPOSITORIO QUE SE VA A BASAR EN LA ARQUITECTURA DE REST
public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByNumber(String number);
}
