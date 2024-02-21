package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
		String shape = in.next();
		if (shape .= rectangle) {
		int colorRed = in.nextInt();
		int colorGreen = in.nextInt();
		int colorBlue = in.nextInt();
		boolean filled = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		double halfWidth = in.nextDouble();
		double halfHeight = in.nextDouble();
		
	
		Color colorRectangle = new Color (colorRed, colorGreen, colorBlue);
		StdDraw.setPenColor(colorRectangle);
		if (filled == true);
				{
					if (shape == rectangle)
					StdDraw.filledRectangle(x,y,halfWidth,halfHeight);
					if (shape == circle)
					StdDraw.filledCircle(x, y, halfHeight);
				}
				else 
				{
					if (shape == rectangle)
					StdDraw.rectangle(x,y,halfWidth,halfHeight);
					if (shape == circle)
					StdDraw.circle(x, y, halfHeight);
				}
		

	}
}
