package shop.warenkorb.service;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.modulith.test.*;
import shop.katalog.*;
import shop.warenkorb.model.*;

import java.math.*;
import java.util.*;

import static org.springframework.modulith.test.ApplicationModuleTest.BootstrapMode.*;

@ApplicationModuleTest(ALL_DEPENDENCIES)
class WarenkorbServiceTest {

    BigDecimal EIN_EURO = new BigDecimal(1);

    @Autowired
    WarenkorbService ws;

    @Test
    void checkout() {
        ws.checkout(new Warenkorb("Klaus", List.of(new Artikel("Keks",EIN_EURO))));
    }

}