package dev.bolivar.designpatterns.behavioral.chainofresponsibility;

public final class AuthenticationHandler extends AbstractCheckoutHandler {
    public AuthenticationHandler(CheckoutHandler next) { super(next); }

    @Override
    public Decision handle(CheckoutRequest request) {
        if (request.userId() == null || request.userId().isBlank()) {
            return Decision.reject("authentication", "Authenticated user is required");
        }
        return forward(request);
    }
}
