
public class Jogador {

    private Nivel nivel;
    private Historico historico;

    public Jogador (Maestria maestria) {
        this.nivel = maestria.createNivel();
        this.historico = maestria.createHistorico();
    }

    public String emitirNivel() {
        return this.nivel.verificar();
    }

    public String emitirHistorico() {
        return this.historico.emitir();
    }

}
