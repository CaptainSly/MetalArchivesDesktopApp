package captainsly.metalarchives.ui;

import com.github.loki.afro.metallum.entity.Band;

import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class BandOverviewNode extends Parent {

	private VBox bandOverviewRootVBox;
	private SplitPane bandOverviewSplit;
	private ScrollPane bandScrollPane;
	private GridPane bandInfoGrid;
	private TabPane bandCompleteOverviewTabPane;

	public BandOverviewNode(Band band) {
		bandOverviewRootVBox = new VBox();
		bandScrollPane = new ScrollPane();
		bandOverviewSplit = new SplitPane();
		bandInfoGrid = new GridPane();
		bandCompleteOverviewTabPane = new TabPane();

		setupBandInfoGrid(band);
		setupCompleteOverviewTabPane(band);
	}

	private void setupBandInfoGrid(Band band) {
		
	}

	private void setupCompleteOverviewTabPane(Band band) {
	}

}
