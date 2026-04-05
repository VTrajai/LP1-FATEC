>Exercício 1
```
public class MyFirstJavaProgram {

   public static void main(String []args) {
    
      System.out.println("Olá, Vitor Trajai");
   }
}
```

>Exercício 2
```
public class MyFirstJavaProgram {
   public static void main(String []args) {

      System.out.println("Primeiro nome: vitor.");
      System.out.println("Sobrenome: Trajai");
   }
}
```

>Exercício 3
```
public class MyFirstJavaProgram {
   public static void main(String []args) {
      // Usando uma única linha de código para imprimir duas linhas
      System.out.println("Vitor \n Trajai");
   }
```
>Exercício 4
```
   public class BalancoTrimestral {
   public static void main(String[] args) {
      int janeiro = 15000;
      int fevereiro = 23000;
      int marco = 17000;

      int gastoTotal = janeiro + fevereiro + marco;

      double mediaMensal = gastoTotal / 3.0;

      System.out.println("Gasto total no trimestre: R$ " + gastoTotal);
      System.out.println("Média mensal de gastos: R$ " + mediaMensal);
   }
}
```

>Exercício 5
```
public class Main {

    public static void main(String[] args) {
        double a = 5.0;
        double b = 3.0;
        double c = 8.0;
        double media = (a+b+c)/3;
        System.out.println("A média é: " + media);
    }
}
```
>Exercício 6
>imagem 1
````
package Main;

public class Farmacia {
    public String endereco;
    public int numeroFuncionarios;
    public double faturamentoDiario;

    public void registrarVenda(double valor) {
        this.faturamentoDiario += valor;
        System.out.println("Venda registrada. Faturamento atual: R$ " + faturamentoDiario);
    }

    public void contratarFuncionario() {
        this.numeroFuncionarios++;
        System.out.println("Novo funcionário contratado. Total: " + numeroFuncionarios);
    }

    public void mostrarEndereco() {
        System.out.println("Endereço da farmácia: " + endereco);
    }
}

package Main;

public class Cliente {
    public String telefone;
    public int idade;
    public boolean possuiReceita;

    public void atualizarTelefone(String novoTelefone) {
        this.telefone = novoTelefone;
        System.out.println("Telefone atualizado para: " + telefone);
    }

    public void apresentarReceita() {
        this.possuiReceita = true;
        System.out.println("Receita médica apresentada.");
    }

    public void verificarMaioridade() {
        if (idade >= 18) {
            System.out.println("Cliente maior de idade.");
        } else {
            System.out.println("Cliente menor de idade.");
        }
    }
}

package Main;

public class Medicamento {
    public String fabricante;
    public String validade;
    public boolean controlado;

    public void alterarFabricante(String novoFabricante) {
        this.fabricante = novoFabricante;
        System.out.println("Fabricante alterado para: " + fabricante);
    }

    public void verificarControle() {
        if (controlado) {
            System.out.println("Medicamento controlado.");
        } else {
            System.out.println("Medicamento comum.");
        }
    }
````
>Exercício 6
>Imagem 2
````
import java.util.ArrayList;
import java.util.List;

public class Feira {

    private String horarioFuncionamento;
    private List<Produto> listaProdutos;
    private List<Vendedor> vendedores;

    public Feira(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
        this.listaProdutos = new ArrayList<>();
        this.vendedores = new ArrayList<>();
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void removerVendedor(Vendedor vendedor) {
        vendedores.remove(vendedor);
    }

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public void listarProdutos() {
        System.out.println(listaProdutos);
    }
}

    public void mostrarValidade() {
        System.out.println("Validade: " + validade);
    }
}

public class Produto {

    private double preco;
    private int quantidade;
    private String origem;

    public Produto(double preco, int quantidade, String origem) {
        this.preco = preco;
        this.quantidade = quantidade;
        this.origem = origem;
    }

    public void aplicarReajuste(double valor) {
        preco += valor;
    }

    public void venderUnidade() {
        quantidade--;
    }

    public void mostrarOrigem() {
        System.out.println("Origem: " + origem);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Vendedor {

    private String telefone;
    private List<Produto> itensVenda;

    public Vendedor(String telefone) {
        this.telefone = telefone;
        this.itensVenda = new ArrayList<>();
    }

    public void adicionarItem(Produto produto) {
        itensVenda.add(produto);
    }

    public void removerItem(Produto produto) {
        itensVenda.remove(produto);
    }

    public void mostrarTelefone() {
        System.out.println("Telefone: " + telefone);
    }
}
````
>Exercício 6
>Imagem 3
````
package LP1;

public class SalaoBeleza {

    public static void main(String[] args) {

        LP1.Cliente c1 = new LP1.Cliente();
        c1.email = "ana@email.com";
        c1.idade = 28;
        c1.agendarHorario();
        c1.exibirEmail();

        System.out.println("---");

        Servico s1 = new Servico();
        s1.categoria = "Capilar";
        s1.requerProdutoEspecial = true;
        s1.nivelComplexidade = 3;
        s1.informarProdutoEspecial();
        s1.verificarComplexidade();

        System.out.println("---");

        LP1.Profissional p1 = new LP1.Profissional();
        p1.anosExperiencia = 8;
        p1.turno = "Manhã";
        p1.avaliacao = 4.5;
        p1.atualizarTurno("Tarde");
        p1.mostrarExperiencia();
    }
}

package LP1;

public class Servico {
    String categoria;
    boolean requerProdutoEspecial;
    int nivelComplexidade;

    public void alterarCategoria(String novaCategoria) {
        this.categoria = novaCategoria;
        System.out.println("Categoria alterada para: " + categoria);
    }

    public void verificarComplexidade() {
        System.out.println("Nível de complexidade: " + nivelComplexidade);
    }

    public void informarProdutoEspecial() {
        if (requerProdutoEspecial) {
            System.out.println("Este serviço requer produto especial.");
        } else {
            System.out.println("Serviço comum.");
        }
    }
}

package LP1;

public class Cliente {
    String email;
    int idade;
    boolean possuiAgendamento;

    public void agendarHorario() {
        this.possuiAgendamento = true;
        System.out.println("Horário agendado com sucesso.");
    }

    public void cancelarAgendamento() {
        this.possuiAgendamento = false;
        System.out.println("Agendamento cancelado.");
    }

    public void exibirEmail() {
        System.out.println("E-mail do cliente: " + email);
    }
}

package LP1;

public class Profissional {
    int anosExperiencia;
    String turno;
    double avaliacao;

    public void atualizarTurno(String novoTurno) {
        this.turno = novoTurno;
        System.out.println("Novo turno: " + turno);
    }

    public void aumentarAvaliacao(double pontos) {
        this.avaliacao += pontos;
        System.out.println("Avaliação atual: " + avaliacao);
    }

    public void mostrarExperiencia() {
        System.out.println("Experiência: " + anosExperiencia + " anos");
    }
}
