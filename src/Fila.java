public class Fila {
    private NoFila cabeca;
    private NoFila cauda;
    private int tamanho;

    public Fila(){
        this.cabeca = null;
        this.cauda = null;
        this.tamanho = 0;
    }

    public boolean vazia(){
        return this.tamanho == 0;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    public NoFila espiar(){
        return this.cabeca;
    }

    public void inserir(ElementoFila elemento){
        NoFila novo_no = new NoFila(elemento);
        if (vazia()){
            this.cabeca = novo_no;
        }
        else {
            this.cauda.setProximo(novo_no);
        }
        this.cauda = novo_no;
        this.tamanho++;
    }

    public void remover(){
        if (vazia()) return;
        NoFila temporario = this.cabeca;
        this.cabeca = temporario.getProximo();
        temporario.setProximo(null);
        this.tamanho--;
    }

}
