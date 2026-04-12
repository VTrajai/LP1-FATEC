public class Farmacia {
    public static void main(String[] args) {

        Medicamento m1 = new Medicamento("Dipirona", 10.0, 5);
        Cliente c1 = new Cliente();
        Vendedor v1 = new Vendedor("Ana", "123");

        c1.cadastrar("Joao", "111");
        c1.adicionarSaldo(50);

        System.out.println("=== ANTES ===");
        m1.exibirInfo();
        v1.exibirDados();
        System.out.println("Cliente: " + c1.nome + " | Saldo: R$ " + c1.saldo);

        System.out.println("\n=== AÇÃO ===");
        v1.atender();
        m1.aplicarDesconto(10);
        c1.comprar(m1);
        v1.registrarVenda(m1.preco);

        System.out.println("\n=== DEPOIS ===");
        m1.exibirInfo();
        v1.exibirDados();
        System.out.println("Cliente: " + c1.nome + " | Saldo: R$ " + c1.saldo);
    }
}