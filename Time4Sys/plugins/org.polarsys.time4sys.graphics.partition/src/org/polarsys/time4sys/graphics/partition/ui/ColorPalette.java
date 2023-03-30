package org.polarsys.time4sys.graphics.partition.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class ColorPalette {
	
	private Display display = Display.getDefault();
	
	private List<Color> colors = new ArrayList<Color>();

	public ColorPalette(Display display){
		this.display = display;		
		colors.add(new Color(display,0,128,255));
		colors.add(new Color(display,136,0,21));
		colors.add(new Color(display,0,0,100));
		colors.add(new Color(display,0,200,200));
		colors.add(new Color(display,200,0,200));
		colors.add(new Color(display,0,200,0));		
	}
	
	public Color getColorFromName(Display display, String name) {
		if(name.equals("User")){
			return new Color(display,200,100,200);
		}
		if(name.equals("Utils")){
			return new Color(display,100,200,100);
		}
		else{
			return new Color(display,50,50,100);
		}
	}
	
	public Color getColor(int index){
		int rank = index%colors.size();
		Color returnedColor = colors.get(rank);
		if(index > colors.size()){
			int red = returnedColor.getRed();
			int green = returnedColor.getGreen();
			int blue = returnedColor.getBlue();
			returnedColor = new Color(display,(red+index*30)%255,(green+index*30)%255,(blue+index*30)%255);
		}
		return returnedColor;
	}
}
