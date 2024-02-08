package org.acme.domain;


import java.util.Date;

public record Transaction(Integer value, Character type, String description, Date createAt, Integer ref) {
    public static Transaction create(Integer value, Character type, String description, Integer ref) {
        return new Transaction(value, type, description, new Date(), ref);
    }
}
