package captainsly.metalarchives.ui;

import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class BandSearchNode extends Parent {

	private BorderPane searchRootPane;
	private TextField searchField;

	
	
	public BandSearchNode() {
		searchRootPane = new BorderPane();
		searchField = new TextField();
		
		
		
	}

}
