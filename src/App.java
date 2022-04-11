import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe para interagir com a árvore
 * 
 * @version 0.1.0
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class App {
  public static void main(String[] args) throws Exception {
    ArvoreView arvoreView = new ArvoreView();
    Arvore arvore = new Arvore();

    while (true) {
      Scanner scanner = new Scanner(System.in);
      int resposta = 0;

      try {
        System.out.println("Menu de opções");
        System.out.println("1 - Inserir nós (nodos) na árvore");
        System.out.println("2 - Listar árvores");
        System.out.println("3 - Sair");
        resposta = scanner.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Valor não numérico");
        continue;
      }

      if (resposta == 3) {
        System.out.println("Tenha um dia excelente!");
        scanner.close();
        System.exit(0);
      }

      switch (resposta) {
        case 1:
          int count = 0;

          try {
            System.out.println("Deseja inserir quantos nós na árvore?");
            count = scanner.nextInt();
          } catch (InputMismatchException e) {
            System.out.println("Não é possível inserir valores não numéricos");
            break;
          }

          if (count <= 0) {
            System.out.println("Não é possível inserir valores vazios ou negativos");
            break;
          }

          for (int i = 0; i < count; i++) {
            Nodo tmp = new Nodo();
            boolean status = false;
            do {
              status = arvoreView.inserirNumero(tmp, scanner);
            } while (status == false);
            arvore.inserir(tmp);
          }
          break;

        case 2:
          if (arvore.raiz == null) {
            System.out.println("Árvore vazia");
            break;
          }
          System.out.println("Listagem de nós da árvore");
          arvore.listar(arvore.raiz);
          break;

        default:
          System.out.println("Opção não reconhecida");
          break;
      }
    }
  }
}
