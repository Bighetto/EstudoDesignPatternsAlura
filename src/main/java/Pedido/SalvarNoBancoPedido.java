package Pedido;

import Pedido.acao.AcaoAposGerarPedido;

public class SalvarNoBancoPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Salvando no banco com dados do Pedido");
    }
}
