package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void ifFaculty0(){
        //GIVEN
        int num = 0;
        //WHEN
        int actual = Main.facultyGenerator(num);
        //THEN
        assertEquals(1, actual);
    }

    @Test
    void ifFaculty1(){
        //GIVEN
        int num = 1;
        //WHEN
        int actual = Main.facultyGenerator(num);
        //THEN
        assertEquals(1, actual);
    }

    @Test
    void ifFaculty2(){
        //GIVEN
        int num = 2;
        //WHEN
        int actual = Main.facultyGenerator(num);
        //THEN
        assertEquals(2, actual);
    }

    @Test
    void ifFaculty3(){
        //GIVEN
        int num = 3;
        //WHEN
        int actual = Main.facultyGenerator(num);
        //THEN
        assertEquals(6, actual);
    }

}