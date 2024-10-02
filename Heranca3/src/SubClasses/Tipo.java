package SubClasses;
public class Tipo {
   //Criando esta classe, pois todos os veiculos necessitam de modelo e ano de fabricação.
	//Após isso, ir adicionando apenas os requistos diferenciais de cada um.
	
	//Criando os atributos da classe
	protected String tipo;
    protected int fab;

   //Iniciando o construtor
    public Tipo(String tipo, int fab) {
      //Informando que o modelo tem que possuir algo escrito.
    	if (tipo == "") {
            throw new IllegalArgumentException("O modelo é obrigatório.");
        }//Determinando que o ano tem que ser positivo, já que não existe "ano negativo"
        if (fab <= 0) {
            throw new IllegalArgumentException("O ano de fabricação deve ser positivo.");
        }
        this.tipo = tipo;
        this.fab = fab;
    }
//chamando os métodos
    public String getModelo() {
        return tipo;
    }

    public int getAnoFabricacao() {
        return fab;
    }
	public String geraInsert() {
		// TODO Auto-generated method stub
		return null;
	}
}
