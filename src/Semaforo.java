
public class Semaforo {
	protected Lights state;
	Semaforo(){
		this.state = new Red();
	}
	
	
	
	
	public void nextStrate(){
		this.state.NextState(this);
		
	}
	public void exibir() {
		System.out.println(this.state.getEstadoAtual().equals("Red")==true?"(x)Red":"( )Red");
		System.out.println(this.state.getEstadoAtual().equals("Yellow")==true?"(x)Yellow":"( )Yellow");
		System.out.println(this.state.getEstadoAtual().equals("Greem")==true?"(x)Greem":"( )Greem");
	}
	public void Play() {
		this.exibir();
		for(int i = 3; i >0 ; i--) {
			this.state.Time();
			this.nextStrate();
			this.exibir();
	   }
			
		
	}
}
