package dev.bolivar.designpatterns.behavioral.chainofresponsibility;

public interface CheckoutHandler {
    Decision handle(CheckoutRequest request);
}
