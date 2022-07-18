package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainEqualsAmount() {
        CashbackHackService service=new CashbackHackService();
        int expected=1000;
        int actual= service.remain(1000);
        assertEquals(expected,actual);
    }
    @Test
    public void testRemain() {
        CashbackHackService service=new CashbackHackService();
        int expected=2000;
        int actual= service.remain(1000);
        assertEquals(expected,actual);
    }
}