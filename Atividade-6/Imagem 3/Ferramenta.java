public class Ferramenta {
    String nome;
    String tipo;
    int quantidade;

    public Ferramenta(String nome, String tipo, int quantidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.quantidade = quantidade;
    }

    public void exibirInfo() {
        System.out.println("Ferramenta: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Quantidade: " + quantidade);
    }

    public void usar() {
        quantidade = quantidade - 1;
    }

    public void repor(int qtd) {
        quantidade = quantidade + qtd;
    }
}