import javax.swing.JOptionPane;


public class CotaDolar {
    public static void main(String[] arg){
        double dolarAtual;
        double quantidadeDolar;
        double resultado;

        dolarAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação atual do dolar:"));
        quantidadeDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos dolares possui:"));
        resultado = dolarAtual * quantidadeDolar;

        JOptionPane.showMessageDialog(null,"A quantidade em reais é de " + resultado);

    }
}
