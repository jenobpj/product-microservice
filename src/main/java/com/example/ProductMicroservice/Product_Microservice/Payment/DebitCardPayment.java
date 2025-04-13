package com.example.ProductMicroservice.Product_Microservice.Payment;

public class DebitCardPayment implements PaymentMethod,RefundPaymentMethod,RefundAsPoints{
    @Override
    public void payment_process(String s) {
        System.out.println("Payment Processing" + s);
    }

    @Override
    public void refund_payment(String s) {
        System.out.println("Refunding Payment" +s);
    }

    @Override
    public void RefundAsPointsMethod(String s) {
        System.out.println("Refunding as Points" + s);

    }
}
