package ru.netology.service;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
@Test
public void testOnNull() {
    CashbackHackService cashback=new CashbackHackService();
    int amount=1000;
    int actual=cashback.remain(amount);
    int expected=0;
    assertEquals(expected,actual);
}
    @Test
    public void testOnHundred() {
        CashbackHackService cashback=new CashbackHackService();
        int amount=900;
        int actual=cashback.remain(amount);
        int expected=100;
        assertEquals(expected,actual);
    }
    @Test
    public void testOnZero() {
        CashbackHackService cashback=new CashbackHackService();
        int amount=0;
        int actual=cashback.remain(amount);
        int expected=1000;
        assertEquals(expected,actual);
    }
    @Test
    public void testOnTwo() {
        CashbackHackService cashback=new CashbackHackService();
        int amount=2500;
        int actual=cashback.remain(amount);
        int expected=500;
        assertEquals(expected,actual);
    }
}