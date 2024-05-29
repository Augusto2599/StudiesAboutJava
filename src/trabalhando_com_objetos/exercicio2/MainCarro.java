package trabalhando_com_objetos.exercicio2;

public class MainCarro {
    public static void main(String[] args) {
        Carro corsa = new Carro("Corsa", 2000, "Vermelho");
        corsa.acelerar();
        System.out.println(corsa.getDetalhes());
    }
}
