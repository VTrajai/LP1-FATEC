public class Fruta {
    String nome;
    double preco;
    int quantidade;

    public Fruta(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInfo() {
        System.out.println("Fruta: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public void aplicarDesconto(double percentual) {
        preco = preco - (preco * percentual / 100);
    }

    public void reduzirQuantidade() {
        quantidade = quantidade - 1;
    }
}