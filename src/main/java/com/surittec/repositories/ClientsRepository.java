package com.surittec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.surittec.entity.Clients;
@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long>{

}
