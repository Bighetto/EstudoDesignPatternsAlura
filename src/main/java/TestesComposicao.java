import Orcamento.ItemOrcamento;
import Orcamento.Orcamento;
import Orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TestesComposicao {

    public static void main(String[] args) {

        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento( new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());

    }
}
