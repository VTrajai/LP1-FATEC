public class Medicamento {
    String nome;
    double preco;
    int estoque;

    public Medicamento(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void exibirInfo() {
        System.out.println("Medicamento: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Estoque: " + estoque);
    }

    public void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual / 100);
    }

    public void reduzirEstoque() {
        estoque = estoque - 1;
    }
}