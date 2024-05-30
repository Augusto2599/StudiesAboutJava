package strings;

import java.util.Arrays;

public class JogoDaForca {
    private char[] forca;
    private String palavra;
    private Integer tentativas;

    public JogoDaForca(String palavra, Integer tentativas) {
        this.palavra = palavra.toLowerCase();
        this.tentativas = tentativas;
        this.forca = "_".repeat(palavra.length()).toCharArray();
    }

    public void fazerPalpite(char palpite) {
        if (tentativas == 0) {
            return;
        }

        boolean acertou = false;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == palpite) {
                forca[i] = palpite;
                acertou = true;
            }
        }

        if (!acertou) {
            tentativas--;
        }
    }

    @SuppressWarnings("static-access")
    public String exibirForca() {
        if (tentativas > 0) {
            return Arrays.toString(forca);
        } else {
            return "A palavra era %s. Você possui %d tentativas!".format(palavra, tentativas);
        }
    }
}
