# Marketplace-Observer
Projeto desenvolvido para a matéria de 2903 - PARADIGMAS DE LINGUAGENS DE PROGRAMAÇÃO

## Como Executar
1. Acesse o site [OnlineGDB](https://www.onlinegdb.com/online_java_compiler).
2. Copie e cole o código dos arquivos `.java` no editor.
3. Clique no botão "Run" para compilar e executar o projeto.

## Estrutura do Projeto
- `Cliente.java`: Implementa a interface `Observer` e representa um cliente que é notificado quando um produto está em estoque.
- `Main.java`: Contém o método principal para executar a aplicação.
- `Observer.java`: Interface que define o método `atualizar` para os observadores.
- `Produto.java`: Implementa a interface `Subject` e representa um produto que pode ser observado.
- `Subject.java`: Interface que define métodos para adicionar, remover e notificar observadores.

## Padrão Observer
O padrão observer é utilizado neste projeto para notificar os clientes quando um produto está em estoque. A classe `Produto` (sujeito) mantém uma lista de objetos `Observer` (clientes) e os notifica quando o status de estoque do produto muda. A interface `Observer` define o método `atualizar`, que é implementado pela classe `Cliente` para receber notificações.
