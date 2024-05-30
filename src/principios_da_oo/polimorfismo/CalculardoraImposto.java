package principios_da_oo.polimorfismo;

public class CalculardoraImposto {
    public static void main(String[] args) {
        Imposto[] impostos = {
                new ImpostoPessoaJiridica(100_000.0),
                new ImpostoPessoaFisica(100_000.0)
        };

        for (Imposto imposto : impostos) {
            System.out.println(imposto.calcularImposto());
        }
    }
}
