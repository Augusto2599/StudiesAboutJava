package trabalhando_com_objetos;
import java.util.Arrays;

public class Curriculo {

    public String nome = "Augusto Oliveira";
    public Integer idade = 25;
    public String[] competencias = {"Java"};
    public String[] expericencias = {"Nenhuma"};

    public String sobreMim() {
        return "Olá, prazer, sou " + nome + ", tenho " + idade +
        " anos, e trabalho com " + Arrays.toString(competencias) +
        ", e minhas experiências foram " + Arrays.toString(expericencias); 
    }
}
