public class PrimeiroExemploFuncional{
	public static void main(String args[]){

	    /* reescrevendo a interface Runnable no formato funcional,
	       usando um Lambda para descrever o seu corpo, para que a interface anônima
	       seja menos verbosa
	    */
	    Runnable runnable = () ->{ 
                                    System.out.println("Oi quer tc");
                                    System.out.println("Agora vai...");
                                  
                                 };
        
        Thread thread = new Thread(runnable);
        thread.start();
	}
}