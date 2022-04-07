package com.apratim.bookclub.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * 
 * @author Cyntexia
 *
 */
public class GUIStarter extends Application {
	Stage window;
	Scene startScene;

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;

		Parent root = FXMLLoader.load(getClass().getResource("design/EntryPoint.fxml"));
		startScene = new Scene(root);

		window.setScene(startScene);
		window.setTitle("New JavaFX Application");
		window.getIcons().add(new Image("https://www.iconpacks.net/icons/2/free-opened-book-icon-3169-thumb.png"));
		window.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
