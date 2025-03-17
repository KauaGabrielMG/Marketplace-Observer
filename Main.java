/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Main.java
public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook Gamer");

        Cliente cliente1 = new Cliente("Ana");
        Cliente cliente2 = new Cliente("Carlos");

        produto.adicionarObserver(cliente1);
        produto.adicionarObserver(cliente2);

        System.out.println("⛔ Produto ainda fora de estoque...");
        
        // Após algum tempo, o produto chega no estoque
        produto.setEmEstoque(true);
    }
}
