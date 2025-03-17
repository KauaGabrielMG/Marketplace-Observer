// Produto.java
import java.util.ArrayList;
import java.util.List;

public class Produto implements Subject {
    private String nome;
    private boolean emEstoque;
    private List<Observer> observers;

    public Produto(String nome) {
        this.nome = nome;
        this.emEstoque = false;
        this.observers = new ArrayList<>();
    }

    @Override
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar(nome);
        }
    }

    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
        if (emEstoque) {
            System.out.println("🔔 Produto '" + nome + "' agora está em estoque!");
            notificarObservers();
        }
    }

    public boolean isEmEstoque() {
        return emEstoque;
    }
}