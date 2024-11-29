package ru.netology.service;

//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

//import org.testng.annotations.Test;
//import org.testng.Assert;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void tellsHowMuchToPayIfAmountZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);

        }

        @Test
    public void tellsHowMuchToPayWhenAmount1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);

        }

        @Test
    public void tellsHowMuchToPayWhenAmount999(){
            CashbackHackService service = new CashbackHackService();
            int amount = 999;

            int actual = service.remain(amount);
            int expected = 1;

            Assert.assertEquals(actual, expected);

        }
    }
