package ArvoreRubroNegra.modelo;

public class ArvoreRN {
    No raiz;

    public ArvoreRN(){

    }

    public void inserir(Integer k){
        No novo = new No();

        novo.pai = null;
        novo.chave = k;
        novo.esq = novo.dir = null;
        novo.cor = 1;

        No paiAtual = null;
        No atual = raiz;

        while(atual != null){
            paiAtual = atual;
            if(novo.chave < atual.chave){
                atual = atual.esq;
            }else{
                atual = atual.dir;
            }
        }
        novo.pai = paiAtual;

        //Verificar em qual subarvore o novo nó ira ficar
        if (paiAtual == null){
            raiz = novo;
        }else if(novo.chave < paiAtual.chave){
            paiAtual.esq = novo;
        }else{
            paiAtual.dir = novo;
        }

        //ajustar a arvore após a inserção
        if(novo.pai == null){
            novo.cor = 0;
            return;
        }
    }
}
