import Orcamento.Orcamento;
import http.JavaHttpClient;
import Orcamento.RegistroDeOrcamento;
import Orcamento.ItemOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {

    public static void main(String[] args) throws Exception {

        ItemOrcamento itemOrcamento = new ItemOrcamento(new BigDecimal(200));
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(itemOrcamento);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());

        registro.registrar(orcamento);
    }
}
