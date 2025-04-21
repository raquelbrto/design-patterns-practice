package exercices.builder;

import java.util.ArrayList;
import java.util.List;

// Produto final - Pizza
class Pizza {
    private String tipoMassa;
    private String tipoMolho;
    private List<String> ingredientes = new ArrayList<>();
    private boolean bordaRecheada;
    private String tamanho;
    
    public void setTipoMassa(String tipoMassa) {
        this.tipoMassa = tipoMassa;
    }
    
    public void setTipoMolho(String tipoMolho) {
        this.tipoMolho = tipoMolho;
    }
    
    public void addIngrediente(String ingrediente) {
        this.ingredientes.add(ingrediente);
    }
    
    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public String toString() {
        return "Pizza {" +
               "tamanho='" + tamanho + '\'' +
               ", tipoMassa='" + tipoMassa + '\'' +
               ", tipoMolho='" + tipoMolho + '\'' +
               ", bordaRecheada=" + bordaRecheada +
               ", ingredientes=" + ingredientes +
               '}';
    }
}