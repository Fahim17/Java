
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
	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();

		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		/*
		 * put your code here
		 */
		Scanner sc = new Scanner(System.in);

		// **********Abstract points***************

//    drawLine(gl, 50, 20, 180, 80);
//    drawLine(gl, 0, 0, -10, 50);
//    drawLine(gl, -20, 50, -80, 80);
//    drawLine(gl, 0, 90, 40, 10); // zone 6
//    drawLine(gl, 10, 50, 60, 49);//zone 7

		// **********Selected points***************

//    System.out.println("x1:");
//    int x1 = sc.nextInt();
//    System.out.println("y1:");
//    int y1 = sc.nextInt();
//    System.out.println("x2:");
//    int x2 = sc.nextInt();
//    System.out.println("y2:");
//    int y2 = sc.nextInt();
//    drawLine(gl, x1, y1, x2, y2);

		// **********Square***************
//	  System.out.println("x1:");
//	  int x1 = sc.nextInt();
//	  System.out.println("y1:");
//	  int y1 = sc.nextInt();
//	  System.out.println("x2:");
//	  int x2 = sc.nextInt();
//	  System.out.println("y2:");
//	  int y2 = sc.nextInt();
//	  
//	  
//	  double c=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
//	  float d=(float)c; 
//	  float dx=x2-x1;
//	  float dy=y2-y1;
//	  float m=dy/dx;
//	  float theta=(float) (Math.atan(m)*180/Math.PI);
//	  
//	  gl.glTranslatef( x1,  y1,  0.0f);
//	  gl.glRotatef( theta,   0.0f,   0.0f,   1.0f);
//    
//	  gl.glPushMatrix();
//	  drawLine(gl, 0, 0, Math.round(d), 0);
//	  gl.glRotatef( 90.0f,   0.0f,   0.0f,   1.0f);
//	  drawLine(gl, 0, 0, Math.round(d), 0);
//	    
//	  gl.glRotatef( -90.0f,   0.0f,   0.0f,   1.0f);
//	  gl.glTranslatef( 1.0f,  d,  0.0f);
//	  drawLine(gl, 0, 0, Math.round(d), 0);
//	    
//	  gl.glRotatef( -90.0f,   0.0f,   0.0f,   1.0f);
//	  gl.glTranslatef( 1.0f,  d,  0.0f);
//	  drawLine(gl, 0, 0, Math.round(d), 0);
//	  gl.glPopMatrix();
//    

		// **********Star***************
//    System.out.println("Enter the radius");
//    int r=sc.nextInt();
//    ArrayList<Integer> x_list = new ArrayList<>();
//    ArrayList<Integer> y_list = new ArrayList<>();
//    for (int i = 0; i < 5; i++) {
//        double theta = Math.toRadians(i * 72);
//        int _x = (int) (r * Math.cos(theta));
//        int _y = (int) (r * Math.sin(theta)); 
//        x_list.add(_x);
//        y_list.add(_y);
//    }
//    System.out.println("x: "+x_list.toString());
//    System.out.println("y: "+y_list.toString());    
//    
//    drawLine(gl, x_list.get(1), y_list.get(1), x_list.get(3), y_list.get(3));
//    drawLine(gl, x_list.get(1), y_list.get(1), x_list.get(4), y_list.get(4));
//    drawLine(gl, x_list.get(4), y_list.get(4), x_list.get(2), y_list.get(2));
//    drawLine(gl, x_list.get(2), y_list.get(2), x_list.get(0), y_list.get(0));
//    drawLine(gl, x_list.get(0), y_list.get(0), x_list.get(3), y_list.get(3));
//    

		// ****************Circle***************
		// drawCircle(gl, 50, -50, 50);

		// ****************Circle in Circle***************
//    System.out.println("Enter the x-coordinates of center");
//    int cx = sc.nextInt();
//    System.out.println("Enter the y-coordinates of center");
//    int cy = sc.nextInt();
//    System.out.println("Enter the radius");
//    int r = sc.nextInt();
//    drawCircle(gl, cx, cy, r);
//    
//    int cx1 = (int)((r/2)*Math.cos(Math.PI/6));
//    int cy1 = (int)((r/2)*Math.sin(Math.PI/6));
//    
//    drawCircle2(gl, cx1+cx, cy1+cy, (r/4));
//    
//    int cx2 = (int)((r/2)*Math.cos(5*Math.PI/6));
//    int cy2 = (int)((r/2)*Math.sin(5*Math.PI/6));
//    
//    drawCircle2(gl, cx2+cx, cy2+cy, (r/4));
//    
//    int cx3 = (int)((r/2)*Math.cos(3*Math.PI/2));
//    int cy3 = (int)((r/2)*Math.sin(3*Math.PI/2));
//    
//    drawCircle2(gl, cx3+cx, cy3+cy, (r/4));
//    

		// ****************Cohen-Sutherland***************
