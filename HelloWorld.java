import javax.swing.JOptionPane;

//python: print("Hello World")

public class HelloWorld{
    public static void main(String[] args){
        double baseTri;
        double altTri;
        double resultado;

        baseTri = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triangulo:"));
        altTri = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triangulo:"));
        resultado = baseTri * altTri/2;

        JOptionPane.showMessageDialog(null,"A area do triangula é: " + resultado);

    }
}