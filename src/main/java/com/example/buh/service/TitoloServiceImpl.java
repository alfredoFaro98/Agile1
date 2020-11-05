package com.example.buh.service;

import com.example.buh.DAO.TitoloDAO;
import com.example.buh.entities.Titolo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TitoloServiceImpl implements TitoloService {

    @Autowired
    TitoloDAO titoloDAO;

    @Override
    public List<Titolo> getAllByDescription(String description) {
        return titoloDAO.findAllByDescrizione("ciao");

    }
}
