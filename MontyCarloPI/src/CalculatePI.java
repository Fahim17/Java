
//package DDA;
import javax.media.opengl.GL2;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.GLProfile;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.glu.GLU;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
	
	private int randDraw(GL2 gl) {
		gl.glPointSize(1.0f);
		gl.glBegin(GL2.GL_POINTS);// begin plotting points
		Random r = new Random();
		int a = r.nextInt(200)-100, b = r.nextInt(200)-100;
		
    	int sum = (int)(Math.pow(a,2)+Math.pow(b,2));
        sum = (int)Math.sqrt(sum);
        int out = 0;
        //System.out.println(sum);
        if(sum>100) {
        	gl.glColor3f(1f, 0f, 0f);
        	out = 1;
        }else
        	gl.glColor3f(0f, 1f, 0f);
		
		gl.glVertex2i(a, b);
		
		gl.glEnd();

		return out;		
	}
	
	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();

		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		/*
		 * put your code here
		 */
		Scanner sc = new Scanner(System.in);

		// **********Abstract points***************

    drawLine(gl, -100, 100, 100, 100);
    drawLine(gl, -100, -100, 100, -100);
    drawLine(gl, -100, -100, -100, 100);
    drawLine(gl, 100, -100, 100, 100);
    drawCircle(gl, 0, 0, 100);
    int inside = 0;
    int i = 0;
    for (i = 0; i < 10000; i++) {
    	int t = randDraw(gl);
    	inside = (t==0)?inside+1:inside;

	}
    System.out.println("*******************************");
    System.out.println("Total dots: "+i);
    System.out.println("Green dots: "+inside);
    double ratio = (double)inside/(double)i;
    System.out.println("ratio: "+ratio);
    System.out.println("PI value: "+ratio*4);
	
	}

	
	
	private void drawLine2(GL2 gl, int x1, int y1, int x2, int y2, int xmin, int xmax, int ymin, int ymax) {
		gl.glPointSize(1.0f);
		gl.glBegin(GL2.GL_POINTS);// begin plotting points
		int steps = 0;
		int dx = (x2 - x1), dy = (y2 - y1), x = 0, y = 0;
		int zn = zone(dx, dy);
		int tx1 = 0, ty1 = 0, tx2 = 0, ty2 = 0;
		int nx = dx, ny = dy;

		switch (zn) {
		case 0:
			nx = dx;
			ny = dy;
			break;
		case 1:
			nx = dy;
			ny = dx;
			break;
		case 2:
			nx = dy;
			ny = -dx;
			break;
		case 3:
			nx = -dx;
			ny = dy;
			break;
		case 4:
			nx = -dx;
			ny = -dy;
			break;
		case 5:
			nx = -dy;
			ny = -dx;
			break;
		case 6:
			nx = -dy;
			ny = dx;
			break;
		case 7:
			nx = dx;
			ny = -dy;
			break;

		}

		//System.out.println("zone: " + zn);
		//System.out.println();
		//System.out.println();

		gl.glVertex2i(x1, y1);

		int p = (2 * ny) - nx;
		steps = nx - 1;
		for (int i = 0; i < steps; i++) {
			// while((Math.abs(x))<(Math.abs(tx2))){
			if (p < 0)
				p = p + 2 * ny;
			else {
				p = p + (2 * ny) - (2 * nx);
				y++;
			}
			int xc = 0, yc = 0;
			switch (zn) {

			case 0:
				xc = (x + x1);
				yc = (y + y1);
				if (((xc > xmin) && (xc < xmax)) && ((yc > ymin) && (yc < ymax))) {
					gl.glColor3f(0f, 1f, 0f);
				}
				gl.glVertex2i(x + x1, y + y1);
				gl.glColor3f(1f, 0f, 0f);
				break;
			case 1:
				xc = (y + x1);
				yc = (x + y1);
				if (((xc > xmin) && (xc < xmax)) && ((yc > ymin) && (yc < ymax))) {
					gl.glColor3f(0f, 1f, 0f);
				}
				gl.glVertex2i(y + x1, x + y1);
				gl.glColor3f(1f, 0f, 0f);
				break;
			case 2:
				xc = ((-y) + x1);
				yc = (x + y1);
				if (((xc > xmin) && (xc < xmax)) && ((yc > ymin) && (yc < ymax))) {
					gl.glColor3f(0f, 1f, 0f);
				}
				gl.glVertex2i((-y) + x1, x + y1);
				gl.glColor3f(1f, 0f, 0f);
				break;
			case 3:
				xc = ((-x) + x1);
				yc = (y + y1);
				if (((xc > xmin) && (xc < xmax)) && ((yc > ymin) && (yc < ymax))) {
					gl.glColor3f(0f, 1f, 0f);
				}
				gl.glVertex2i((-x) + x1, y + y1);
				gl.glColor3f(1f, 0f, 0f);
				break;
			case 4:
				xc = ((-x) + x1);
				yc = ((-y) + y1);
				if (((xc > xmin) && (xc < xmax)) && ((yc > ymin) && (yc < ymax))) {
					gl.glColor3f(0f, 1f, 0f);
				}
				gl.glVertex2i((-x) + x1, (-y) + y1);
				gl.glColor3f(1f, 0f, 0f);
				break;
			case 5:
				xc = (-y) + x1;
				yc = ((-x) + y1);
				if (((xc > xmin) && (xc < xmax)) && ((yc > ymin) && (yc < ymax))) {
					gl.glColor3f(0f, 1f, 0f);
				}
				gl.glVertex2i((-y) + x1, (-x) + y1);
				gl.glColor3f(1f, 0f, 0f);
				break;
			case 6:
				xc = y + x1;
				yc = ((-x) + y1);
				if (((xc > xmin) && (xc < xmax)) && ((yc > ymin) && (yc < ymax))) {
					gl.glColor3f(0f, 1f, 0f);
				}
				gl.glVertex2i(y + x1, (-x) + y1);
				gl.glColor3f(1f, 0f, 0f);
				break;
			case 7:
				xc = x + x1;
				yc = ((-y) + y1);
				if (((xc > xmin) && (xc < xmax)) && ((yc > ymin) && (yc < ymax))) {
					gl.glColor3f(0f, 1f, 0f);
				}
				gl.glVertex2i(x + x1, (-y) + y1);
				gl.glColor3f(1f, 0f, 0f);
				break;

			}

			// gl.glVertex2i(x , y );
			x++;
		}

		gl.glEnd();// end drawing of points

	}

	
	// ***********************************************
	public int isOut(int a[]) {
		int t = 0;
		for (int i = 0; i < 4; i++) {
			if (a[i] > 0)
				t++;
		}
		return t;
	}

	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
	}

	public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
	}

	private int zone(int dx, int dy) {
		int ar[] = { 1, 1, 1, 1, 1, 1, 1, 1 };
		if (Math.abs(dy) < Math.abs(dx)) {
			ar[1] = 0;
			ar[2] = 0;
			ar[5] = 0;
			ar[6] = 0;
		}
		if (Math.abs(dy) > Math.abs(dx)) {
			ar[0] = 0;
			ar[3] = 0;
			ar[4] = 0;
			ar[7] = 0;
		}
		if (dy < 0) {
			ar[0] = 0;
			ar[1] = 0;
			ar[2] = 0;
			ar[3] = 0;
		}
		if (dy > 0) {
			ar[4] = 0;
			ar[5] = 0;
			ar[6] = 0;
			ar[7] = 0;
		}
		if (dx < 0) {
			ar[0] = 0;
			ar[1] = 0;
			ar[7] = 0;
			ar[6] = 0;
		}
		if (dx > 0) {
			ar[2] = 0;
			ar[3] = 0;
			ar[4] = 0;
			ar[5] = 0;
		}
		int t = 0;
		while (ar[t] == 0)
			t++;
		return t;

	}

	private void drawLine(GL2 gl, int x1, int y1, int x2, int y2) {
		gl.glPointSize(1.0f);
		gl.glBegin(GL2.GL_POINTS);// begin plotting points
		int steps = 0;
		int dx = (x2 - x1), dy = (y2 - y1), x = 0, y = 0;
		int zn = zone(dx, dy);
		int tx1 = 0, ty1 = 0, tx2 = 0, ty2 = 0;
		int nx = dx, ny = dy;

		switch (zn) {
		case 0:
			nx = dx;
			ny = dy;
			break;
		case 1:
			nx = dy;
			ny = dx;
			break;
		case 2:
			nx = dy;
			ny = -dx;
			break;
		case 3:
			nx = -dx;
			ny = dy;
			break;
		case 4:
			nx = -dx;
			ny = -dy;
			break;
		case 5:
			nx = -dy;
			ny = -dx;
			break;
		case 6:
			nx = -dy;
			ny = dx;
			break;
		case 7:
			nx = dx;
			ny = -dy;
			break;

		}

//		System.out.println("zone: " + zn);
//		System.out.println();
//		System.out.println();

		gl.glVertex2i(x1, y1);

		int p = (2 * ny) - nx;
		steps = nx - 1;
		for (int i = 0; i < steps; i++) {
			// while((Math.abs(x))<(Math.abs(tx2))){
			if (p < 0)
				p = p + 2 * ny;
			else {
				p = p + (2 * ny) - (2 * nx);
				y++;
			}

			switch (zn) {
			case 0:
				gl.glVertex2i(x + x1, y + y1);
				break;
			case 1:
				gl.glVertex2i(y + x1, x + y1);
				break;
			case 2:
				gl.glVertex2i((-y) + x1, x + y1);
				break;
			case 3:
				gl.glVertex2i((-x) + x1, y + y1);
				break;
			case 4:
				gl.glVertex2i((-x) + x1, (-y) + y1);
				break;
			case 5:
				gl.glVertex2i((-y) + x1, (-x) + y1);
				break;
			case 6:
				gl.glVertex2i(y + x1, (-x) + y1);
				break;
			case 7:
				gl.glVertex2i(x + x1, (-y) + y1);
				break;

			}

			// gl.glVertex2i(x , y );
			x++;
		}

		gl.glEnd();// end drawing of points

	}

	private void CirclePoint(GL2 gl, int x, int y, int a, int b) {

		gl.glVertex2i(x + a, y + b);
		gl.glVertex2i(y + a, x + b);
		gl.glVertex2i(y + a, -x + b);
		gl.glVertex2i(x + a, -y + b);
		gl.glVertex2i(-x + a, -y + b);
		gl.glVertex2i(-y + a, -x + b);
		gl.glVertex2i(-y + a, x + b);
		gl.glVertex2i(-x + a, y + b);

	}

	private void drawCircle(GL2 gl, int x, int y, int r) {
		gl.glPointSize(1.0f);
		gl.glBegin(GL2.GL_POINTS);

		int x0 = 0, y0 = r;
		int d = 1 - r;
		gl.glVertex2i((x0 + x), (y0 + y));

		while (x0 <= y0) {
			if (d < 0) {
				d += (2 * x0) + 3;
			} else {
				d += 2 * (x0 - y0) + 5;
				y0--;
			}
			x0++;
			//System.out.println(x0 + "::" + y0);
			CirclePoint(gl, (x0), (y0), x, y);
		}

		gl.glEnd();

	}

	public void dispose(GLAutoDrawable arg0) {

	}
	
}

public class CalculatePI {
	public static void main(String args[]) {
		// getting the capabilities object of GL2 profile
		final GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities capabilities = new GLCapabilities(profile);
		// The canvas
		final GLCanvas glcanvas = new GLCanvas(capabilities);
		ThirdGLEventListener b = new ThirdGLEventListener();
		glcanvas.addGLEventListener(b);
		glcanvas.setSize(700, 700);
		// creating frame
		final JFrame frame = new JFrame("Basic frame");
		// adding canvas to frame
		frame.add(glcanvas);
		frame.setSize(1100, 700);
		frame.setVisible(true);
	}
}
