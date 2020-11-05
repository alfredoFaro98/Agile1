package com.example.buh.DAO;

import com.example.buh.entities.ContoTitoli;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContoTitoliDAO extends JpaRepository<ContoTitoli,Long> {
}