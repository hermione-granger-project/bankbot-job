package com.bagusmahendra.bankbot.bankbot_job.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "payments")
public class BillPayments {
     @Id
    private String id;
    private String accountNumber;
    private double amount;
    private String transactionId;
    private String status;
    private String transactionDate;
}
