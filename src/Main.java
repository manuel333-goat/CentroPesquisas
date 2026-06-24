import ui.Apresentacao;
import javax.swing.SwingUtilities;
 
public class Main {
 
    public static void main(String[] args) {
 
        // Boa prática: lançar janelas Swing na Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            Apresentacao tela = new Apresentacao();
            tela.setVisible(true);
        });
 
        // TODO: fluxo futuro será:
        // Apresentacao → LoginVisao → MenuPrincipalVisao
    }
}
 
