package dev.bolivar.designpatterns.behavioral.chainofresponsibility;

import java.util.Objects;

public abstract class AbstractCheckoutHandler implements CheckoutHandler {
    private final CheckoutHandler next;

    protected AbstractCheckoutHandler(CheckoutHandler next) {
        this.next = Objects.requireNonNull(next, "Every validation chain must have a terminal handler");
    }

    protected final Decision forward(CheckoutRequest request) {
        return next.handle(request);
    }
}
