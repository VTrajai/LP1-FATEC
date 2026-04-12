public class Cliente {
    String nome;
    String cpf;
    double dinheiro;

    public void cadastrar(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.dinheiro = 0;
    }

    public void adicionarDinheiro(double valor) {
        dinheiro = dinheiro + valor;
    }

    public void comprar(Fruta f) {
        dinheiro = dinheiro - f.preco;
        f.reduzirQuantidade();
    }
}