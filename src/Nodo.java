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
  public static void inserir(int numero) {
    raiz = inserirNodo(raiz, numero);
  }

  /**
   * Insere o valor no Nodo de acordo com a sua posição atual na árvore de forma
   * recursiva
   * 
   * @param tmpNodo Nodo atual a ser verificado e possivelmente atribuído
   * @param value   valor a ser inserido no Nodo
   * @return Nodo com o valor já atribuido
   */
  private static Nodo inserirNodo(Nodo tmpNodo, int value) {
    if (tmpNodo == null)
      return new Nodo(value);

    if (value < tmpNodo.numero)
      tmpNodo.esquerda = inserirNodo(tmpNodo.esquerda, value);
    else if (value > tmpNodo.numero)
      tmpNodo.direita = inserirNodo(tmpNodo.direita, value);
    else
      return tmpNodo;

    return tmpNodo;
  }
}
