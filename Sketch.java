import processing.core.PApplet;
/*
 * Makes a house with variables that scale with the screen size
 * @author: Preston Wong
 */
public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(	135, 206, 235);

  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // Ground
    fill(0,128,0);
    rect((float) (width*0),(float) (height/1.025), (float) (width), (float) (height));

	  // Body of the house
    fill(240,250,190);
    rect((float) (width/8), (float) (height/2),(float) (width/2), (float) (height/2.1));

    // Roof of the house
    fill(210,100,75);
    triangle((float) (width/8), (float) (height/2), (float) (width/2.66), (float) (height/4), (float) (width/1.6), (float) (height/2));

    // Window
    fill(255);
    ellipse((float) (width/2.667),(float) (height/2.58), (float) (width/8), (float) (height/8));
    line((float) (width/2.285), (float) (height/2.58), (float) (width/3.2),(float) (height/2.58));
    stroke(0);
    line ((float) (width/2.667), (float) (height/2.22), (float) (width/2.667), (float) (height/3.076));
    stroke(0);

    // Door and door handle
    fill(150,75,0);
    rect((float) (width/3.8), (float) (height/1.509), (float) (width/4.44), (float) (height/3.2));
    fill(0);
    ellipse((float) (width/2.19), (float) (height/1.2), (float) (width/40), (float) (height/40));
  }
  
  // define other methods down here.
}