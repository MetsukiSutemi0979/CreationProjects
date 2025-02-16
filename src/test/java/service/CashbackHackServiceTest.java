package service;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testMoreBoundary() {

        int actual = service.remain(1100);
        int expected = 900;

        assert (actual == expected);
    }

    @Test
    public void testLessBoundary() {

        int actual = service.remain(900);
        int expected = 100;

        assert (actual == expected);
    }

    @Test
    public void testEquallyBoundary() {

        int actual = service.remain(1000);
        int expected = 0;

        assert (actual == expected);
    }
}
