package SubClasses;
public class Skateboard extends Veiculo {
    //Adicionar os atributos cor, marca(Igualmente a Bike), porém, colocando o modelo da roda.
	private String cor;
    private String marca;
    private String rodinha;

    public Skateboard(String tipo, int fab, String marca, String cor, String rodinha) {
        super(tipo, fab);//"Chamando" os atributos da classe "Tipo" e criando os novos, que são mais alguns.
        this.marca = marca;
        this.cor = cor;
        this.rodinha = rodinha;
    }
//Usando o override para alterar o comportamento de um método herdado da superclasse nas subclasses.
    @Override
    public String gerarComandoInsert() {
        return String.format(
            "INSERT INTO Veiculos (tipo, fab, marca, cor, rodinha) " +
            "VALUES ('%s', %d, '%s', '%s', '%s');",
            tipo, fab, marca, cor, rodinha
        );
    }
}

