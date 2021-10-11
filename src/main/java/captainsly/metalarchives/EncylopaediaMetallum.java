package captainsly.metalarchives;

import captainsly.metalarchives.ui.BandOverviewNode;
import captainsly.metalarchives.ui.BandSearchNode;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EncylopaediaMetallum extends Application {

	private BandSearchNode bandSearchNode;
	private BandOverviewNode bandOverviewNode;

	private SplitPane splitPane;
	private ScrollPane scrollPane;

	private VBox vbox;
	private VBox vbox2;

	@Override
	public void start(Stage primaryStage) throws Exception {

		vbox = new VBox();
		vbox2 = new VBox();

		splitPane = new SplitPane();

		scrollPane = new ScrollPane(vbox2);

		splitPane.getItems().addAll(vbox, scrollPane);

		Scene scene = new Scene(splitPane);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
