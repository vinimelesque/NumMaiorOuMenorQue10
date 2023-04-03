
import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {

        int num1;
        String mensagem;
                                    /*solicita ao usuário um número*/
        mensagem = JOptionPane.showInputDialog("Digite um número:");
        num1 = Integer.parseInt(mensagem);

        /*verifica se o número é maior que 10.*/
        if (num1 > 10) {
            JOptionPane.showMessageDialog(null, "O número digitado é maior que 10!");
        } else if (num1 == 10) { //verifica se o numero é igual a 10.
            JOptionPane.showMessageDialog(null, "O número digitado é igual a 10!");
        } else { //caso nenhum dos dois, ele diz que é menor que dez.
            JOptionPane.showMessageDialog(null, "O número digitado é menor que 10!");
        }
    }

}
