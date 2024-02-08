package org.acme.application.repositories;

import org.acme.domain.AccountBalance;
import org.acme.domain.Transaction;

import java.util.Optional;

public interface TransactionRepository {
    Optional<AccountBalance> register(Transaction transaction);
}
