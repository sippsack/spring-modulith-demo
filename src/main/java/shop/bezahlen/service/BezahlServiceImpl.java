package shop.bezahlen.service;

import org.springframework.stereotype.*;
import shop.bezahlen.*;

@Service
public class BezahlServiceImpl implements BezahlService {
    @Override
    public void bezahlen(Zahlung z) {
        System.out.printf("%s hat %s bezahlt.%n", z.empfaenger(), z.betrag());
    }
}
