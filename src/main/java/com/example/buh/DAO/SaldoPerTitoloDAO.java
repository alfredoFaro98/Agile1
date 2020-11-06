package com.example.buh.DAO;

import com.example.buh.entities.EmbeddedIDs.SaldoPerTitoloID;
import com.example.buh.entities.Movimento;
import com.example.buh.entities.SaldoPerTitolo;
import com.example.buh.entities.Titolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SaldoPerTitoloDAO extends JpaRepository<SaldoPerTitolo, SaldoPerTitoloID> {

}
