package shop.warenkorb.model;

import org.springframework.modulith.events.*;
import shop.katalog.*;

import java.math.*;
import java.util.*;


public record  Warenkorb(String kunde, List<Artikel> artikel) {
    public BigDecimal summe() {
        return artikel().stream().reduce(new BigDecimal(0), (b, a) -> b.add(a.preis()), BigDecimal::add);
    }
}
