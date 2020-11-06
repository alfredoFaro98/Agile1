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
    /*nei DAO sono presenti quindi sia le query con annotation che senza */
    /*esempio funzionante*/
    List<Titolo> findAllByDescrizione(String descrizione);

    @Query("select t from Titolo t where t.descrizione=: ciccio ")
    List<Titolo>getTitoloByDescription(@Param("ciccio") String a);

    @Query("select t.codiceISIN from Titolo t where t.descrizione=: ciccio ")
    List<String>getCodiceISINByDescription(@Param("ciccio") String a);
}