package com.example.solid.dependencyInversion.problem;

import com.example.solid.dependencyInversion.solution.Pedido;

/*
    Princípio de Inversão de Dependências Única (D - Dependency Inversion Principle)
    - Sempre que uma classe for depender de outra, ela deve sempre depender de outro
    módulo mais estável do que ela mesma, sendo assim, recomendado que os módulos de alto nível não
    dependam diretamente dos detalhes de implementação de módulos de baixo nível.
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