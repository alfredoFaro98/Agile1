package com.example.buh.service;

import com.example.buh.DAO.CedolaDAO;
import com.example.buh.service.interfaces.CedolaServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class CedolaServiceImplementation implements CedolaServiceInterface {

    @Autowired
    CedolaDAO cedolaDAO;
}
