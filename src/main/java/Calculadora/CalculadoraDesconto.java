package Calculadora;

import Orcamento.Orcamento;
import desconto.Desconto;
import desconto.DescontoParaOrcamentoMaisDeCincoItens;
import desconto.DescontoParaOrcamentoValorMaior500;
import desconto.SemDesconto;

import java.math.BigDecimal;

public class CalculadoraDesconto {

    public BigDecimal calcular(Orcamento orcamento){

        Desconto desconto = new DescontoParaOrcamentoMaisDeCincoItens(
                new DescontoParaOrcamentoValorMaior500(
                new SemDesconto())
        );

        return desconto.calcular(orcamento);
    }
}
