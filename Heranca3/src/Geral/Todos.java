package Geral;
import SubClasses.*;//Chamando todas as classes da determinada pasta.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Todos {
    private static final String URL = "jdbc:mysql://localhost:3306/veiculos";
    private static final String USUARIO = "root";
    private static final String SENHA = "1910Mune*";

    public static void main(String[] args) {
        // Criando os objetos
        Veiculo[] veiculos = {
            new Carro("Gol", 2005, 7, "Preto", true),
            new Moto("Bis", 2014, 125, 60),
            new Cam("Carga", 2018, 6, 18500),
            new Bike("Profissional", 2023, "Caloi", "Branca", "Carbono", 27, true),
            new Skateboard("Skate do Tony Hawk", 2024, "Fischer", "Preto", "Lisas")
        };

        try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            System.out.println("Conexão estabelecida com sucesso!");

            // Inserindo os veículos
            for (Veiculo veiculo : veiculos) {
                inserirDados(conexao, veiculo.gerarComandoInsert());
            }

            System.out.println("Dados inseridos com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ou executar comandos no banco: " + e.getMessage());
        }
    }

    private static void inserirDados(Connection conexao, String comandoSql) {
        try (PreparedStatement stmt = conexao.prepareStatement(comandoSql)) {
            stmt.executeUpdate();
            System.out.println("Comando executado: " + comandoSql);
        } catch (SQLException e) {
            System.err.println("Erro ao executar comando: " + comandoSql);
            System.err.println(e.getMessage());
        }
    }
}
