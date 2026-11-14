package dev.bolivar.designpatterns.behavioral.chainofresponsibility;

public final class CheckoutDemo {
    private CheckoutDemo() { }

    public static void main(String[] args) {
        CheckoutHandler chain = CheckoutChain.standard();
        CheckoutRequest accepted = new CheckoutRequest("ORD-100", "user-1", 2, 5, 15000, true);
        CheckoutRequest rejected = new CheckoutRequest("ORD-101", "user-2", 6, 5, 15000, true);
        System.out.println(chain.handle(accepted));
        System.out.println(chain.handle(rejected));
    }
}
