package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void ShouldRemainIfAmountUnderBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void ShouldRemainIfAmountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;

        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}

