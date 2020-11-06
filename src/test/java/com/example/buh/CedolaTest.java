package com.example.buh;

import com.example.buh.entities.EmbeddedIDs.CedolaId;
import com.example.buh.service.CedolaServiceImplementation;
import com.example.buh.service.TitoloServiceImplementation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CedolaTest {

    @Autowired
    CedolaServiceImplementation cedolaServiceImplementation;

    @Test
    public void testCountTitoliByDescription()
    {
        if(cedolaServiceImplementation.getAllByCodiceISIN(new CedolaId()).size() == 0)
            System.out.println("Nessun risultato");
    }

}
