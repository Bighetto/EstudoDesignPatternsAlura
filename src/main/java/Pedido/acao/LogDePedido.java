package Pedido.acao;

import Pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido{
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi Gerado!!! ");
    }
}
