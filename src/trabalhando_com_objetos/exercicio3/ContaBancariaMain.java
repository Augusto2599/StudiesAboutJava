package trabalhando_com_objetos.exercicio3;

public class ContaBancariaMain {
    public static void main(String[] args) {
        ContaBancariaNu contaNu = new ContaBancariaNu("Udemy");
        ContaBancariaBB contaBB = new ContaBancariaBB("Udemy");

        contaNu.atualizarSaldo(50.0);
        contaBB.atualizarSaldo(50.0);
        contaBB.atualizarSaldo(-50.0);

        System.out.println(contaNu);
        System.out.println(contaBB);
    }
}
