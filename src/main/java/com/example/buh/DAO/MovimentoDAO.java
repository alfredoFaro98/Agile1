package com.example.buh.DAO;

import com.example.buh.entities.Movimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentoDAO extends JpaRepository<Movimento, Long> {
}
