package SubClasses;
public class Carro extends Veiculo {
    
	//Criando apenas os atributos adicionais desta classe
	private int passageiros;
    private String freio;
    private boolean airbag;

    public Carro(String tipo, int fab, int passageiros, String freio, boolean airbag) {
        super(tipo, fab);//"Chamando" os atributos da classe "Tipo"
        this.passageiros = passageiros;
        this.freio = freio;
        this.airbag = airbag;
    }
  //Usando o override para alterar o comportamento de um método herdado da superclasse nas subclasses.
    @Override
    public String gerarComandoInsert() {
        return String.format(
            "INSERT INTO Veiculos (tipo, fab, passageiros, freio, airbag) " +
            "VALUES ('%s', %d, %d, '%s', %b);",
            tipo, fab, passageiros, freio, airbag
        );
    }
}

