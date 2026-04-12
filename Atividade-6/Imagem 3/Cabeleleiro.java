public class Cabeleleiro {
    String nome;
    String especialidade;
    double comissao;

    public Cabeleleiro(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.comissao = 0;
    }

    public void exibirInfo() {
        System.out.println("Cabeleleiro: " + nome);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Comissão: R$ " + comissao);
    }

    public void realizarCorte(double valor) {
        comissao = comissao + (valor * 0.3);
    }

    public void finalizarAtendimento() {
        System.out.println(nome + " finalizou o atendimento");
    }
}