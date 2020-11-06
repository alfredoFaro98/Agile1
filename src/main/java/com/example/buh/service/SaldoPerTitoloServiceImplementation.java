package com.example.buh.service;


import com.example.buh.DAO.SaldoPerTitoloDAO;
import com.example.buh.service.interfaces.SaldoPerTitoloServiceInterfaces;
import org.springframework.beans.factory.annotation.Autowired;

public class SaldoPerTitoloServiceImplementation implements SaldoPerTitoloServiceInterfaces {

    @Autowired
    SaldoPerTitoloDAO saldoPerTitoloDAO;
}
