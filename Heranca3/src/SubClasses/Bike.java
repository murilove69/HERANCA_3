package SubClasses;
public class Bike extends Veiculo {
   
	//Aqui ja devem ser adicionados mais atributos à classe, como marca, cor, material, quantidade de marchas e amortecedor. Estes são os atributos dela.
	private String marca;
    private String cor;
    private String material;
    private int marcha;
    private boolean amortecedor;

    public Bike(String tipo, int fab, String marca, String cor, String material, int marcha, boolean amortecedor) {
        super(tipo, fab);//"Chamando" os atributos da classe "Tipo" e criando os novos, que são alguns a mais.
        this.marca = marca;
        this.cor = cor;
        this.material = material;
        this.marcha = marcha;
        this.amortecedor = amortecedor;
    }
  //Usando o override para alterar o comportamento de um método herdado da superclasse nas subclasses.
    @Override
    public String gerarComandoInsert() {
        return String.format(
            "INSERT INTO Veiculos (tipo, fab, marca, cor, material, marcha, amortecedor) " +
            "VALUES ('%s', %d, '%s', '%s', '%s', %d, %b);",
            tipo, fab, marca, cor, material, marcha, amortecedor
        );
    }
}

