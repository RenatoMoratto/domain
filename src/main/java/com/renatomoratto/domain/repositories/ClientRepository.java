package com.renatomoratto.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renatomoratto.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
