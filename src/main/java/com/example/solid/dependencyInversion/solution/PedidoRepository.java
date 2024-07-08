package com.example.solid.dependencyInversion.solution;

/*
    - Criar uma interface para a classe de acesso ao banco de dados e injetá-la na classe `PedidoService´.
*/
public interface PedidoRepository {
    void salvarPedido(Pedido pedido);
}