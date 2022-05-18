package desconto;

import Orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoMaisDeCincoItens extends Desconto{

    public DescontoParaOrcamentoMaisDeCincoItens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {

        return orcamento.getValor().multiply(new BigDecimal("0.1"));

    }


    //metodo substituindo o if do metodo calcular da classe
    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
