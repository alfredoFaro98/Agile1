package com.example.buh.DAO;

import com.example.buh.entities.Titolo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TitoloDAO extends JpaRepository<Titolo,Long>
{
    List<Titolo> findAllByDescrizione(String descrizione);

    @Query("select t.codiceISIN from Titolo t where t.descrizione=: ciccio ")
    List<String>getTitoloWithDescription(@Param("ciccio") String a);
}