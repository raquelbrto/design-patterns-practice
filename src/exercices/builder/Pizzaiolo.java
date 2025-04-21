package exercices.builder;

public class Pizzaiolo {
	 private PizzaBuilder builder;
	    
	    public void setBuilder(PizzaBuilder builder) {
	        this.builder = builder;
	    }
	    
	    public Pizza construirPizza(String tamanho) {
	        builder.reset();
	        builder.definirTamanho(tamanho);
	        builder.construirMassa();
	        builder.construirMolho();
	        builder.adicionarIngredientesPrincipais();
	        builder.construirBorda();
	        return builder.getResultado();
	    }
	    
	    // Método para construção personalizada
	    public Pizza construirPizzaPersonalizada(PizzaBuilder builder, String tamanho, boolean bordaRecheada) {
	        builder.reset();
	        builder.definirTamanho(tamanho);
	        builder.construirMassa();
	        builder.construirMolho();
	        builder.adicionarIngredientesPrincipais();
	        if (bordaRecheada) {
	            builder.construirBorda();
	        }
	        return builder.getResultado();
	    }
}
