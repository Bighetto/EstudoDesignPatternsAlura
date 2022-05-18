package Orcamento.situacao;

import Orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{

    public void finalizar(Orcamento orcamento){
        orcamento.setSituacao(new Finalizado());
    }
}
