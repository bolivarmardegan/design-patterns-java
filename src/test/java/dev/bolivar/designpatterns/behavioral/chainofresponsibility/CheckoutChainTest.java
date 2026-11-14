package dev.bolivar.designpatterns.behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckoutChainTest {
    private final CheckoutHandler chain = CheckoutChain.standard();

    @Test void approvesValidRequest() {
        assertTrue(chain.handle(new CheckoutRequest("a", "u", 1, 3, 100, true)).approved());
    }
    @Test void stopsAtAuthentication() {
        var result = chain.handle(new CheckoutRequest("a", " ", 5, 2, 0, false));
        assertEquals("authentication", result.stage());
        assertFalse(result.approved());
    }
    @Test void stopsAtInventory() {
        assertEquals("inventory", chain.handle(
          new CheckoutRequest("a", "u", 4, 3, 100, false)).stage());
    }
    @Test void stopsAtPayment() {
        assertEquals("payment", chain.handle(
          new CheckoutRequest("a", "u", 2, 3, 100, false)).stage());
    }
    @Test void rejectsZeroQuantity() {
        assertEquals("inventory", chain.handle(
          new CheckoutRequest("a", "u", 0, 3, 100, true)).stage());
    }
    @Test void rejectsInvalidPaymentAmount() {
        assertEquals("payment", chain.handle(
          new CheckoutRequest("a", "u", 2, 3, 0, true)).stage());
    }
}
