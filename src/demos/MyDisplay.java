package demos;

import processing.core.PApplet;

/** 
 * A class to illustrate some use of the PApplet class
 * Used in module 3 of the UC San Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 *
 */
public class MyDisplay extends PApplet {

	public void setup()
	{
		size(400, 400); //사이
		background(200, 200, 200);//배경색 
		
	}
	
	public void draw()
	{
		fill(255, 255, 0);//숫자는 이렇게 하겠다.
		ellipse(200, 200, 390, 390); //타원형 위치, 사이
		fill(0, 0, 0);
		ellipse(120, 130, 50, 70);
		ellipse(280, 130, 50, 70);
		
		noFill();
		arc(200, 280, 75, 75, 0, PI);  //180도 만큼만 보여주겠다.
	}
	
}
