package com.example.buh;

import com.example.buh.service.MovimentoServiceImplementation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovimentoTest {

    @Autowired
    MovimentoServiceImplementation movimentoServiceImplementation;

    @Test
    public void movimentoTest()
    {
        /*richiama qui dentro i metodi di MovimentoServiceImplementation*/
    }
}
