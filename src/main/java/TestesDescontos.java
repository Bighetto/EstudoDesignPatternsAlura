import Calculadora.CalculadoraDesconto;
import Orcamento.Orcamento;
import Orcamento.ItemOrcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {


        Orcamento orcamento1 = new Orcamento();
        orcamento1.adicionarItem(new ItemOrcamento(new BigDecimal(500)));
        Orcamento orcamento2 = new Orcamento();
        orcamento2.adicionarItem(new ItemOrcamento(new BigDecimal(200)));

        CalculadoraDesconto calculadora = new CalculadoraDesconto();

        System.out.println(calculadora.calcular(orcamento1));
        System.out.println(calculadora.calcular(orcamento2));

    }
}
