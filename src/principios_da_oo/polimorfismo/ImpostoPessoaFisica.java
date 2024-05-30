package principios_da_oo.polimorfismo;

public class ImpostoPessoaFisica implements Imposto {
    private Double rendaAnual;

    public ImpostoPessoaFisica(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public Double calcularImposto() {
        return this.rendaAnual * 0.2;
    }

    public Double getRendaAnual() {
        return this.rendaAnual;
    }

}