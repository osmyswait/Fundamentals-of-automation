package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void ShouldRemainIfAmountUnderBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldRemainIfAmountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void ShouldRemainIfAmountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}