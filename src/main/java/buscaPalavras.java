import dao.DbAdapter;

public class buscaPalavras {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao dicionario de dados!");



        // Conectar
        DbAdapter dbAdapter = new DbAdapter();
        dbAdapter.connect();
        dbAdapter.disconnect();

    }
}
