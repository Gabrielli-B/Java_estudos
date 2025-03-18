# RPG Game - Herança em Java

Este é um projeto simples de um jogo de RPG, criado com o objetivo de entender e aplicar o conceito de **herança** em Java.

## Descrição

O projeto implementa um jogo de RPG com personagens como `Warrior` (Guerreiro) e `Mage` (Mago), ambos herdando as características básicas de uma classe abstrata `GameCharacter`. O objetivo foi entender como funciona a herança de propriedades e comportamentos, além de explorar o uso de métodos e atributos comuns em subclasses.

## Funcionalidades

- **Ataque**: Personagens podem atacar uns aos outros, causando dano conforme a força de ataque.
- **Reparo de armadura**: Os personagens podem reparar sua armadura, aumentando sua proteção.
- **Aumento de força**: A força do personagem pode ser aumentada, melhorando seu poder de ataque.

## Estrutura do Código

### Classes principais:
- `GameCharacter`: Classe base que contém atributos e métodos comuns para todos os personagens (nome, saúde, força, armadura).
- `Warrior`: Subclasse de `GameCharacter`, representando um guerreiro com características específicas.
- `Mage`: Subclasse de `GameCharacter`, representando um mago com diferentes características dependendo do tipo de poder.
- `CharacterActions`: Classe com métodos estáticos para realizar ações como ataque, reparo de armadura e aumento de força.
