public class Elemento {
    private String id;
    private String descricao;
    private String data_hora;

    public Elemento(String id, String descricao, String data_hora) {
        this.id = id;
        this.descricao = descricao;
        this.data_hora = data_hora;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }
}
