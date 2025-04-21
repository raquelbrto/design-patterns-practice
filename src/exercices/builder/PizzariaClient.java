package exercices.builder;

public class PizzariaClient {
	public static void main(String[] args) {
        // Criando o diretor
        Pizzaiolo pizzaiolo = new Pizzaiolo();
        
        // Construindo uma Pizza Margherita
        PizzaBuilder margheritaBuilder = new MargheritaBuilder();
        pizzaiolo.setBuilder(margheritaBuilder);
        Pizza margherita = pizzaiolo.construirPizza("Média");
        System.out.println("Pizza Margherita: " + margherita);
        
        // Construindo uma Pizza Calabresa
        PizzaBuilder calabresaBuilder = new CalabresaBuilder();
        pizzaiolo.setBuilder(calabresaBuilder);
        Pizza calabresa = pizzaiolo.construirPizza("Grande");
        System.out.println("Pizza Calabresa: " + calabresa);
        
        // Construção personalizada sem borda recheada
        Pizza calabresaSemBorda = pizzaiolo.construirPizzaPersonalizada(
            calabresaBuilder, "Pequena", false);
        System.out.println("Calabresa sem borda recheada: " + calabresaSemBorda);
        
        // Construção manual sem usar o diretor
        PizzaBuilder builder = new MargheritaBuilder();
        builder.definirTamanho("Família");
        builder.construirMassa();
        builder.construirMolho();
        builder.adicionarIngredientesPrincipais();
        builder.construirBorda();
        Pizza pizzaPersonalizada = builder.getResultado();
        System.out.println("Pizza personalizada: " + pizzaPersonalizada);
    }
}
