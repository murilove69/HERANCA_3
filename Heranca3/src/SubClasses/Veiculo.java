package SubClasses;
public abstract class Veiculo {
	
    protected String tipo;
    protected int fab;
   

    public Veiculo(String tipo, int fab) {
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

    // Método abstrato que será implementado pelas subclasses
    public abstract String gerarComandoInsert();
}
