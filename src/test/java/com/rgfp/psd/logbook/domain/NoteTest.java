package com.rgfp.psd.logbook.domain;


import org.junit.Test;
import org.springframework.test.context.TestPropertySource;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class NoteTest {

    @Test
    public void testGetSummaryNotNull(){

        //arrange
        Note note = new Note();
        //act
        String respuesta = note.getSummary();
        //assert
        assertNotEquals(null,respuesta);

    }
    @Test
    public void testGetSummaryLength(){

        //arrange
        Note note = new Note();
        //act
        boolean respuesta =  note.getSummary().length()<=15 ? true : false;
        //assert
        assertEquals(true, respuesta);
    }
}