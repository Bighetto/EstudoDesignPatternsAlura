package Pedido.acao;

import Pedido.Pedido;

public class SalvarNoBancoPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Salvando no banco com dados do Pedido");
    }
}
