package com.example.buh;

import com.example.buh.service.TitoloServiceImplementation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TitoloTest {

    @Autowired
    TitoloServiceImplementation titoloService;

    @Test
    public void test1()
    {
        if(titoloService.getAllByDescription("Ciao").size() > 0)
            System.out.println(titoloService.getAllByDescription("Ciao").size());
    }


}

