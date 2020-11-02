
public class CuentaBancaria {

	private float saldo = 1000;
	Semaforo s = new Semaforo(1);

	public CuentaBancaria(int saldo) {
		super();
		this.saldo = saldo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + "]";
	}
	
	public void ingresar(float dinero) throws InterruptedException {
		
		float aux;
		aux=getSaldo();
		System.out.println("["+Thread.currentThread().getName() + "] getsaldo():" + aux);
		System.out.println("["+Thread.currentThread().getName() + "] " + aux + "+" + dinero);aux=aux+dinero;
		Thread.sleep(1000);
		System.out.println("["+Thread.currentThread().getName() + "] setsaldo(" + aux + ")");
		setSaldo(aux);
		
	}
	
	public void sacar(float dinero) throws InterruptedException {
		float aux;aux=getSaldo();
		System.out.println("["+Thread.currentThread().getName() + "] getsaldo():" + aux);
		System.out.println("["+Thread.currentThread().getName() + "] " + aux + "-" + dinero);
		aux=aux-dinero;
		Thread.sleep(1000);
		System.out.println("["+Thread.currentThread().getName() + "] setsaldo(" + aux + ")");
		setSaldo(aux);
		
		
	}
	
}
