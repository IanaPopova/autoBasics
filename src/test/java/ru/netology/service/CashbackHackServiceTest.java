package ru.netology.service;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void tellsHowMuchToPayIfAmountLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);

        }

        @Test
    public void tellsNothingIfAmountIsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);

        }

        @Test
    public void tellsHowMuchToPayIfAmountMoreThanBoundary(){
            CashbackHackService service = new CashbackHackService();
            int amount = 1500;

            int actual = service.remain(amount);
            int expected = 500;

            Assert.assertEquals(actual, expected);

        }
    }
