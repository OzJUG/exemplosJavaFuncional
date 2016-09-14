
import java.util.Optional;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author isidro
 */
public class MainApp {
    public static void main(String args[]){
        Runnable runnable = () ->{ 
                                    System.out.println("Oi quer tc");
                                    System.out.println("Agora vai...");
                                  
                                 };
        
        Thread thread = new Thread(runnable);
        thread.start();
        
        TratadorDeString tratador = String::toUpperCase;
        
        System.out.println(tratador.transforma("ozjug"));
        
        Calculadora calc = (a,b) -> a + b;
        System.out.println(calc.soma(2,4)+"");
        
        Calculadora sub = (a,b) -> a - b;
        System.out.println(sub.soma(5, 20)+" ");
        
        Estacionamento e = new Estacionamento();
        
       //Carro carro = e.get("Corsa", () -> new Carro("Corsa",70));
       // System.out.println(carro);
        
        Carro c = e.get("Corsa");
        if (c == null){
            System.out.println("nao existe");
        }
        else
            System.out.println(c.getNome());
        
        Optional<Carro> outroCarro = e.getOptional("Corsa");
        
        outroCarro.map(v -> v.getNome()).ifPresent(System.out::println);
        String result = outroCarro.map(veiculo -> veiculo.getNome()).orElse("nao existe");
        System.out.println(result);
        
        
    }
    
}
