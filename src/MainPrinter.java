import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MainPrinter {

	public static void main(String[] args) {
		TimePrinter printer=new TimePrinter(1000);
		JOptionPane.showMessageDialog(null, "OK");
	}

}

class TimePrinter{
	private int interval;
	Timer t;
	public TimePrinter(int interval) {
		super();
		this.interval = interval;
		TimerListener tl=new TimerListener();
		t=new Timer(interval, tl);
		t.start();
	}
}

class TimerListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Minęło xx sekund");		
	}
	
}
