public class SegundoExemploFuncional{
	public static void main(String args[]){

	    /* Criando uma interface Funcional chamada TratadorDeString que faz a conversão
	       através de uma refefinição de um Syntax Sugar do String.toUpperCase na
	       sua definição do corpo
	    */
	    TratadorDeString tratador = String::toUpperCase;
        
        System.out.println(tratador.transforma("ozjug"));
	}
}