package exercices.builder;

public class CalabresaBuilder implements PizzaBuilder {
    private Pizza pizza;
    
    public CalabresaBuilder() {
        this.reset();
    }
    
    @Override
    public void reset() {
        this.pizza = new Pizza();
    }
    
    @Override
    public void construirMassa() {
        pizza.setTipoMassa("tradicional");
    }
    
    @Override
    public void construirMolho() {
        pizza.setTipoMolho("molho de tomate picante");
    }
    
    @Override
    public void adicionarIngredientesPrincipais() {
        pizza.addIngrediente("calabresa");
        pizza.addIngrediente("cebola");
        pizza.addIngrediente("muçarela");
        pizza.addIngrediente("azeitona");
    }
    
    @Override
    public void construirBorda() {
        pizza.setBordaRecheada(true);
    }
    
    @Override
    public void definirTamanho(String tamanho) {
        pizza.setTamanho(tamanho);
    }
    
    @Override
    public Pizza getResultado() {
        Pizza produto = this.pizza;
        this.reset();
        return produto;
    }
}
