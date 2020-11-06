package com.example.buh.service;

import com.example.buh.DAO.TitoloDAO;
import com.example.buh.entities.Titolo;
import com.example.buh.service.interfaces.TitoloServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TitoloServiceImplementation implements TitoloServiceInterface {

    @Autowired
    TitoloDAO titoloDAO;

    @Override
    public List<Titolo> getAllByDescription(String description) {
        return titoloDAO.findAllByDescrizione(description);

    }
}
