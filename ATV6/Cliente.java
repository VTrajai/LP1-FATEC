public class Cliente {
    String nome;
    String cpf;
    double saldo;

    public void cadastrar(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0;
    }

    public void adicionarSaldo(double valor) {
        saldo = saldo + valor;
    }

    public void comprar(Medicamento m) {
        saldo = saldo - m.preco;
        m.reduzirEstoque();
    }
}