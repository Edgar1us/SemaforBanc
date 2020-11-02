
public class Semaforo {

	private int semaforo;

	public Semaforo(int semaforo) {
		super();
		this.semaforo = semaforo;
	}
	
	public void sendSignal() {
		semaforo=1;
		
	}
	
	public void sendWait() {
		while (semaforo <= 0) {
			
		}
		semaforo=0;
	}
	
}
