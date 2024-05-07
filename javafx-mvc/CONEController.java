import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CONEController
{
    CONEView coneView;
    Stage stage;
    CONE cone;
    public TextField textFieldAltura;
    public TextField textFieldRaio;
    public Label labelResultado;
    
    /**
     * Construtor para objetos da classe IMCController
     */
    public CONEController()
    {
        this.stage = new Stage();
        this.coneView = new CONEView();
        this.coneView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.coneView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event e) {
        try {
            double altura = Double.parseDouble(textFieldAltura.getText());
            double raio = Double.parseDouble(textFieldRaio.getText());
            CONE cone = new CONE(altura, raio);
            this.labelResultado.setText(cone.interpretar());
        } catch (NumberFormatException exception) {
            labelResultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        textFieldAltura.setText("");
        textFieldRaio.setText("");
        labelResultado.setText("");
    }    
}
