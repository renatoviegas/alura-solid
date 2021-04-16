# Treinamento ALURA SOLID

Anotações de tudo o que foi realizado no projeto.

## Single Responsability Principle

O princípio da responsabilidade única foi aplicado à classe `Funcionario`.

### Refatorando a classe Funcionario
- Criada a classe `ReajusteService` que tem como objetivo único realizar o cálculo e regras de reajuste salarial;
- A classe `Funcionario` passou a ser mais coesa tratando apenas de assuntos relacionados a representação de um **funcionário**.
- Aplicando o princípio SRP - Single Responsability Principle;

### Crescendo a classe ReajusteService
- Nova regra precisou ser implementada: O intervalo entre reajustes não pode ser inferior a 6 meses;
- Para evitar que ao criar novas regras, novos métodos sejam inseridos na classe, foi realizado as seguintes mudanças:
	- Separados as validações em classes distintas: cada uma com sua responsabilidade;
	- Criado a interface `ValidacaoReajuste` para ser utilizada e executada dentro da classe `ReajusteService`;
	- Aplicando então o princípio OCP - Open Closed Principle;