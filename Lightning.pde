int startX = 0;
int startY = 250;
int endX = 801;
int endY = 250; 
PImage img;

void setup()
{
	size(800,531);
	img = loadImage("images/BIMMER.jpg");
	background(img);
	strokeWeight(5);
	fill(255,255,0, 204);
	textSize(50);
	text("#becauseracecar", 0, 520);
}


void draw()
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


void mousePressed()
{
	startX = 0;
	startY = 250;
	endX = 0;
	endY = 250;
}

