# Marketplace-Observer

Projeto desenvolvido para a matéria de 2903 - PARADIGMAS DE LINGUAGENS DE PROGRAMAÇÃO

Alunos: Kauã Gabriel, Pedro Paulo, Victor Tavares e Johnatas Alencar

## Descrição do Projeto

Este projeto implementa um sistema de Marketplace utilizando o padrão de projeto Observer. O objetivo é criar uma aplicação que demonstre a utilização deste padrão em um contexto de comércio eletrônico, onde diferentes entidades (como compradores, vendedores, ou sistemas de análise) podem observar e reagir a eventos do marketplace.

## Detalhes de Implementação

- **Linguagem**: Java
- **Paradigma**: Programação Orientada a Objetos (POO)
- **Padrão de Projeto**: Observer

## Estrutura do Padrão Observer

O padrão Observer estabelece uma relação um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.

### Componentes principais:

1. **Subject (Observable)**: Interface ou classe abstrata que define operações para gerenciar observadores.
   - Implementado em: `Subject.java`

2. **Observer**: Interface que define o método de atualização a ser chamado quando o estado do Subject muda.
   - Implementado em: `Observer.java`

3. **ConcreteSubject**: Implementação do Subject que mantém o estado e notifica os observadores quando há mudanças.
   - Implementado em: `Produto.java` - Gerencia o estado de disponibilidade dos produtos e notifica observadores quando produtos entram em estoque

4. **ConcreteObserver**: Implementação do Observer que mantém uma referência ao ConcreteSubject e implementa a interface de atualização.
   - Implementado em: `Cliente.java` - Observa produtos e recebe notificações quando entram em estoque

### Diagrama de Classes

```
Subject (Interface) <|-- Produto
Observer (Interface) <|-- Cliente
Produto o-- Observer
```

## Aplicação no Contexto de Marketplace

No contexto deste projeto, o padrão Observer é utilizado para:

- Notificar compradores sobre mudanças de preços em produtos
- Alertar vendedores sobre novas vendas ou estoque baixo
- Informar administradores sobre atividades suspeitas ou problemas no sistema
- Atualizar dashboards de análise em tempo real

