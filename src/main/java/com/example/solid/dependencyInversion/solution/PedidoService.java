package com.example.solid.dependencyInversion.solution;

import com.example.solid.dependencyInversion.problem.PedidoRepository;

/*
 - Assim conseguimos fazer com que a classe de alto nível (PedidoService) seja independente dos
  detalhes de implementação da classe de baixo nível (PedidoRepository).
*/
public class PedidoService {
    private PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public void processarPedido(Pedido pedido) {
        // Lógica de processamento do pedido
        repository.salvarPedido(pedido);
    }
}