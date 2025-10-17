public class Pilha {
    private No topo;

    public Pilha () {
        this.topo = null;
    }

    public boolean vazia() {
        return topo == null;
    }

    public void inserirTopo(Elemento elemento) {
        No no = new No(elemento);
        if(vazia()) {
            topo = no;
        } else {
            no.setProximo(topo);
            topo = no;
        }
    }

    public void removerTopo() {
        if(vazia()) {
            System.out.println("Histórico de solicitações vazio!");
        } else {
            topo = topo.getProximo();
        }
    }

    public void verificarHistorico() {
        if (vazia()) {
            System.out.println("Histórico de solicitações vazio!");
        } else {
            No atual = topo;
            while(atual != null) {
                System.out.println("ID da solicitação: " + atual.getElemento().getId());
                System.out.println("Descrição: " + atual.getElemento().getDescricao());
                System.out.println("Data e hora: " + atual.getElemento().getData_hora());
                atual = atual.getProximo();
            }
        }
    }
}
