package com.guilherme.crud_client.dto;

import com.guilherme.crud_client.entities.Client;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class ClientDTO {
    private long  id;

    @Size(min = 1, max = 100, message = "nome precisa ter de 1 a 100 caracteres")
    @NotBlank(message = "Campo Requerido")
    private String name;

    private String cpf;

    private Double income;

    @PastOrPresent(message = "data inválida")
    private LocalDate birthDate;

    private Integer children;

    public ClientDTO() {
    }

    public ClientDTO(long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
