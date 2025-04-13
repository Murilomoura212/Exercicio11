import javax.swing.JOptionPane;

public class Exercicio11{

    public static void main(String[] args) {
    double salario, emprestimo, soma;
            salario =  Double.parseDouble(JOptionPane.showInputDialog("Coloque seu salario: "));
            emprestimo =  Double.parseDouble(JOptionPane.showInputDialog("Coloque Quanto quer de credito: "));
             soma = emprestimo/0.3;
                if (soma<salario){JOptionPane.showMessageDialog(null,"Voce pode fazer essa prestação : ");
                }else{JOptionPane.showMessageDialog(null,"Voce não pode fazer essa prestação ");
                }
    }
   
}
