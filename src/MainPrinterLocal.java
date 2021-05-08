import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MainPrinterLocal {

	public static void main(String[] args) {
		TimePrinter2 printer=new TimePrinter2(1000);
		JOptionPane.showMessageDialog(null, "OK");
	}

}

class TimePrinter2{
	
	private int interval;
	Timer t;
	public TimePrinter2(int interval) {
		super();
		class TimerListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Minęło "+interval/1000+" sekund");		
			}
			
		}
		this.interval = interval;
		t=new Timer(interval, new TimerListener());
		t.start();
	}
}


