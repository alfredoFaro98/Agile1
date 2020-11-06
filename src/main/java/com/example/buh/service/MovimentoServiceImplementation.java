package com.example.buh.service;

import com.example.buh.DAO.MovimentoDAO;
import com.example.buh.service.interfaces.MovimentoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimentoServiceImplementation implements MovimentoServiceInterface {

    @Autowired
    MovimentoDAO movimentoDAO;
}
