package strings;

public class Palindromo {
    public static boolean isPalindromo(String texto) {
        String textoFormatado = "";
        for (char letra : texto.toCharArray()) {
            if (!Character.isWhitespace(letra))
                textoFormatado += letra;
        }

        String textoConvertido = ReversorDeString.reverter(textoFormatado);

        return textoFormatado.toLowerCase().equals(textoConvertido.toLowerCase());
    }
}
