package companionBalls.buttonHandlers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import companionBalls.robotContainerParts.RobotController;


public class LeftButtonHandler implements ActionListener {
	
	private RobotController rc;
	
	public LeftButtonHandler(RobotController robotController)	{
		this.rc=robotController;
	}
	
	public void actionPerformed(ActionEvent e) {			
		rc.rollLeft();
	}
}

