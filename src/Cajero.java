public class Cajero {
	//mètodes
		//private float diners;
		private CuentaBancaria cuentaBancaria;
		private Semaforo semafor;
		private int tempsAccio;
		
		//Constructor
		public Cajero(CuentaBancaria p_cta, int p_temps, Semaforo p_mutex) {
			cuentaBancaria = p_cta;
			//diners = p_diners;
			tempsAccio = p_temps;
			semafor = p_mutex;
		}
		
		void ingressar(float diners) throws InterruptedException {
			System.out.println("Ingressant "+ diners);
			this.cuentaBancaria.ingresar(diners);
		}
		
		void treure(float diners) throws InterruptedException {
			System.out.println("Traguent -"+ diners);
			this.cuentaBancaria.sacar(diners);
		}
		
		void mostrarSaldo() {
			System.out.println("Saldo actual del compte bancari " + ": " +cuentaBancaria.getSaldo());
		}
		
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			Semaforo s = new Semaforo(1);
			
			CuentaBancaria cb = new CuentaBancaria(1000);
			
			CuentaBancaria c1 = new CuentaBancaria(2);
			//c1.mostrarSaldo();
			c1.ingresar(100);
			c1.sacar(300);
			//c1.mostrarSaldo();
			
			CuentaBancaria c2 = new CuentaBancaria(2);
			//c2.mostrarSaldo();
			c2.sacar(200);
			c2.ingresar(700);
			//c2.mostrarSaldo();
			
			
			

		}
}
