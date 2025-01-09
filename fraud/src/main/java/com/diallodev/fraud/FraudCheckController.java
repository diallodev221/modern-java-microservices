package com.diallodev.fraud;

import com.diallodev.clients.fraud.FraudCheckResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/fraud-check")
public record FraudCheckController(FraudCheckService fraudCheckService) {

    @GetMapping("/{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerID) {
        Boolean fraudulentCustomer = fraudCheckService.isFraudulentCustomer(customerID);
        log.info("fraud check request for customer {}", customerID);
        return new FraudCheckResponse(fraudulentCustomer);
    }
}
