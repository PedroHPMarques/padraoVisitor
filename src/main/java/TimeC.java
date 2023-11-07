public class TimeC implements Time {
    private Integer posicao;
    private Integer titulos;
    private Integer anoCriacao;



    public TimeC(Integer posicao, Integer titulos, Integer anoCriacao) {
        this.posicao = posicao;
        this.titulos = titulos;
        this.anoCriacao = anoCriacao;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public Integer getTitulos() {
        return titulos;
    }

    public Integer getAnoCriacao() {
        return anoCriacao;
    }
    public String aceitar(Visitor visitor) {
        return visitor.exibirTimeC(this);
    }
}
