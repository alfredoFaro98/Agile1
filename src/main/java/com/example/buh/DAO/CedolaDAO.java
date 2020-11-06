package com.example.buh.DAO;

import com.example.buh.entities.Cedola;
import com.example.buh.entities.EmbeddedIDs.CedolaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CedolaDAO extends JpaRepository<Cedola, CedolaId> {

    List<Cedola> findAllByCedolaId(CedolaId cedolaID);

}
