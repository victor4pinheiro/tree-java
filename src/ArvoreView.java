import java.util.InputMismatchException;
import java.util.Scanner;

public class ArvoreView {

  public boolean inserirNumero(Nodo tmpNodo, Scanner tmpScanner) throws InputMismatchException {
    try {
      System.out.println("Digite um número inteiro:");
      tmpNodo.numero = tmpScanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Não é possível inserir valor não numérico");
      tmpScanner.nextLine();
      return false;
    }
    return true;
  }
}
