public class SegundoExemploFuncional{
	public static void main(String args[]){

		/* Através da interface funcional Calculadora, redefinimos 2 lógicas diferentes 
		   uma para soma e outra para subtração
		   */

	    Calculadora calc = (a,b) -> a + b;
        System.out.println(calc.soma(2,4)+"");
        
        Calculadora sub = (a,b) -> a - b;
        System.out.println(sub.soma(5, 20)+" ");
	}
}