package shop.lager.service;

import org.springframework.modulith.events.*;
import org.springframework.stereotype.*;
import shop.warenkorb.*;

@Component
public class LagerService {

    @ApplicationModuleListener
    void on(Bestellt bestellt) {
        System.out.println("bestellt = " + bestellt);
    }
}
