package shop.warenkorb.model;

import org.junit.jupiter.api.*;
import shop.katalog.*;

import java.math.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class WarenkorbTest {

    @Test
    void simply() {
        List<Artikel> artikel = List.of(new Artikel("Keks", new BigDecimal("0.5")));
        Assertions.assertEquals(new BigDecimal("0.5"), new Warenkorb("Mike", artikel).summe());
    }

    @Test
    void two() {
        List<Artikel> artikel = List.of(new Artikel("Keks", new BigDecimal("0.99")),
                new Artikel("Lutscher", new BigDecimal("1.99")));
        Assertions.assertEquals(new BigDecimal("2.98"), new Warenkorb("Mike", artikel).summe());
    }
}