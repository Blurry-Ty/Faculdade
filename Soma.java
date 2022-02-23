import javax.swing.JOptionPane;

public class Soma {
    public static void main(String[] args){
        float primeiroValor;
        float segundoValor;
        float resultado;

        primeiroValor = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        segundoValor = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo valor:"));
        resultado = primeiroValor + segundoValor;

        JOptionPane.showMessageDialog(null, "A soma dos numeros é " + resultado);
    }    
}
