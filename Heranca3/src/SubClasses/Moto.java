package SubClasses;
public class Moto extends Tipo {
	//Criando apenas os atributos adicionais desta classe, que são cilindradas e o torque da motoca.
	private int cilindradas;
    private int torque;

    public Moto(String tipo, int fab, int cilindradas, int torque) {
        super(tipo, fab);//"Chamando" os atributos da classe "Tipo" e criando os novos desta classe.
        this.cilindradas = cilindradas;
        this.torque = torque;
    }
  //Usando o override para alterar o comportamento de um método herdado da superclasse nas subclasses.
    @Override
    public String geraInsert() {
        return String.format(
            "INSERT INTO Moto (tipo, fab, cilindradas, torque) " +
            "VALUES ('%s', %d, %d, %d);",
            tipo, fab, cilindradas, torque
        );
    }
}