//		System.out.println("Enter the Xmin of frame");
//		int xmin = -150;// sc.nextInt();
//		System.out.println("Enter the Xmax of frame");
//		int xmax = 150;// sc.nextInt();
//		System.out.println("Enter the Ymin of frame");
//		int ymin = -100;// sc.nextInt();
//		System.out.println("Enter the Ymax of frame");
//		int ymax = 100;// sc.nextInt();
//
//		drawLine(gl, xmin, ymin, xmax, ymin);
//		drawLine(gl, xmax, ymin, xmax, ymax);
//		drawLine(gl, xmin, ymax, xmax, ymax);
//		drawLine(gl, xmin, ymin, xmin, ymax);
//
//		System.out.println("Enter the x1");
//		int x1 = sc.nextInt();
//		System.out.println("Enter the y1");
//		int y1 = sc.nextInt();
//		System.out.println("Enter the x2");
//		int x2 = sc.nextInt();
//		System.out.println("Enter the y2");
//		int y2 = sc.nextInt();
//
//		int opcode1[] = { 0, 0, 0, 0 };
//		int opcode2[] = { 0, 0, 0, 0 };
//
//		if (x1 < xmin)
//			opcode1[3] = 1;
//		if (x1 > xmax)
//			opcode1[2] = 1;
//		if (y1 < ymin)
//			opcode1[1] = 1;
//		if (y1 > ymax)
//			opcode1[0] = 1;
//
//		if (x2 < xmin)
//			opcode1[3] = 1;
//		if (x2 > xmax)
//			opcode1[2] = 1;
//		if (y2 < ymin)
//			opcode1[1] = 1;
//		if (y2 > ymax)
//			opcode1[0] = 1;
//
//		int l1 = isOut(opcode1);
//		int l2 = isOut(opcode2);
//
//		int opcodeX[] = { (opcode1[0] & opcode2[0]), (opcode1[1] & opcode2[1]), (opcode1[2] & opcode2[2]),
//				(opcode1[3] & opcode2[3]) };
//		int lx = isOut(opcodeX);
//
//		if ((l1 == 0) && (l2 == 0)) {
//			System.out.println("Trivially accepted");
//		} else {
//			if ((l1 > 0) && (l2 > 0) && lx > 0) {
//				System.out.println("Trivially rejected");
//			} else if (lx == 0) {
//				System.out.println("Partially Accepted");
//			}
//		}
//
//		drawLine2(gl, x1, y1, x2, y2, xmin, xmax, ymin, ymax);
//
//		int xp1 = 0, yp1 = 0, xp2 = 0, yp2 = 0;
//		int m = (y2 - y1) / (x2 - x1);
//
//		if (l1 == 1) {
//			for (int i = 0; i < 4; i++) {
//				if (opcode1[i] > 0) {
//					if (i == 0) {
//						yp1 = ymax;
//						xp1 = x1 + (1 / m) * (ymax - y1);
//					} else if (i == 1) {
//						yp1 = ymin;
//						xp1 = x1 + (1 / m) * (ymin - y1);
//					} else if (i == 2) {
//						xp1 = xmax;
//						yp1 = y1 + (1 / m) * (xmax - x1);
//					} else if (i == 3) {
//						xp1 = xmin;
//						yp1 = y1 + (1 / m) * (xmin - x1);
//					}
//				}
//			}System.out.println(xp1 + ":::" + yp1);
//		}
//		
//		if (l2 == 1) {
//			for (int i = 0; i < 4; i++) {
//				if (opcode2[i] > 0) {
//					if (i == 0) {
//						yp2 = ymax;
//						xp2 = x2 + (1 / m) * (ymax - y2);
//					} else if (i == 1) {
//						yp2 = ymin;
//						xp2 = x2 + (1 / m) * (ymin - y2);
//					} else if (i == 2) {
//						xp2 = xmax;
//						yp2 = y2 + (1 / m) * (xmax - x2);
//					} else if (i == 3) {
//						xp2 = xmin;
//						yp2 = y2 + (1 / m) * (xmin - x2);
//					}
//				}
//			}System.out.println(xp2 + ":::" + yp2);
//		}
//		//end of cohen sutherland
	
	
	
	
	
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

		System.out.println("zone: " + zn);
		System.out.println();
		System.out.println();

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

		System.out.println("zone: " + zn);
		System.out.println();
		System.out.println();

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
			System.out.println(x0 + "::" + y0);
			CirclePoint(gl, (x0), (y0), x, y);
		}

		gl.glEnd();

	}

	public void dispose(GLAutoDrawable arg0) {

	}
	private void CirclePoint2(GL2 gl, int x, int y, int a, int b) {

		//gl.glVertex2i(x + a, y + b);
		//gl.glVertex2i(y + a, x + b);
		gl.glVertex2i(y + a, -x + b);
		gl.glVertex2i(x + a, -y + b);
		gl.glVertex2i(-x + a, -y + b);
		gl.glVertex2i(-y + a, -x + b);
		//gl.glVertex2i(-y + a, x + b);
		//gl.glVertex2i(-x + a, y + b);

	}
	private void drawCircle2(GL2 gl, int x, int y, int r) {
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
			System.out.println(x0 + "::" + y0);
			CirclePoint2(gl, (x0), (y0), x, y);
		}

		gl.glEnd();

	}

}

public class Midpoint {
	public static void main(String args[]) {
		// getting the capabilities object of GL2 profile
		final GLProfile profile = GLProfile.get(GLProfile.GL2);
		GLCapabilities capabilities = new GLCapabilities(profile);
		// The canvas
		final GLCanvas glcanvas = new GLCanvas(capabilities);
		ThirdGLEventListener b = new ThirdGLEventListener();
		glcanvas.addGLEventListener(b);
		glcanvas.setSize(400, 400);
		// creating frame
		final JFrame frame = new JFrame("Basic frame");
		// adding canvas to frame
		frame.add(glcanvas);
		frame.setSize(640, 480);
		frame.setVisible(true);
	}
}
