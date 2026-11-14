package dev.bolivar.designpatterns.behavioral.chainofresponsibility;

public final class PaymentHandler extends AbstractCheckoutHandler {
    public PaymentHandler(CheckoutHandler next) { super(next); }

    @Override
    public Decision handle(CheckoutRequest request) {
        if (request.amountCents() <= 0 || !request.paymentAuthorized()) {
            return Decision.reject("payment", "Payment not authorized or invalid amount");
        }
        return forward(request);
    }
}
