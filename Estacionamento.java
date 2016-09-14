
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author isidro
 */
public class Estacionamento {
    
    private Map<String, Carro> mapa = new HashMap<String,Carro>();
    
    public void put(String chave, Carro carro){
        mapa.put(chave, carro);
    }
    
    public Carro get(String chave){
        return mapa.get(chave);
    }
    
    public Carro get(String chave, Supplier<Carro> carroSupplier){
        Carro carro = mapa.get(chave);
        if (carro == null){
            carro = carroSupplier.get();
            mapa.put(chave,carro);
        }
        return carro;
    }
    
    public Optional<Carro> getOptional(String chave){
        return Optional.ofNullable(mapa.get(chave));
    }
    
}
