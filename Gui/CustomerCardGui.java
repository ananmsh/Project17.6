import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CustomerCardGui {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text CustomerCardLBL;

    @FXML
    private Text FirstNameLPI;

    @FXML
    private Text LastNameLPI;

    @FXML
    private Text MailLPI;

    @FXML
    private Text IDLPI;

    @FXML
    private Text PurchaseListLPI;

    @FXML
    private TextField SearchTxt;

    @FXML
    private ComboBox<?> PurchaseListCMB;

    @FXML
    private Text TypeOfPurchaseLPI;

    @FXML
    void PurchaseListCMB(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert CustomerCardLBL != null : "fx:id=\"CustomerCardLBL\" was not injected: check your FXML file 'Customer card.fxml'.";
        assert FirstNameLPI != null : "fx:id=\"FirstNameLPI\" was not injected: check your FXML file 'Customer card.fxml'.";
        assert LastNameLPI != null : "fx:id=\"LastNameLPI\" was not injected: check your FXML file 'Customer card.fxml'.";
        assert MailLPI != null : "fx:id=\"MailLPI\" was not injected: check your FXML file 'Customer card.fxml'.";
        assert IDLPI != null : "fx:id=\"IDLPI\" was not injected: check your FXML file 'Customer card.fxml'.";
        assert PurchaseListLPI != null : "fx:id=\"PurchaseListLPI\" was not injected: check your FXML file 'Customer card.fxml'.";
        assert SearchTxt != null : "fx:id=\"SearchTxt\" was not injected: check your FXML file 'Customer card.fxml'.";
        assert PurchaseListCMB != null : "fx:id=\"PurchaseListCMB\" was not injected: check your FXML file 'Customer card.fxml'.";
        assert TypeOfPurchaseLPI != null : "fx:id=\"TypeOfPurchaseLPI\" was not injected: check your FXML file 'Customer card.fxml'.";

    }
}
