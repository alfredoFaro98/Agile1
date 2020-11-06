package com.example.buh.service.interfaces;

import com.example.buh.entities.Cedola;
import com.example.buh.entities.EmbeddedIDs.CedolaId;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CedolaServiceInterface {

    List<Cedola>getAllByCodiceISIN(CedolaId codiceISIN);

}
