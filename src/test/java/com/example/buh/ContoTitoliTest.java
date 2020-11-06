package com.example.buh;

import com.example.buh.service.ContoTitoliServiceImplementation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContoTitoliTest {
    @Autowired
    ContoTitoliServiceImplementation contoTitoliServiceImplementation;

    @Test
    public void TestContoTitoli()
    {
        /*richiama metodi ContoTitoliServiceImplementation*/
    }
}
