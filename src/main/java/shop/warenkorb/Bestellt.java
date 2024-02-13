package shop.warenkorb;

import org.springframework.context.*;

public class Bestellt extends ApplicationEvent {
    public Bestellt(Object source) {
        super(source);
    }
}
