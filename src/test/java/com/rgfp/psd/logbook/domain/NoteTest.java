package com.rgfp.psd.logbook.domain;


import org.apache.tomcat.jni.Local;
import org.junit.Test;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;
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

    @Test
    public void testCloneNoteIsNotNull(){
        //arrange
        Note note = new Note();
        //act
        Note clon = note.clone();
        //assert
        assertNotEquals(null, clon);
    }

    @Test
    public void testCloneNoteCloneContent(){
        //arrange
        Note note = new Note();
        note.setTitle("Titulo");
        note.setContent("contenido");
        note.setTimestamp(LocalDateTime.now());
        //act
        Note clon = note.clone();
        Boolean fecha = note.getTimestamp().isBefore(clon.getTimestamp()) ? true : false;
        //assert
        assertEquals(note.getSummary(),clon.getSummary());
        assertEquals(note.getContent(),clon.getContent());
        assertEquals(true, fecha);
    }
}