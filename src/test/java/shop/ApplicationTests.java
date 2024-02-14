package shop;

import org.junit.jupiter.api.*;
import org.springframework.modulith.core.*;
import org.springframework.modulith.docs.*;

class ApplicationTests {

    @Test
    void modules() {
        ApplicationModules.of(App.class).forEach(System.out::println);
    }

    @Test
    void verify() {
        ApplicationModules.of(App.class).verify();
    }

    @Test
    void documentation() {

        var modules = ApplicationModules.of(App.class).verify();

        new Documenter(modules)
                .writeModulesAsPlantUml();
    }
}
