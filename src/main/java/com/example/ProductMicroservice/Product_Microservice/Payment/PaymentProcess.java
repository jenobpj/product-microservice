package com.example.ProductMicroservice.Product_Microservice.Payment;

public class PaymentProcess {
    PaymentMethod paymentMethod;

    PaymentProcess(PaymentMethod paymentMethod){
        this.paymentMethod=paymentMethod;
    }

    void process_payment(String s){
        paymentMethod.payment_process("120");
        RefundAsPoints refundAsPoints= new DebitCardPayment();
        refundAsPoints.RefundAsPointsMethod("sdf");
    }
}
