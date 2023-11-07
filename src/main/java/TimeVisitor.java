public class TimeVisitor implements Visitor {
    public String exibir(Time time){
        return time.aceitar(this);
    }

    public String exibirTimeA(TimeA timeA){
        return "Time{" + "posição='" + timeA.getPosicao() + '\'' +
                ", titulos'" + timeA.getTitulos() + '\'' +
                ", anoCriacao=" + timeA.getAnoCriacao() + '}';
    }
    public String exibirTimeB(TimeB timeB){
        return "Time{" + "posição='" + timeB.getPosicao() + '\'' +
                ", titulos'" + timeB.getTitulos() + '\'' +
                ", anoCriacao=" + timeB.getAnoCriacao() + '}';
    }
    public String exibirTimeC(TimeC timeC){
        return "Time{" + "posição='" + timeC.getPosicao() + '\'' +
                ", titulos'" + timeC.getTitulos() + '\'' +
                ", anoCriacao=" + timeC.getAnoCriacao() + '}';
    }
}
