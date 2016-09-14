public class SegundoExemploFuncional{
	public static void main(String args[]){

		/* Usamos um exemplo de Estacionamento que é uma classe que contém um HashMap
		   e pode retornar ou não um objeto armazenado 

		   Este caso usa o Optional para manipular os objetos armazenados que podem ser NULL

		   além disso, utilizamos o predicado MAP para relacionar a existência de um
		   objeto no Mapa e, existindo, mostra seu conteúdo

		   se não existir, retorna uma STRING contendo "não existe"


		   */

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