package com.example.solid.interfaceSegregation.solution;

import java.math.BigDecimal;

public class Vendedor implements Funcionario, Comissionavel{

    @Override
    public BigDecimal salario() {
        return null;
    }

    @Override
    public BigDecimal gerarComissao() {
        return null;
    }

}