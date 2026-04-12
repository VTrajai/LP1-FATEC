public class Cliente {
    String nome;
    String telefone;
    double saldo;

    public void cadastrar(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.saldo = 0;
    }

    public void adicionarSaldo(double valor) {
        saldo = saldo + valor;
    }

    public void pagarServico(double valor) {
        saldo = saldo - valor;
    }
}