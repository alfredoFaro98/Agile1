package com.example.buh.DAO;

import com.example.buh.entities.Titolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TitoloDAO extends JpaRepository<Titolo,Long> {
}