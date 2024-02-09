package org.acme.infrastructure.dtos;

import jakarta.validation.constraints.Min;

public record CreateTransactionInput(@Min(value = 1) int valor, char tipo, String descricao) {}