package org.acme.infrastructure.controllers;

import jakarta.validation.Valid;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.acme.infrastructure.dtos.CreateTransactionInput;

@Path("/clientes")
public class TransactionController {

    @Path("/{id}/transacoes")
    @POST
    public CreateTransactionInput create(@PathParam("id") int id, @Valid CreateTransactionInput createTransactionInput) {
        return createTransactionInput;
    }
}
