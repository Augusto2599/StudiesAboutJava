package trabalhando_com_objetos.exercicio4;

public class JogoDeMonstros {
    public void iniciarJogo(Jogador[] jogadores) {
        for(Jogador jogador : jogadores)
            jogador.derrotarMonstro();
    }
}
