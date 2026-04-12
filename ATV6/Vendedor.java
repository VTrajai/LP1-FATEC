public class Vendedor {
    String nome;
    String matricula;
    double comissao;

    public Vendedor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.comissao = 0;
    }

    public void registrarVenda(double valor) {
        comissao = comissao + (valor * 0.05);
    }

    public void exibirDados() {
        System.out.println("Vendedor: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Comissão: R$ " + comissao);
    }

    public void atender() {
        System.out.println(nome + " realizou o atendimento");
    }
}