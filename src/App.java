import java.util.Random;

public class App {
  public static void main(String[] args) throws Exception {
    Arvore arvore = new Arvore();

    for (int i = 1; i < 10; i++) {
      Random random = new Random();
      Nodo tmp = new Nodo();
      tmp.numero = random.nextInt();
      arvore.inserir(tmp);
    }

    try {
      System.out.println("\n");
      System.out.println(arvore.raiz.esquerda);
      System.out.println(arvore.raiz.direita);
      System.out.println("\n");
    } catch (Exception e) {
      System.out.println("Vazio");
    }

    arvore.listar(arvore.raiz);
  }
}
