import Calculadora.CalculadoraDeImposto;
import Imposto.ICMS;
import Orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal(100));

        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();

        System.out.println(calculadora.calcular(orcamento, new ICMS()));

    }
}
