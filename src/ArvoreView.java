import java.util.InputMismatchException;
import java.util.Scanner;

public class ArvoreView {
  /**
   * Insere nodos de acordo com a quantidade de nodos (se válido)
   * 
   * @param tmpScanner scanner temporário para entrada de valores digitadas pelo
   *                   usuário
   */
  public void inserirNodos(Scanner tmpScanner) {
    int count = 0;

    try {
      System.out.println("Deseja inserir quantos nós na árvore?");
      count = tmpScanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Não é possível inserir valores não numéricos");
      return;
    }

    if (count <= 0) {
      System.out.println("Não é possível inserir valores vazios ou negativos");
      return;
    }

    for (int i = 0; i < count; i++) {
      boolean status = false;
      do {
        status = inserirNumero(tmpScanner);
      } while (status == false);
    }
  }

  /**
   * Insere o nodo com o valor dentro da árvore
   * 
   * @param tmpScanner scanner temporário para entrada de valores digitadas pelo
   *                   usuário
   * @return verdadeiro se a inserção foi bem sucedidade, caso contrário, falso
   */
  public Boolean inserirNumero(Scanner tmpScanner) {
    int numero = 0;
    try {
      System.out.println("Digite um número inteiro:");
      numero = tmpScanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Não é possível inserir valor não numérico");
      tmpScanner.nextLine();
      return false;
    }
    Nodo.inserir(numero);
    return true;
  }

  /**
   * Lista os nodos de acordo com o tipo de ordem selecionada pelo usuário
   * 
   * @param tmpScanner scanner temporário para entrada de valores digitadas pelo
   *                   usuário
   */
  public void listarNodos(Scanner tmpScanner) {
    if (Nodo.raiz == null) {
      System.out.println("Árvore vazia");
      return;
    }

    int option = 0;
    try {
      System.out.println("Qual tipo de listagem em profundidade deseja fazer?");
      System.out.println("1 - Pré-ordem (raiz - esquerda - direita)");
      System.out.println("2 - Em ordem (esquerda - raiz - direita)");
      System.out.println("3 - Pós-ordem (esquerda - direita - raiz)");
      option = tmpScanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Valor não numérico");
      return;
    }

    switch (option) {
      case 1:
        System.out.println("Pré-ordem:");
        Nodo.preordem(Nodo.raiz);
        System.out.print("\n");
        break;

      case 2:
        System.out.println("Em ordem:");
        Nodo.ordem(Nodo.raiz);
        System.out.print("\n");
        break;

      case 3:
        System.out.println("Pós-ordem:");
        Nodo.posordem(Nodo.raiz);
        System.out.print("\n");
        break;

      default:
        System.out.println("Opção não reconhecida.");
        break;
    }
  }
}
