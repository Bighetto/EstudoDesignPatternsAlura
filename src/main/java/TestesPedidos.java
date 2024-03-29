import Pedido.acao.EnviarEmailPedido;
import Pedido.GeraPedido;
import Pedido.GeraPedidoHandler;
import Pedido.acao.LogDePedido;
import Pedido.acao.SalvarNoBancoPedido;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {

        String cliente = "Anna Jhulia ";
        BigDecimal valorOrcamento = new BigDecimal("300");
        Integer quantidadeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvarNoBancoPedido(),
                new EnviarEmailPedido(),
                new LogDePedido()));

        handler.executa(gerador);

    }
}