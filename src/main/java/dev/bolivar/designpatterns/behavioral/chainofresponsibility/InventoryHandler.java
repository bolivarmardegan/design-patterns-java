package dev.bolivar.designpatterns.behavioral.chainofresponsibility;

public final class InventoryHandler extends AbstractCheckoutHandler {
    public InventoryHandler(CheckoutHandler next) { super(next); }

    @Override
    public Decision handle(CheckoutRequest request) {
        if (request.quantity() <= 0 || request.availableStock() < request.quantity()) {
            return Decision.reject("inventory", "Insufficient inventory or invalid quantity");
        }
        return forward(request);
    }
}
