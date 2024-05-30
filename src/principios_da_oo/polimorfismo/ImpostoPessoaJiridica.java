package principios_da_oo.polimorfismo;

public class ImpostoPessoaJiridica implements Imposto {
    private Double rendaAnual;

    public ImpostoPessoaJiridica(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public Double calcularImposto() {
        return this.rendaAnual * 0.1;
    }

    public Double getRendaAnual() {
        return this.rendaAnual;
    }
}