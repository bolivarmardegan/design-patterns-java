package dev.bolivar.designpatterns.behavioral.chainofresponsibility;

public record Decision(boolean approved, String stage, String message) {
    public static Decision reject(String stage, String message) {
        return new Decision(false, stage, message);
    }

    public static Decision approve() {
        return new Decision(true, "completed", "Checkout approved");
    }
}
