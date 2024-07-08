package com.example.solid.dependencyInversion.problem;

import com.example.solid.dependencyInversion.solution.Pedido;

public interface PedidoRepository {

    void salvarPedido(Pedido pedido);
}
