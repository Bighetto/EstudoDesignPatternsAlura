package Pedido.acao;

import Pedido.Pedido;
import Pedido.acao.AcaoAposGerarPedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Enviando Email com dados do Pedido");
    }

}
