// Cliente.java
public class Cliente implements Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeProduto) {
        System.out.println("📩 Olá " + nome + ", o produto '" + nomeProduto + "' está disponível no estoque!");
    }
}