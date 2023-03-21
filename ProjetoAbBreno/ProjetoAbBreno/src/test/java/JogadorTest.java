import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JogadorTest {

    @Test
    void deveEmitirMaestriaBronze() {
        Maestria maestria = new MaestriaBrasileira();
        Jogador jogador = new Jogador(maestria);
        assertEquals("Voce so teve derrota", jogador.emitirHistorico());
    }



    @Test
    void deveEmitirMaestriaMestre() {
        Maestria maestria = new MaestriaCoreana() ;
        Jogador jogador = new Jogador(maestria);
        assertEquals("Voce ganha todas", jogador.emitirHistorico());
    }













    @Test
    void deveEmitirNivelBronze() {
        Maestria maestria = new MaestriaBrasileira();
        Jogador jogador = new Jogador(maestria);
        assertEquals("Voce é horroroso", jogador.emitirNivel());
    }


    @Test
    void deveEmitirNivelMestre() {
        Maestria maestria = new MaestriaCoreana() ;
        Jogador jogador = new Jogador(maestria);
        assertEquals("Voce é Brabo", jogador.emitirNivel());
    }
}
