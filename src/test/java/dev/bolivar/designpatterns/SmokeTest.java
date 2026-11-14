package dev.bolivar.designpatterns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import dev.bolivar.designpatterns.behavioral.chainofresponsibility.CheckoutChain;

class SmokeTest {
    @Test void chainIsAvailable() { assertNotNull(CheckoutChain.standard()); }
}
