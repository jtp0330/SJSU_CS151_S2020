package a8;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Calculator extends Application{



	public static void main(String[] args) {
		Application.launch(args);
	}

	public void start(Stage s)
	{
		//Numbers, dot, clear
		Button b1 = new Button("0");
		Button b2 = new Button("1");
		Button b3 = new Button("2");
		Button b4 = new Button("3");
		Button b5 = new Button("4");
		Button b6 = new Button("5");
		Button b7 = new Button("6");
		Button b8 = new Button("7");
		Button b9 = new Button("8");
		Button b10 = new Button("9");
		Button b11 = new Button(".");
		Button b12 = new Button("AC");
		//Operators Buttons
		Button b13 = new Button("+");
		Button b14 = new Button("-");
		Button b15 = new Button("*");
		Button b16 = new Button("/");
		Button b17 = new Button("=");
		TextField txt = new TextField();
		
		txt.setAlignment(Pos.TOP_CENTER);
		
		
		EventHandler<MouseEvent> clickb1 = new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent e)
			{
				 txt.appendText("0");
			}
		};	
		EventHandler<MouseEvent> clickb2 = new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent e)
			{
				 txt.appendText("1");
			}
		};	
		EventHandler<MouseEvent> clickb3 = new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent e)
			{
				 txt.appendText("2");
			}
		};	
		
		EventHandler<MouseEvent> clickb4 = new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent e)
			{
				 txt.appendText("3");
			}
		};	
		EventHandler<MouseEvent> clickb5 = new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent e)
			{
				 txt.appendText("4");
			}
		};	
		EventHandler<MouseEvent> clickb6 = new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent e)
			{
				 txt.appendText("5");
			}
		};	
		EventHandler<MouseEvent> clickb7 = new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent e)
			{
				 txt.appendText("6");
			}
		};	
		EventHandler<MouseEvent> clickb8 = new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent e)
			{
				 txt.appendText("7");
			}
		};	
		EventHandler<MouseEvent> clickb9 = new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent e)
			{
				 txt.appendText("8");
			}
		};	
		EventHandler<MouseEvent> clickb10 = new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent e)
			{
				 txt.appendText("9");
			}
		};	
		EventHandler<MouseEvent> clickb12 = new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent e)
			{
				 txt.setText(" ");
			}
		};	
		//operation handler
		/*EventHandler<MouseEvent> clickb13 = new EventHandler<MouseEvent>() {
			
			public void handle(MouseEvent e)
			{
				if(e.getSource() == b13) {
					String op1 = txt.getText();
					txt.setText("Enter Next value");
					txt.setText(e.getSource())
				}
				
				
				
				
			}
		}
		*/
		txt.setPrefWidth(300);
		b1.setPrefWidth(200);
		b2.setPrefWidth(200);
		b3.setPrefWidth(200);
		b4.setPrefWidth(200);
		b5.setPrefWidth(200);
		b6.setPrefWidth(200);
		b7.setPrefWidth(200);
		b8.setPrefWidth(200);
		b9.setPrefWidth(200);
		b10.setPrefWidth(200);
		b11.setPrefWidth(200);
		b12.setPrefWidth(200);
		b13.setPrefWidth(225);
		b14.setPrefWidth(225);
		b15.setPrefWidth(225);
		b16.setPrefWidth(225);
		b17.setPrefWidth(200);
		
		b1.setOnMouseClicked(clickb1);
		b2.setOnMouseClicked(clickb2);
		b3.setOnMouseClicked(clickb3);
		b4.setOnMouseClicked(clickb4);
		b5.setOnMouseClicked(clickb5);
		b6.setOnMouseClicked(clickb6);
		b7.setOnMouseClicked(clickb7);
		b8.setOnMouseClicked(clickb8);
		b9.setOnMouseClicked(clickb9);
		b10.setOnMouseClicked(clickb10);
		b12.setOnMouseClicked(clickb12);
		
		GridPane gp = new GridPane();
		gp.setVgap(1);
		gp.setHgap(0);
		gp.add(txt, 3, 0);
		gp.addRow(1, b1, b2, b3, b13);
		gp.addRow(2, b4, b5, b6, b14);
		gp.addRow(3, b7, b8, b9, b15);
		gp.addRow(4, b10, b11, b12, b16);
		gp.addRow(5, b17);
		b17.setAlignment(Pos.CENTER);
		gp.setMinSize(10, 10);
		
		Scene scene = new Scene(gp);
		s.setScene(scene);
		
		s.setX(10);
		s.setY(10);
		s.setMaxHeight(400);
		s.setMaxWidth(350);
		s.setTitle("Calculator");
		s.show();
		
		
	
		
	}
}


