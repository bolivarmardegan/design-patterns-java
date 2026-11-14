package dev.bolivar.designpatterns.behavioral.chainofresponsibility;

public final class CheckoutChain {
    private CheckoutChain() { }

    public static CheckoutHandler standard() {
        return new AuthenticationHandler(
                new InventoryHandler(
                        new PaymentHandler(new CompletedHandler())));
    }
}
