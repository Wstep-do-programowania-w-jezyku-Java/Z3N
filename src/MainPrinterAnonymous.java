import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class MainPrinterAnonymous {

	public static void main(String[] args) {
		TimePrinter3 printer=new TimePrinter3(1000);
		JOptionPane.showMessageDialog(null, "OK");
	}

}

class TimePrinter3{
	
	private int interval;
	Timer t;
	public TimePrinter3(int interval) {
		super();
		this.interval = interval;
		t=new Timer(interval, new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Minęło "+interval/1000+" sekund");		
			}
			
		});
		t.start();
	}
}


