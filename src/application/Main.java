package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import rumorsapp.BubbleSpec;
import rumorsapp.BubbledLabel;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());			
			Pane p = new Pane();			
			p.setPrefSize(400, 400);
			p.setBackground(new Background(new BackgroundFill(Color.GOLD,
					null, null)));
			root.getChildren().add(p);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Conversation about Bubbles with Elltz");
			primaryStage.show();
			BubbledLabel bl1 = new BubbledLabel(BubbleSpec.FACE_LEFT_CENTER);
			bl1.relocate(10, 50);
			bl1.setText("Hi Elltz -:)");
			bl1.setBackground(new Background(new BackgroundFill(Color.VIOLET,
					null, null)));
			
			
			BubbledLabel bl2 = new BubbledLabel(BubbleSpec.FACE_RIGHT_CENTER);
			bl2.relocate(310, 100);
			bl2.setText("Heloooo Me");
			bl2.setBackground(new Background(new BackgroundFill(Color.LIGHTPINK,
					null, null)));
			
			BubbledLabel bl3 = new BubbledLabel(BubbleSpec.FACE_LEFT_CENTER);
			bl3.relocate(10, 150);
			bl3.setText("you know this would be a nice library");
			bl3.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN,
					null, null)));
			
			
			BubbledLabel bl4 = new BubbledLabel(BubbleSpec.FACE_RIGHT_CENTER);
			bl4.relocate(165, 200);
			bl4.setText("uhmm yea, kinda, but yknow,im tryna \nact like im not impressed");
			bl4.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW,
					null, null)));
			
			BubbledLabel bl5 = new BubbledLabel(BubbleSpec.FACE_LEFT_CENTER);
			bl5.relocate(10, 250);
			bl5.setText("yea! yea! i see that, lowkey.. you not gonna\n get upvotes though..lmao");
			bl5.setBackground(new Background(new BackgroundFill(Color.YELLOWGREEN,
					null, null)));
			
			
			BubbledLabel bl6 = new BubbledLabel(BubbleSpec.FACE_RIGHT_CENTER);
			bl6.relocate(165, 300);
			bl6.setText("Man! shut up!!.. what you know about\n upvotes.");
			bl6.setBackground(new Background(new BackgroundFill(Color.GREENYELLOW,
					null, null)));
			
			
			p.getChildren().addAll(bl1,bl2,bl3,bl4,bl5,bl6);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
