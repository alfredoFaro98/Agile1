package com.example.buh.service;

import com.example.buh.DAO.MovimentoDAO;
import com.example.buh.service.interfaces.MovimentoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class MovimentoServiceImplementation implements MovimentoServiceInterface {

    @Autowired
    MovimentoDAO movimentoDAO;
}
