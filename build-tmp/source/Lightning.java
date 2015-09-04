import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 0;
int startY = 250;
int endX = 801;
int endY = 250; 
PImage img;

public void setup()
{
	size(800,531);
	img = loadImage("BIMMER.jpg");
	background(img);
	strokeWeight(5);
	fill(255,255,0, 204);
	textSize(50);
	text("#becauseracecar", 0, 520);
}


public void draw()
{
	stroke((int)(Math.random()*255),(int)(Math.random()*255), (int)(Math.random()*255));
	while (endX < 800)
	{
	frameRate (30);
	line(startX, startY, endX, endY);
	    startX = endX;
		startY = endY;
		endX = startX + ((int)(Math.random()*10));
		endY = startY + ((int)(Math.random()*19)-9);
	}
}


public void mousePressed()
{
	startX = 0;
	startY = 250;
	endX = 0;
	endY = 250;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
