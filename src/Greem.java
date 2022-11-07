
public class Greem implements Lights{

	@Override
	public String getEstadoAtual() {
		// TODO Auto-generated method stub
		return "Greem";
	}

	@Override
	public void NextState(Semaforo semaforo) {
		// TODO Auto-generated method stub
		semaforo.state = new Yellow();
		
	}

	@Override
	public void Time() {
		// TODO Auto-generated method stub
		int time_in_seconds = 25;
		while(time_in_seconds > 0) {
			time_in_seconds -=1;
			System.out.println(time_in_seconds + " segundos");
			try {
				// 1000 milisegundos equivale a 1 segundo
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
