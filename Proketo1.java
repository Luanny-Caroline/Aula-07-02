import javax.swing.JOptionPane;

public class Compra
{
    public static void main( String[] args )
    {
        String legumes = 
           JOptionPane.showInputDialog("Digite a quantidade de legumes desejados");
        String frutas = 
           JOptionPane.showInputDialog("Digite a quantidade de frutas desejadas");
        String vegetais = 
           JOptionPane.showInputDialog("Digite a quantidade de vegetais desejados");
        
        //convertendo string para inteiro 
        int num1 = Integer.parseInt(legumes);
        int num2 = Integer.parseInt(frutas);
        int num3 = Integer.parseInt(vegetais);
        
       JOptionPane.showMessageDialog(null, "A quantidade de itens é:" + num1 + " Legumes, " + num2 + " Frutas, " + num3 + " Vegetais.", "Quantidade de Itens", JOptionPane.PLAIN_MESSAGE);
        
    }
}
