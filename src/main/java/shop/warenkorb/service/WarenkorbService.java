package shop.warenkorb.service;

import org.springframework.context.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import shop.bezahlen.*;
import shop.warenkorb.*;
import shop.warenkorb.model.*;

public interface WarenkorbService {

    void checkout(Warenkorb w);
}
