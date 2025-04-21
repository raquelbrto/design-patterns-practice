package exercices.builder;

public interface PizzaBuilder {
	void reset();
    void construirMassa();
    void construirMolho();
    void adicionarIngredientesPrincipais();
    void construirBorda();
    void definirTamanho(String tamanho);
    Pizza getResultado();
}
