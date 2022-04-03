public class Arvore {
  Nodo raiz;

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

  public void listar(Nodo inicio) {
    System.out.print(" " + inicio.numero);
    if (inicio.esquerda != null)
      listar(inicio.esquerda);

    if (inicio.direita != null)
      listar(inicio.direita);
  }
}
