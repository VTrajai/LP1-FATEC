public class Salao {
    public static void main(String[] args) {

        Cabeleleiro c1 = new Cabeleleiro("Paulo", "Corte Masculino");
        Cliente cliente1 = new Cliente();
        Ferramenta tesoura = new Ferramenta("Tesoura Profissional", "Corte", 5);
        Ferramenta secador = new Ferramenta("Secador Turbo", "Finalização", 3);

        cliente1.cadastrar("Fernanda", "99999-8888");
        cliente1.adicionarSaldo(100);

        System.out.println("=== ANTES ===");
        c1.exibirInfo();
        System.out.println();
        tesoura.exibirInfo();
        System.out.println();
        secador.exibirInfo();
        System.out.println();
        System.out.println("Cliente: " + cliente1.nome + " | Saldo: R$ " + cliente1.saldo);

        System.out.println("\n=== ATENDIMENTO ===");
        System.out.println("Cliente " + cliente1.nome + " chegou ao salão");
        System.out.println("Cabeleleiro " + c1.nome + " vai atender");

        tesoura.usar();
        secador.usar();

        double valorCorte = 50.0;
        cliente1.pagarServico(valorCorte);
        c1.realizarCorte(valorCorte);
        c1.finalizarAtendimento();

        System.out.println("\n=== REPONDO FERRAMENTA ===");
        tesoura.repor(2);

        System.out.println("\n=== DEPOIS ===");
        c1.exibirInfo();
        System.out.println();
        tesoura.exibirInfo();
        System.out.println();
        secador.exibirInfo();
        System.out.println();
        System.out.println("Cliente: " + cliente1.nome + " | Saldo: R$ " + cliente1.saldo);
    }
}