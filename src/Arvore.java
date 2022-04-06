/**
 * Classe para permitir a inserção e listagem de nós na árvore através da raiz
 * 
 * @version 0.1.0
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class Arvore {
  public Nodo raiz;

  /**
   * Insere o nó na árvore verificando se o número possuído pelo nó é maior ou
   * menor que raiz da árvore
   * 
   * @param novo nó a ser inserido
   */
  public void inserir(Nodo novo) {
    if (raiz == null) {
      raiz = novo;
    } else {
      Nodo aux = raiz;
      while (aux != null) {
        if (novo.numero < aux.numero) {
          if (aux.esquerda == null) {
            aux.esquerda = novo;
            break;
          }
          aux = aux.esquerda;
        } else {
          if (aux.direita == null) {
            aux.direita = novo;
            break;
          }
          aux = aux.direita;
        }
      }
      novo.pai = aux;
    }
  }

  /**
   * Lista todos os nós de forma recursiva
   * 
   * @param inicio nó inicial que a listagem continue a partir dele
   */
  public void listar(Nodo inicio) {
    if (inicio == null)
      return;
    listar(inicio.esquerda);
    System.out.println(inicio.numero);
    listar(inicio.direita);
  }
}
