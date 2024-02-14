package shop.bezahlen;

import org.junit.jupiter.api.*;
import org.springframework.modulith.test.*;

import static org.junit.jupiter.api.Assertions.*;

@ApplicationModuleTest
class BezahlServiceTest {

    BezahlService bs;

    public BezahlServiceTest(BezahlService bs) {
        this.bs = bs;
    }

    @Test
    void test() {
        System.out.println("bs = " + bs);
    }
}