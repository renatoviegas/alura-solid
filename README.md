# Treinamento ALURA SOLID

Anotações de tudo o que foi realizado no projeto.

## Single Responsability Principle

O princípio da responsabilidade única foi aplicado à classe `Funcionario`.

### Refatorando a Classe Funcionario
- Criada a classe `ReajusteService` que tem como objetivo único realizar o cálculo e regras de reajuste salarial;
- A classe `Funcionario` passou a ser mais coesa tratando apenas de assuntos relacionados a representação de um **funcionário**.