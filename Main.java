
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;



public class Main {

	
	public void go(Integer min) {
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				ProcessBuilder processBuilder = new ProcessBuilder("shutdown", "/s");
				try {
					processBuilder.start();
				}catch(IOException e) {
					throw new RuntimeException(e);
				}
				
			}
			
			},min*60*1000);
		
		System.out.println("Shutting down in " + min + " minutes");
		
	}

}
