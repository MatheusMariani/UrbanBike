package urbanbike;

public class PedalPop extends ContaUrbanBike implements Imprimivel{
	private int taxaDeOpera��o;
	
	  public int getTaxa(){
		 return this.taxaDeOpera��o;
	  	}
		   
	  public void setTaxa(int Taxa){
		  this.taxaDeOpera��o = Taxa;
	  	}
	  
	  public void mostraDados() {
		 System.out.println(""+getConta()); 
		 System.out.println(""+getSaldo()); 
		 System.out.println(""+getTaxa());
	  	}

	@Override
	public double depositarCredito(double valor) {
		
		return 0;
	}

	@Override
	public double gastarCredito(double valor) {
		
		return 0;
	}
}
