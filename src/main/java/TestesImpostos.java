import Calculadora.CalculadoraDeImposto;
import Imposto.ICMS;
import Imposto.ISS;
import Orcamento.Orcamento;
import Orcamento.ItemOrcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal(100)));

        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();

        System.out.println(calculadora.calcular(orcamento, new ICMS(new ISS(null))));
        System.out.println(calculadora.calcular(orcamento, new ICMS(null)));
        System.out.println(calculadora.calcular(orcamento, new ISS(null)));

    }
}
