package shop.warenkorb.service;

import org.springframework.stereotype.*;
import shop.bezahlen.*;
import shop.bezahlen.service.*;
import shop.warenkorb.model.*;

@Service
public class WarenkorbServiceImpl implements WarenkorbService {
    BezahlService bs;

    public WarenkorbServiceImpl(BezahlService bs) {
        this.bs = bs;
    }

    public void checkout(Warenkorb w) {
        bs.bezahlen(new Zahlung(w.summe(),w.kunde()));
    }
}
