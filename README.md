# Treinamento ALURA SOLID

Anotações de tudo o que foi realizado no projeto.

## _Single Responsability Principle

O princípio da responsabilidade única foi aplicado à classe `Funcionario`.

### Refatorando a classe Funcionario
- Criada a classe `ReajusteService` que tem como objetivo único realizar o cálculo e regras de reajuste salarial;
- A classe `Funcionario` passou a ser mais coesa tratando apenas de assuntos relacionados a representação de um **funcionário**.

## _Open Closed Principle
O princípio do Aberto / Fechado aplicado à classe `ReajusteService`.

### Crescendo a classe ReajusteService
- Nova regra precisou ser implementada: O intervalo entre reajustes não pode ser inferior a 6 meses;
- Para evitar que ao criar novas regras, novos métodos sejam inseridos na classe, foi realizado as seguintes mudanças:
	- Separados as validações em classes distintas: cada uma com sua responsabilidade;
	- Criado a interface `ValidacaoReajuste` para ser utilizada e executada dentro da classe `ReajusteService`;
	
## _Liskov Substitution Principle
O princípio de substituição de Liskov, que visa mostrar problemas de herança e abstração, que muitas vezes são utilizadas incorretamente.

### Adicionando classe Terceirizado
- A nova classe possui atributos similares ao do Funcionário, mas nem todos os atributos e métodos são necessários, neste caso a opção é não herdar e sim compor;
- A composição se dá por criar uma classe com atributos em comuns entre as duas classes `Funcionario` e `Terceirizado`;
- Foi criada então a classe `DadosPessoais` para contemplar os campos de cpf, nome, cargo e salário;