import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MainPrinterInner {

	public static void main(String[] args) {
		TimePrinter1 printer=new TimePrinter1(1000);
		JOptionPane.showMessageDialog(null, "OK");
	}

}

class TimePrinter1{
	class TimerListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Minęło xx sekund");		
		}
		
	}
	private int interval;
	Timer t;
	public TimePrinter1(int interval) {
		super();
		this.interval = interval;
		TimerListener tl=new TimerListener();
		t=new Timer(interval, tl);
		t.start();
	}
}


