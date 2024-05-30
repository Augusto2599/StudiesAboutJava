package principios_da_oo.heranca;

public class Triangulo extends FiguraGeometrica {
    private Integer base;
    private Integer altura;

    public Triangulo(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
        super.tipo = "Triângulo";
    }

    public Integer getArea() {
        return (base * altura) / 2;
    }

    public String toString() {
        return "{" + "Base: " + this.base + ", Altura: " + this.altura + ", Tipo: " + tipo + " }";
    }

}
