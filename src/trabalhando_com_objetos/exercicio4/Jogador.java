package trabalhando_com_objetos.exercicio4;

public class Jogador {
    public String nome;
    public static int placarGeral;
    public int plavarIndividual;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public void derrotarMonstro() {
        this.plavarIndividual++;
        placarGeral++;
    }

    public boolean equal(Object jogador) {
        return this.nome.equals(((Jogador) jogador).nome);
    }
}
