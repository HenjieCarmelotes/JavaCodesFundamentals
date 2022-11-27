package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * This GUI program draws a circle sticker picture using the java FX.
 */


public class CircleStickersGUI extends Application {
	
    public void drawPicture(GraphicsContext g, int width, int height) {

        g.setFill(Color.WHITE); 
        // As an example, draw a large number of colored disks.
        // To get a different picture, just erase this code, and substitute your own. 
        
        int centerX;     // The x-coord of the center of a disk.
        int centerY;     // The y-coord of the center of a disk.
        int colorSelector; // Used to select a random color.
        int count;       // Loop control variable for counting disks
        
        for (count = 0; count < 1000; count++) {
    
            centerX = (int)(width*Math.random());
            centerY = (int)(height*Math.random());
    
            colorSelector = (int)(5*Math.random());
            switch (colorSelector) {
            case 0:
                g.setFill(Color.RED);
                break;
            case 1:
                g.setFill(Color.GREEN);
                break;
            case 2:
                g.setFill(Color.CYAN);
                break;
            case 3:
                g.setFill(Color.YELLOW);
                break;
            case 4:
                g.setFill(Color.MAGENTA);
                break;
            
            }
    
            g.fillOval( centerX - 25, centerY - 25, 50, 50 );
            g.setStroke(Color.BLACK);
            g.strokeOval( centerX - 25, centerY - 25, 50, 50 );
        }

    } // end drawPicture()

    //------ Implementation details: DO NOT EXPECT TO UNDERSTAND THIS ------


    public void start(Stage stage) {
        int width = 800;   
        int height = 600;  
        Canvas canvas = new Canvas(width,height);
        drawPicture(canvas.getGraphicsContext2D(), width, height);
        BorderPane root = new BorderPane(canvas);
        root.setStyle("-fx-border-width: 10px; -fx-border-color: #341");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Circle Stickers Everywhere!");
        stage.show();
        stage.setResizable(false);
    } 

    public static void main(String[] args) {
        launch();
    }
	
	

} //end of class CircleStickersGUI
