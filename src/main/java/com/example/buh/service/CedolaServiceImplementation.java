package com.example.buh.service;

import com.example.buh.DAO.CedolaDAO;
import com.example.buh.entities.Cedola;
import com.example.buh.entities.EmbeddedIDs.CedolaId;
import com.example.buh.service.interfaces.CedolaServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CedolaServiceImplementation implements CedolaServiceInterface {

    @Autowired
    CedolaDAO cedolaDAO;

    @Override
    public List<Cedola> getAllByCodiceISIN(CedolaId codiceISIN) {
        return cedolaDAO.findAllByCedolaId(new CedolaId());
    }
}
