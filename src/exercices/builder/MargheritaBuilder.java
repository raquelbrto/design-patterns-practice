package exercices.builder;

public class MargheritaBuilder implements PizzaBuilder {
    private Pizza pizza;
    
    public MargheritaBuilder() {
        this.reset();
    }
    
    @Override
    public void reset() {
        this.pizza = new Pizza();
    }
    
    @Override
    public void construirMassa() {
        pizza.setTipoMassa("fina e crocante");
    }
    
    @Override
    public void construirMolho() {
        pizza.setTipoMolho("molho de tomate tradicional");
    }
    
    @Override
    public void adicionarIngredientesPrincipais() {
        pizza.addIngrediente("muçarela fresca");
        pizza.addIngrediente("manjericão");
        pizza.addIngrediente("tomate em rodelas");
    }
    
    @Override
    public void construirBorda() {
        pizza.setBordaRecheada(false);
    }
    
    @Override
    public void definirTamanho(String tamanho) {
        pizza.setTamanho(tamanho);
    }
    
    @Override
    public Pizza getResultado() {
        Pizza produto = this.pizza;
        this.reset(); // prepara para próxima construção
        return produto;
    }
}
