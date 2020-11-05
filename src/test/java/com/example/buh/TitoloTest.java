package com.example.buh;

import com.example.buh.DAO.TitoloDAO;
import com.example.buh.entities.Titolo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TitoloTest {

    @Autowired
    private TitoloDAO titoloDAO;

    @Test
    public void test1()
    {
        Titolo titolo = new Titolo();
        titolo.setDescrizione("CiAo");
        titoloDAO.save(titolo);
        List<Titolo>titoli = titoloDAO.findAll();
        for(int i = 0; i<titoli.size(); i++)
        {
            System.out.println(titoli.get(i));
        }
    }


}

