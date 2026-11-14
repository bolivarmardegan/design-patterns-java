package dev.bolivar.designpatterns.behavioral.chainofresponsibility;

public record CheckoutRequest(
        String orderId, String userId, int quantity, int availableStock,
        long amountCents, boolean paymentAuthorized) {
}
