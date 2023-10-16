package correntista;

public class ContaAnalise {
    private int solicitada;
    private int ativa;
    private int bloqueada;
    private int desativada;

    public int getSolicitada() {
        return solicitada;
    }

    public void setSolicitada(int solicitada) {
        this.solicitada = solicitada;
    }

    public int getAtiva() {
        return ativa;
    }

    public void setAtiva(int ativa) {
        this.ativa = ativa;
    }

    public int getBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(int bloqueada) {
        this.bloqueada = bloqueada;
    }

    public int getDesativada() {
        return desativada;
    }

    public void setDesativada(int desativada) {
        this.desativada = desativada;
    }
}
