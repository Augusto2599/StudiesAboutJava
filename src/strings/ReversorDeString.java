package strings;

public class ReversorDeString {
    public static String reverter(String texto) {
        String textoRevertido = "";
        for (int i = texto.length() - 1; i >= 0; i--)
            textoRevertido += texto.charAt(i);
        return textoRevertido;
    }
}