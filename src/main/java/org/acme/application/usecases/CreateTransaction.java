package org.acme.application.usecases;

import org.acme.application.repositories.TransactionRepository;
import org.acme.domain.AccountBalance;
import org.acme.domain.Transaction;

import java.util.Optional;

public class CreateTransaction {
    private final TransactionRepository transactionRepository;

    public CreateTransaction(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public Output execute(Input input) {
        return this
                .transactionRepository
                .register(Transaction.create(input.amount(), input.type(), input.description(), input.id()))
                .map(Output::new)
                .orElseThrow(() -> new RuntimeException("Transaction refused"));
    }

    public record Input(Integer id, Integer amount, Character type, String description) {}

    public record Output(Integer limit, Integer balance) {
        public Output(AccountBalance accountBalance) {
            this(accountBalance.limit(), accountBalance.balance());
        }
    }
}