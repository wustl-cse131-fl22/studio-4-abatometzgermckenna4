package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(206, 60, 111);
		StdDraw.filledRectangle(.165, .5, .165, .5);
		StdDraw.setPenColor(50, 217, 148);
		StdDraw.filledRectangle(.50, .5, .17, .5);
		StdDraw.setPenColor(240, 182, 46);
		StdDraw.filledRectangle(.835, .5, .165, .5);
		StdDraw.setPenColor(131, 196,248);
		StdDraw.filledCircle(.5, .5, .3);
		StdDraw.setPenRadius(.02);
		StdDraw.setPenColor(Color.RED);
		StdDraw.circle(.5, .5, .3);
		StdDraw.setPenColor(Color.DARK_GRAY);
		StdDraw.filledRectangle(.5, .5, .2, .1);
		StdDraw.setPenColor(Color.GRAY);
		StdDraw.rectangle(.5, .5, .2, .1);
		
		StdDraw.setPenRadius(.025);
		StdDraw.setPenColor(Color.RED);
		StdDraw.line(.71, .71, .29, .29);
		
		

		
	}
}