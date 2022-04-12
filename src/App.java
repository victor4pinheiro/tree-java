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

    while (true) {
      Scanner scanner = new Scanner(System.in);
      int resposta = 0;

      try {
        System.out.println("Menu de opções");
        System.out.println("1 - Inserir nós (nodos) na árvore");
        System.out.println("2 - Listar os valores da árvore de acordo com a profundidade da árvore");
        System.out.println("3 - Listar os valores da árvore de acordo com a largura da árvore");
        System.out.println("4 - Sair");
        resposta = scanner.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Valor não numérico");
        continue;
      }

      if (resposta == 4) {
        System.out.println("Tenha um dia excelente!");
        scanner.close();
        System.exit(0);
      }

      switch (resposta) {
        case 1:
          arvoreView.inserirNodos(scanner);
          break;

        case 2:
          arvoreView.listarNodos(scanner);
          break;

        case 3:
          Nodo.imprimirNodosPorLargura(Nodo.raiz);
          System.out.print("\n");
          break;

        default:
          System.out.println("Opção não reconhecida");
          break;
      }
    }
  }
}
