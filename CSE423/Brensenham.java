//package DDA;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;
import java.lang.Math;
import javax.swing.JFrame;

class ThirdGLEventListener implements GLEventListener {
/**
 * Interface to the GLU library.
 */
private GLU glu;

/**
 * Take care of initialization here.
 */
public void init(GLAutoDrawable gld) {
    GL2 gl = gld.getGL().getGL2();
    glu = new GLU();

    gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    gl.glViewport(-250, -150, 250, 150);
    gl.glMatrixMode(GL2.GL_PROJECTION);
    gl.glLoadIdentity();
    glu.gluOrtho2D(-250.0, 250.0, -150.0, 150.0);
}

/**
 * Take care of drawing here.
 */
public void display(GLAutoDrawable drawable) {
    GL2 gl = drawable.getGL().getGL2();

    gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
    /*
     * put your code here
     */

    drawLine(gl, 0, 0, 70, 40);
    
    
}
    
    
    


public void reshape(GLAutoDrawable drawable, int x, int y, int width,
        int height) {
}

public void displayChanged(GLAutoDrawable drawable,
        boolean modeChanged, boolean deviceChanged) {
}

private void drawLine(GL2 gl, int x1, int y1, int x2, int y2) {
    gl.glPointSize(1.0f);
    gl.glBegin(GL2.GL_POINTS);// begin plotting points
    int steps;
    int dx = (x2 - x1),dy = (y2 - y1),x=x1,y=y1;
    steps = dx;
    int m = dy/dx;
    int b = y-(m*x);
    gl.glVertex2i(x , y );
    
    for( int i = 0; i < steps; i++ )
    {
    	int Pk = (int)((2*dy*x)-(2*dx*y)+(2*dy+dx*((2*b)-1)));
        y = (Pk<0)?y:y+1;
        x++;
        System.out.println("("+x+","+y+")");
        gl.glVertex2i(x , y );
    }
    gl.glEnd();//end drawing of points

}
public void dispose(GLAutoDrawable arg0)
{
 
}
}
public class Brensenham
{
public static void main(String args[])
{
 //getting the capabilities object of GL2 profile
 final GLProfile profile=GLProfile.get(GLProfile.GL2);
 GLCapabilities capabilities=new GLCapabilities(profile);
 // The canvas
 final GLCanvas glcanvas=new GLCanvas(capabilities);
 ThirdGLEventListener b=new ThirdGLEventListener();
 glcanvas.addGLEventListener(b);
 glcanvas.setSize(400, 400);
 //creating frame
 final JFrame frame=new JFrame("Basic frame");
 //adding canvas to frame
 frame.add(glcanvas);
 frame.setSize(640,480);
 frame.setVisible(true);
}
}
