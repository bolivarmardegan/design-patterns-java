package dev.bolivar.designpatterns.behavioral.chainofresponsibility;

public final class CompletedHandler implements CheckoutHandler {
    @Override
    public Decision handle(CheckoutRequest request) {
        return Decision.approve();
    }
}
