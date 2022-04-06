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
    Scanner scanner = new Scanner(System.in);
    String resposta = null;

    while (true) {
      System.out.println("Deseja inserir nós na árvore? (S/n)");
      resposta = scanner.next();

      if (resposta.equals("N") || resposta.equals("n")) {
        System.out.println("Tenha um bom dia");
        scanner.close();
        System.exit(0);
      } else if (resposta.equals("S") || resposta.equals("s")) {
        break;
      }
    }

    Arvore arvore = new Arvore();

    try {
      System.out.println("Deseja inserir quantos nós na árvore?");
      int count = scanner.nextInt();

      if (count <= 0) {
        System.out.println("Inserção não realizada");
        System.exit(0);
      }

      for (int i = 0; i < count; i++) {
        Nodo tmp = new Nodo();
        System.out.println("Digite um número inteiro aleatório:");
        tmp.numero = scanner.nextInt();
        arvore.inserir(tmp);
      }

      System.out.println("Deseja listar todos os valores? (S/n)");
      resposta = scanner.next();

      if (resposta.equals("N") || resposta.equals("n")) {
        System.out.println("Tenha um bom dia");
        scanner.close();
        System.exit(0);
      } else if (resposta.equals("S") || resposta.equals("S")) {
        arvore.listar(arvore.raiz);
      } else {
        System.out.println("Opção não reconhecida");
      }
    } catch (Exception e) {
      System.out.println("Valor não inteiro");
    }
  }
}
