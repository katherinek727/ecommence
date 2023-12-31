package com.kpilszak.booksandstuffecommerce.service;

import com.kpilszak.booksandstuffecommerce.dto.PaymentInfo;
import com.kpilszak.booksandstuffecommerce.dto.Purchase;
import com.kpilszak.booksandstuffecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
