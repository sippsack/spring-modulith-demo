package shop.bezahlen;

import java.math.*;

public record Zahlung(BigDecimal betrag, String empfaenger) {}
