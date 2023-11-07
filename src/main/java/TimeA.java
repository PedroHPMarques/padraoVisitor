public class TimeA implements Time {
    private Integer posicao;
    private Integer titulos;
    private Integer anoCriacao;



    public TimeA(Integer posicao, Integer titulos, Integer anoCriacao) {
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
        return visitor.exibirTimeA(this);
    }
}
