import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Classe padrão para criar cada nó da árvore
 * 
 * @version 0.1.0
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class Nodo {
  int numero;
  Nodo esquerda;
  Nodo direita;
  int nivelArvore;
  public static Nodo raiz;

  /**
   * Inicializa os valores no atual nodo
   * 
   * @param numero número a ser inserido no Nodo atual
   */
  public Nodo(int numero) {
    this.numero = numero;
    this.esquerda = null;
    this.direita = null;
  }

  /**
   * Insere valores na árvore a partir da raiz
   * 
   * @param numero número a ser adicionado
   */
  public static void inserir(int valor) {
    inserir(raiz, valor);
  }

  /**
   * Insere diretamente o valor no Nodo de acordo com a sua posição atual na
   * árvore de forma recursiva
   * 
   * @param tmpNodo Nodo atual a ser verificado e possivelmente atribuído
   * @param numero  valor a ser inserido no Nodo
   */
  public static void inserir(Nodo tmpNodo, int numero) {
    if (tmpNodo == null) {
      System.out.println("Raiz " + numero);
      raiz = new Nodo(numero);
    } else {
      if (numero < tmpNodo.numero) {
        if (tmpNodo.esquerda != null) {
          inserir(tmpNodo.esquerda, numero);
        } else {
          System.out.println("Inserindo " + numero + " à esquerda de " + tmpNodo.numero);
          tmpNodo.esquerda = new Nodo(numero);
        }

      } else {
        if (tmpNodo.direita != null) {
          inserir(tmpNodo.direita, numero);
        } else {
          System.out.println("Inserindo " + numero + " à direita de " + tmpNodo.numero);
          tmpNodo.direita = new Nodo(numero);
        }
      }
    }
  }

  /**
   * Lista os nós (nodos) de uma árvore em pré-ordem: pai (raiz) - esquerda -
   * direita
   * 
   * @param node nodo de origem para percorrer
   */
  public static void preordem(Nodo node) {
    if (node != null) {
      System.out.print(node.numero + ", ");
      preordem(node.esquerda);
      preordem(node.direita);
    }
  }

  /**
   * Lista os nós (nodos) de uma árvore em ordem: esquerda - pai (raiz) - direita
   * 
   * @param node nodo de origem para percorrer
   */
  public static void posordem(Nodo node) {
    if (node != null) {
      posordem(node.esquerda);
      posordem(node.direita);
      System.out.print(node.numero + ", ");
    }
  }

  /**
   * Lista os nós (nodos) de uma árvore em pós-ordem: esquerda - direita - pai
   * (raiz)
   * 
   * @param node nodo de origem para percorrer
   */
  public static void ordem(Nodo node) {
    if (node != null) {
      ordem(node.esquerda);
      System.out.print(node.numero + ", ");
      ordem(node.direita);
    }
  }

  /**
   * Imprimi os nodos de acordo com a largura da árvore
   * 
   * @param node origem (valor inicial) para a árvore ser percorrida
   */
  public static void imprimirNodosPorLargura(Nodo node) {
    if (node == null) {
      System.out.println("Árvore vazia");
    } else {
      System.out.println();
      Deque<Nodo> fila = new ArrayDeque<Nodo>();
      fila.add(node);
      while (!fila.isEmpty()) {
        Nodo atual = fila.removeFirst();

        System.out.print(atual.numero + ", ");
        if (atual.esquerda != null) {
          fila.add(atual.esquerda);
        }
        if (atual.direita != null) {
          fila.add(atual.direita);
        }
      }
    }
  }
}
