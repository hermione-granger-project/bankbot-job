package com.bagusmahendra.bankbot.bankbot_job;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import com.bagusmahendra.bankbot.bankbot_job.model.BillPayments;
import com.bagusmahendra.bankbot.bankbot_job.repository.BillPaymentsRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequiredArgsConstructor
public class PaymentProcess implements CommandLineRunner {
    private final BillPaymentsRepository billPaymentsRepository;

    @Override
    public void run(String... args) throws Exception {
        processPendingTransaction();
    }

    private void processPendingTransaction() {
        var payments = billPaymentsRepository.findAllByStatus("Pending", PageRequest.of(0, 10));
        if (payments.isEmpty()) {
            log.info("No Pending Transaction"); 
        } else {
            for (BillPayments payment : payments) {
                payment.setStatus("Successfull");
                billPaymentsRepository.save(payment);
                log.info("Payment with ID {} updated to Successfull", payment.getTransactionId());
            }
        }
    }
    
}
