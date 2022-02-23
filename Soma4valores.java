import javax.swing.JOptionPane;
public class Soma4valores {
    public static void main(String[] args){
        double valor1;
        double valor2;
        double valor3;
        double valor4;
        double resultado;

        valor1 =Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        valor2 =Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        valor3 =Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor:"));
        valor4 =Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto valor:"));

        resultado = valor1*valor1 + valor2*valor2 + valor3*valor3 + valor4*valor4;

        JOptionPane.showMessageDialog(null, "A soma dos quadrados dos valores é " + resultado);

    }
}
