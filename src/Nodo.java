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
  Nodo pai;

  public Nodo() {
    this.numero = 0;
    this.esquerda = null;
    this.direita = null;
    this.pai = null;
  }
}
