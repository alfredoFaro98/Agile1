package com.example.buh.service;

import com.example.buh.entities.Titolo;

import java.util.List;

public interface TitoloService{

    List<Titolo>getAllByDescription(String description);
}
