package trabalhando_com_objetos.exercicio2;

public class Carro {

    public String modelo;
    public Integer ano;
    public String cor;
    public int velocidade;

    public Carro(String modelo, Integer ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void acelerar() {
        velocidade += 10;
    }

    public String getDetalhes() {
        return "Modelo: " + modelo + " Ano: " + ano + " Cor: " + cor + " Velocidade: " + velocidade;
    }
}
