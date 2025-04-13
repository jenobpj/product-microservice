package com.example.ProductMicroservice.Product_Microservice.Payment;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void payment_process(String s) {
        System.out.println("Processing Payment.." + s);
    }
}
