import java.util.ArrayList;
import java.util.Scanner;

public class MenuProduto {
    ArrayList<Produto> produtos = new ArrayList<>();
    
    public MenuProduto(){}


    public int exibirMenu(Scanner sc){
        int opcao = 0;

        System.out.println("\n\n - Menu - ");
        System.out.println(" 1 - Adicionar elementos");
        System.out.println(" 2 - Listar elementos");
        System.out.println(" 3 - Remover um produto");
        System.out.println(" 4 - Exibir informações da lista");
        System.out.println(" 5 - Sair");

        System.out.print("\n Escolha uma opção do menu: ");
        opcao = sc.nextInt();

        return opcao;
    }


    public void addProduto(Scanner sc){
        System.out.println("\n\n -- Adicionando novo produto -- \n");
        sc.nextLine();

        System.out.print(" Nome do produto: ");
        String nome = sc.nextLine();

        System.out.print(" Preço: R$");
        double preco = sc.nextDouble();


        Produto novoProduto = new Produto(nome, preco);
        produtos.add(novoProduto);

        System.out.println("\n Produto adicionado com sucesso!\n");
    }



    public void listarProdutos(){
        System.out.println("\n\n -- Lista de produtos -- \n");

        for(Produto p : produtos){
            System.out.println(p.getNome());
        }
    }


    
    public void removerProduto(Scanner sc){
        System.out.println("\n\n -- Remover produto -- \n");
        sc.nextLine();

        boolean encontrado = false;

        System.out.print(" Digite o nome do produto para remove-lo da lista: ");
        String nomeR = sc.nextLine();

        for(Produto p :  produtos){
            if(p.getNome().equals(nomeR)){
                produtos.remove(p);
                encontrado = true;
            }
        }

        if(encontrado){
            System.out.println("\n Produto removido com sucesso!\n");
        } else {
            System.out.println("\n Produto não encontrado...\n");
        }
    }


    public void exibirInformacoes(Scanner sc){
        System.out.println("\n\n -- Informações de um produto -- \n");
        sc.nextLine();

        boolean encontrado = false;

        System.out.print(" Informe o nome do produto para exibir suas informações: ");
        String nomeE = sc.nextLine();

        for(Produto p : produtos){
            if(p.getNome().equals(nomeE)){
                System.out.println(p.getNome() + " - R$" + p.getPreco());
                encontrado = true;
            }
        }

        if(!encontrado){
            System.out.println("\n Produto não encontrado...\n");
        }
    }
}