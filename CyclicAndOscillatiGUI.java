package application;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *  This program demonstrates the oscillation and cyclic motion using frames.
 */
public class CyclicAndOscillateGUI extends Application {
	/**
     * Draws one frame of an animation. This subroutine should be called
     * about 60 times per second.  It is responsible for redrawing the
     * entire drawing area. The parameter g is used for drawing. The frameNumber 
     * starts at zero and increases by 1 each time this subroutine is called.  
     * The parameter elapsedSeconds gives the number of seconds since the animation
     * was started.  By using frameNumber and/or elapsedSeconds in the drawing
     * code, you can make a picture that changes over time.  That's an animation.
     * The parameters width and height give the size of the drawing area, in pixels.  
     */
    public void drawFrame(GraphicsContext g, int frameNumber, double elapsedSeconds, int width, int height) {

        g.setFill(Color.WHITE);
        g.fillRect(0, 0, width, height); // First, fill the entire image with a background color!

        /* Show cyclic motion at three speeds.  In each case, a square 
         * moves across the drawing area from left to right, then jumps
         * back to the start.
         */

        int cyclicFrameNum;
        
        cyclicFrameNum = frameNumber % 800;  // Repeats every 800 frames (Normal Speed)
        g.setFill(Color.RED);
        g.fillRect( cyclicFrameNum, 0, 100, 100 );
        
        cyclicFrameNum = frameNumber % 400;  // Repeats every 400 frames (twice than normal speed!)
        g.setFill(Color.GREEN);
        g.fillRect( 2*cyclicFrameNum, 100, 100, 100 );
        
        cyclicFrameNum = frameNumber % 300;  // Repeats every 100 frames (thrice than normal speed!)
        g.setFill(Color.BLUE);
        g.fillRect( 3*cyclicFrameNum, 200, 100, 100 );
        

        /* Show oscillating motion at three speeds.  In each case, a square 
         * moves across the drawing area from left to right, then reverses
         * direction to move from right to left back to its starting point.
         */
        
        int oscillationFrameNum;
        
        oscillationFrameNum = frameNumber % 1600;  // repeats every 1600 frames
        if (oscillationFrameNum > 800)
            oscillationFrameNum = 1600 - oscillationFrameNum; // after 800, the values go backwards back to 0
        g.setFill(Color.CYAN);
        g.fillRect( oscillationFrameNum, 300, 100, 100 );
        
        oscillationFrameNum = frameNumber % 800; // repeats every 800 frames
        if (oscillationFrameNum > 400)
            oscillationFrameNum = 800 - oscillationFrameNum; 
        g.setFill(Color.MAGENTA);
        g.fillRect( 2*oscillationFrameNum, 400, 100, 100 );
        
        oscillationFrameNum = frameNumber % 530; // repeats every 500 frames
        if (oscillationFrameNum > 265)
            oscillationFrameNum = 510 - oscillationFrameNum; 
        g.setFill(Color.YELLOW);
        g.fillRect( 3*oscillationFrameNum, 500, 100, 100 );
        
        
        /* Draw horizontal black lines across the window to separate the
         * regions used by the six squares. 
         */
        
        g.setStroke(Color.BLACK);
        for ( int y = 100; y < 600; y = y + 100 )
            g.strokeLine(0,y+0.5,900,y+0.5);
     }

   


    public void start(Stage stage) {
        int width = 900;   
        int height = 600; 
        Canvas canvas = new Canvas(width,height);
        drawFrame(canvas.getGraphicsContext2D(), 0, 0, width, height);
        BorderPane root = new BorderPane(canvas);
        root.setStyle("-fx-border-width: 4px; -fx-border-color: #444");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Cyclic and Osscilate Demo");
        stage.show();
        stage.setResizable(false);
        AnimationTimer anim = new AnimationTimer() {
            private int frameNum;
            private long startTime = -1;
            private long previousTime;
            public void handle(long now) {
                if (startTime < 0) {
                    startTime = previousTime = now;
                    drawFrame(canvas.getGraphicsContext2D(), 0, 0, width, height);
                }
                else if (now - previousTime > 0.95e9/60) {
                       // The test in the else-if is to guard against a bug that has shown
                       // up in some versions of JavaFX on some computers.  The bug allows
                       // the handle() method to be called many times more than the 60 times
                       // per second that is specified in the JavaFX documentation.
                    frameNum++;
                    drawFrame(canvas.getGraphicsContext2D(), frameNum, (now-startTime)/1e9, width, height);
                    previousTime = now;
                }
            }
        };
        anim.start();
    } 

    public static void main(String[] args) {
        launch();
    }


} // end of the class.
