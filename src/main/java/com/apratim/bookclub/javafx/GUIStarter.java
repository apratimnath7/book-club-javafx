package com.apratim.bookclub.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 
 * @author Cyntexia
 *
 */
public class GUIStarter extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Default code - TODO
		Button button = new Button("Say, Hello World");

		button.setOnAction(eventHandler -> {
			System.out.println("Hello World");
		});
		StackPane root = new StackPane();
		root.getChildren().add(button);
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.setTitle("New JavaFX Application");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
