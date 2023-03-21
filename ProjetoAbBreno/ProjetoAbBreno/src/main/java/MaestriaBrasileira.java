public class MaestriaBrasileira implements Maestria{
    @Override
    public  Nivel createNivel() {
        return new NivelBronze();
    }

    @Override
    public Historico createHistorico() {
        return new HistoricoBronze();
    }
}
