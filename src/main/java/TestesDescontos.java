import Calculadora.CalculadoraDesconto;
import Orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {

        Orcamento orcamento1 = new Orcamento(new BigDecimal(200), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal(500), 10);

        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        System.out.println(calculadora.calcular(orcamento1));
        System.out.println(calculadora.calcular(orcamento2));

    }
}
