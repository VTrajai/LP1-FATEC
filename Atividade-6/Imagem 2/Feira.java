public class Feira {
    public static void main(String[] args) {

        Fruta f1 = new Fruta("Banana", 5.0, 10);
        Fruta f2 = new Fruta("Maçã", 3.0, 8);
        Cliente c1 = new Cliente();
        Vendedor v1 = new Vendedor("Carlos", "F001");

        c1.cadastrar("Maria", "222");
        c1.adicionarDinheiro(30);

        System.out.println("=== ANTES ===");
        f1.exibirInfo();
        System.out.println();
        f2.exibirInfo();
        System.out.println();
        v1.exibirDados();
        System.out.println("Cliente: " + c1.nome + " | Dinheiro: R$ " + c1.dinheiro);

        System.out.println("\n=== COMPRANDO BANANA ===");
        v1.atender();
        f1.aplicarDesconto(20);
        c1.comprar(f1);
        v1.registrarVenda(f1.preco);

        System.out.println("\n=== COMPRANDO MAÇÃ ===");
        v1.atender();
        c1.comprar(f2);
        v1.registrarVenda(f2.preco);

        System.out.println("\n=== DEPOIS ===");
        f1.exibirInfo();
        System.out.println();
        f2.exibirInfo();
        System.out.println();
        v1.exibirDados();
        System.out.println("Cliente: " + c1.nome + " | Dinheiro: R$ " + c1.dinheiro);
    }
}