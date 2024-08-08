package com.bagusmahendra.bankbot.bankbot_job.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bagusmahendra.bankbot.bankbot_job.model.BillPayments;

public interface BillPaymentsRepository extends MongoRepository<BillPayments, String>{
    List<BillPayments> findAllByStatus(String status,Pageable pageable);
}
