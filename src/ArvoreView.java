import java.util.InputMismatchException;
import java.util.Scanner;

public class ArvoreView {

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
}
