package Pedido;


import Orcamento.ItemOrcamento;
import Orcamento.Orcamento;
import Pedido.acao.AcaoAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    //construtor com injecao de dependencias: repository, service, etc...

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dados){

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(dados.getValorOrcamento()));

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));
    }
}
