package com.example.buh.service.interfaces;

import com.example.buh.entities.Titolo;

import java.util.List;

public interface TitoloServiceInterface {

    /*questa è l'interfaccia di riferimento di un service che poi esso
    * dovra estendere obbligatoriamente implementandone i metodi*/
    List<Titolo>getAllByDescription(String description);
}
