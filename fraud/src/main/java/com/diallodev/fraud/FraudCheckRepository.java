package com.diallodev.fraud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FraudCheckRepository extends JpaRepository<FraudCheckHistory, Integer> {
}
