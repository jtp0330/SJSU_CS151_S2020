package a8;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	public void start(Stage s)
	{
		Button rotate = new Button("Rotate");
		Button fade = new Button("Fade");
		Button scale = new Button("Scale");
		Button seq = new Button("Sequential");
		
		//sphere
		Sphere sp = new Sphere();
		sp.setRadius(30.0f);
		//border
		sp.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
		+ "-fx-border-width: 2;" + "-fx-border-insets: 1;" + "-fx-border-radius: 1;"
		+ ""+"-fx-border-color: #000001;");
		//
		PhongMaterial ph = new PhongMaterial();
		ph.setDiffuseColor(Color.ALICEBLUE);
		sp.setMaterial(ph);
		
		ScaleTransition sc = new ScaleTransition(Duration.millis(2000), sp);
		sc.setByX(1.5f);
		sc.setByY(1.5f);
		sc.setCycleCount(2);
		sc.setAutoReverse(true);
		sc.play();
		
		//cylinder
		Cylinder c = new Cylinder();
		c.setRadius(30.0f);
		c.setHeight(70.0f);
		RotateTransition r = new RotateTransition(Duration.millis(2000), c);
		r.setByAngle(20);
		r.setCycleCount(2);
		r.setAutoReverse(true);
		r.play();
		
		//polygon
		Polygon p = new Polygon();
		p.getPoints().addAll(new Double[] {200.0, 300.0, 300.0, 200.0, 225.0, 230.0});
		p.setFill(Color.CYAN);
		FadeTransition f = new FadeTransition(Duration.millis(3000), p);
		f.setFromValue(2.2);
		f.setToValue(3.4);
		f.setCycleCount(2);
		f.setAutoReverse(true);
		f.play();
		
		//box
		Box b = new Box();
		b.setHeight(80.0f);
		b.setWidth(50.0f);
		b.setDepth(60.0f);
		SequentialTransition st = new SequentialTransition(b, r, sc);
		st.play();
		
		
		
		GridPane gp = new GridPane();
		
		gp.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"+
					"-fx-border-width: 2;" + "-fx-border-insets: 5;" +
					"-fx-border-radius: 5;" + "-fx-border-color: black;");
		
		EventHandler<MouseEvent> ro = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				
					r.play();
				
			}
		};
		EventHandler<MouseEvent> fa = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				
					f.play();
				
			}
		};
		EventHandler<MouseEvent> sca = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				
					sc.play();
				
			}
		};
		EventHandler<MouseEvent> sequ = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent e) {
				
					st.play();
				
			}
		};
		
		rotate.setOnMouseClicked(ro);
		fade.setOnMouseClicked(fa);
		scale.setOnMouseClicked(sca);
		seq.setOnMouseClicked(sequ);
		
		gp.add(c, 0, 0);
		gp.add(sp, 0, 1);
		gp.add(p, 1, 0);
		gp.add(b, 1, 1);
		gp.add(rotate, 6, 4);
		gp.add(fade, 6, 5);
		gp.add(scale, 7, 4);
		gp.add(seq, 7, 5);
		
		Scene scene = new Scene(gp);
		s.setScene(scene);
		
		s.setX(300);
		s.setY(300);
		s.setMinHeight(200);
		s.setMinWidth(350);
		s.setTitle("Animation");
		s.show();
		
		
		
	}
	
}
