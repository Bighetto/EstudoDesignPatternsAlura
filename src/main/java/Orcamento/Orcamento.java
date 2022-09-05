package Orcamento;

import Orcamento.situacao.EmAnalise;
import Orcamento.situacao.Finalizado;
import Orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel{

    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;


    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    //regra para aplicar mais desconto em cima do valor
    public void aplicarDescontoExtra(){

        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);

        this.valor = this.valor.subtract(valorDescontoExtra);

    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }


    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public BigDecimal getValor() {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        return valor;
    }

    public Integer getQuantidadeItens() {
        return itens.size();
    }

    public void adicionarItem(Orcavel item){
        this.valor = valor.add(item.getValor());
    }


    public boolean isFinalizado() {

        return situacao instanceof Finalizado; //Retorna verdadeiro se a situacao for Finalizado
    }
}
