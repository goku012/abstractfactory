public class MaestriaCoreana implements Maestria {

    @Override
    public  Nivel createNivel() {
        return new NivelMestre();
    }


    @Override
    public Historico createHistorico() {
        return new HistoricoMestre();
    }


}


