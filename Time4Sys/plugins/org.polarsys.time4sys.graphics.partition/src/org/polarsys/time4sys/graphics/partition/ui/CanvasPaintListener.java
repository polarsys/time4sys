package org.polarsys.time4sys.graphics.partition.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Region;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.TableItem;
import org.polarsys.time4sys.graphics.partition.Partition;
import org.polarsys.time4sys.graphics.partition.Slot;

public class CanvasPaintListener implements PaintListener {
	public Map<Region,String> regionTooltip;
	public java.util.List<Partition> partitions;
	public Map<Partition,TableItem> partitionsItems;

	public double scaleFactor;
	public int xStartOffset = 10;
	public int xEndOffset = 25;
	
	public Map<Partition,Color> partitionColor = new HashMap<Partition,Color>();
	
	@Override
	public void paintControl(PaintEvent e) {
		for(Region r: regionTooltip.keySet()){
			r.dispose();
		}
		regionTooltip.clear();
		Point p =((Canvas)e.getSource()).getSize();
		//e.gc.drawText(p.toString(), 0, 0);
		
		/* Calculate scale */
		scaleFactor = (double)(p.x-xStartOffset-xEndOffset)/Slot.maxEnd;
		
		/* Draw Partitions */
		Color oldBgColor = e.gc.getBackground();
		e.gc.setAlpha(100);
		for(Partition partition: partitions){
			if(partitionsItems.get(partition).getChecked()){
				e.gc.setBackground(partitionColor.get(partition));//getColorFromName(e.display,partition.getName()));
				for(Slot slot: partition.getSlots()){
					int x = (int) (xStartOffset + Math.round(slot.getStartValue() * scaleFactor));//xOffset + (int) (slot.getStartValue() * scaleFactor);
					int width = (int) Math.round((slot.getEndValue()-slot.getStartValue())*scaleFactor);//(int) ((slot.getEndValue()-slot.getStartValue())*scaleFactor);
					e.gc.fillRoundRectangle(x, 0, width, 50, 15, 15);
					Region region = new Region(e.display);
					if(width>=0){
						region.add(x, 0, width, 50);
					}
					regionTooltip.put(region, partition.getName()+"\n("+slot.getLength().toString()+")");
				}
			}
		}
		e.gc.setBackground(oldBgColor);
		e.gc.setAlpha(255);

		drawTimeLine(e.gc,xStartOffset, 75, p.x-xStartOffset);
	}

	private void drawTimeLine(GC gc, int x0, int y0, int width) {
		Color oldFgColor = gc.getForeground();
		gc.setForeground(new Color(gc.getDevice(),150,150,150));
		gc.drawLine(x0, y0, x0+width-xEndOffset, y0);
		Font font = new Font(gc.getDevice(), "Arial", 8, SWT.NORMAL);
		gc.setFont(font);
		for(Partition partition: partitions){
			if(partitionsItems.get(partition).getChecked()){
				for(Slot slot: partition.getSlots()){
					int xStart = x0 + (int) (slot.getStartValue() * scaleFactor);
					int xEnd = x0 + (int) (slot.getEndValue() * scaleFactor);
					gc.drawLine(xStart, y0, xStart, y0+5);
					gc.drawLine(xEnd, y0, xEnd, y0+5);
					drawText(gc,slot.getStart().toString(),xStart,y0+10,50,new Color(gc.getDevice(),50,50,50));
					drawText(gc,slot.getEnd().toString(),xEnd,y0+10,50,new Color(gc.getDevice(),50,50,50));
				}
			}
		}	
		font.dispose();		
		gc.setForeground(oldFgColor);
	}

	private Color getColorFromName(Display display, String name) {
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

	private void drawText(GC gc, String text, int x, int y, int angle, Color color) {
		Transform tr = new Transform(gc.getDevice());
		tr.translate(x,y);
		tr.rotate(angle);
		gc.setTransform(tr);
		Color oldFgColor = gc.getForeground();
		gc.setForeground(color);
		gc.drawText(text, 0, 0);
		gc.setTransform(null);
		gc.setForeground(oldFgColor);
		tr.dispose();
	}
}
