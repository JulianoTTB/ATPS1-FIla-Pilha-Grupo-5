public class ElementoFila {
    private String nome;
    private String numeroIdentificacao;
    private String motivo;

    public ElementoFila(String nome, String numeroIdentificacao, String motivo) {
        this.nome = nome;
        this.numeroIdentificacao = numeroIdentificacao;
        this.motivo = motivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
