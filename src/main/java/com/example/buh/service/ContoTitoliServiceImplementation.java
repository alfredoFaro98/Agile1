package com.example.buh.service;

import com.example.buh.DAO.ContoTitoliDAO;
import com.example.buh.service.interfaces.ContoTitoliServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContoTitoliServiceImplementation implements ContoTitoliServiceInterface {

    @Autowired
    ContoTitoliDAO contoTitoliDAO;
}
