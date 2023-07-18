package autosuggestions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotClassPractice 
{

	public static void main(String[] args) throws AWTException 
	{
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_SHIFT);
	
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		
		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);
		
		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);
		
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_O);
		
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_1);
		r.keyRelease(KeyEvent.VK_SHIFT);
		
		
		
	}

}
