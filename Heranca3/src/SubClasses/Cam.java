package SubClasses;
public class Cam extends Veiculo {
	//Criando apenas os atributos adicionais desta classe, os quais são: Quantidade de eixos e o peso bruto.

	private int eixos;
    private int peso;

    public Cam(String tipo, int fab, int eixos, int peso) {
        super(tipo, fab);//"Chamando" os atributos da classe "Tipo" e criando os novos.
        this.eixos = eixos;
        this.peso = peso;
    }
  //Usando o override para alterar o comportamento de um método herdado da superclasse nas subclasses.
    @Override
    public String gerarComandoInsert() {
        return String.format(
            "INSERT INTO Veiculos (tipo, fab, eixos, peso) " +
            "VALUES ('%s', %d, %d, %d);",
            tipo, fab, eixos, peso
        );
    }
}

