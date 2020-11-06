package com.example.buh.service;

import com.example.buh.DAO.ContoTitoliDAO;
import com.example.buh.service.interfaces.ContoTitoliServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class ContoTitoliServiceImplementation implements ContoTitoliServiceInterface {

    @Autowired
    ContoTitoliDAO contoTitoliDAO;
}
