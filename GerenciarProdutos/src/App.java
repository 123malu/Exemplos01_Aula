import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("\n --- Gerenciar Produtos --- ");
        System.out.println(" ------------------------ ");


        MenuProduto menu = new MenuProduto();

        int opcao = 0;

        do{
            opcao = menu.exibirMenu(sc);

            switch (opcao) {

                case 1:
                    menu.addProduto(sc);
                    break;

                case 2:
                    menu.listarProdutos();
                    break;

                case 3:
                    menu.removerProduto(sc);
                    break;

                case 4:
                    menu.exibirInformacoes(sc);
                    break;

                default:
                    if(opcao != 5) System.out.println("\n Opção inválida!\n\n");
                    break;
            }

        } while (opcao != 5);



        // Exemplo da aula

        /*produtos.add(new Produto("Notebook", 3500.00));
        produtos.add(new Produto("Mouse", 80.00));
        produtos.add(new Produto("Teclado", 150.00));

        for(Produto produto : produtos){
            System.out.print(produto.getNome());
            System.out.println(" - R$" + produto.getpreco());
        }*/
    

        sc.close();
    }

}