package ie.gmit.sw.ai;

import java.io.IOException;

import javafx.application.Application;


public class Runner {
		
	public static void main(String[] args) throws ClassNotFoundException, IOException, Exception {
		/*
		 * PLEASE READ CAREFULLY
		 * ---------------------
		 * If you need to load FCL functions to the application or
		 * train, configure and load a neural network, then it is 
		 * best to do all of this before loading the UI. Launching
		 * a UI in any language or framework and then starting a 
		 * long running task in the same thread is guaranteed to
		 * freeze the screen and crash the programme.
		 * 
		 * NB: you can assume that the JavaFX 15 API is already
		 * available and configured on the MODULE-PATH (NOT THE 
		 * CLASSPATH). 
		 */
		
		  //Add long-running initialisation instructions here.
		
		
		
		/*
		 * Launch the JavaFX UI only when all the long-running AI 
		 * configuration tasks have been completed. Use the arrow 
		 * keys to move the player character and the 'Z' key to 
		 * toggle the zoom in / out.
		 */
		LoadNN n = new LoadNN();
		LoadFCL f1 = new LoadFCL();
		f1.getActions(100, 100, 20);
		n.Load();
		Application.launch(GameWindow.class, args);
	}
}