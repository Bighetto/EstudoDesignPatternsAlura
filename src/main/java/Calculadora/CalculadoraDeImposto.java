package Calculadora;

import Imposto.Imposto;
import Orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {

    public BigDecimal calcular (Orcamento orcamento, Imposto imposto){

        return imposto.calcular(orcamento);

    }
}
