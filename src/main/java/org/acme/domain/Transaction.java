package org.acme.domain;

import java.sql.Time;

public record Transaction(Integer value, Character type, String description, Time created, Integer ref) {
}
