# Sistema de Votação em Java

Este projeto é um sistema de votação desenvolvido em Java, que explora os conceitos fundamentais da Programação Orientada a Objetos (POO). Ele permite a criação de eleições, cadastro de eleitores e votação em candidatos.

## Funcionalidades

- Criação de eleições com data de início e término.
- Cadastro de eleitores com nome e CPF.
- Registro de candidatos e partidos políticos.
- Votação em candidatos por parte dos eleitores.
- Contagem dos votos e divulgação dos resultados.

## Conceitos Abordados

Este projeto explora os seguintes conceitos de POO em Java:

- Estrutura de classes e objetos.
- Métodos getters e setters para manipulação de dados.
- Herança e relacionamentos hierárquicos entre classes.
- Polimorfismo para comportamentos diferentes dependendo do contexto.
- Interfaces como contrato para garantir a implementação de métodos.# Requisitos Obrigatórios

## Requisitos Desenvolvidos

## 1 - Implemente a classe abstrata Pessoa

<details>
    <summary>Implemente a classe abstrata Pessoa, criando os atributos, getters e setters</summary>


No projeto já existe um arquivo com a classe `com.betrybe.sistemadevotacao.Pessoa`. Nessa classe, você deve garantir que: 
 1. Ela é uma classe abstrata, de forma que ela será utilizada como base para implementação de outras classes, mas não será instanciada por si.
 2. Ela possui o atributo protegido `nome` do tipo String.
 3. Ela possui os _getters_ e _setters_ correspondentes ao atributo.
  - Note que estes métodos não são abstratos, mesmo que a classe seja.

</details>

## 2 - Implemente a classe PessoaCandidata

<details>
    <summary>Implemente a classe PessoaCandidata, incluindo atributos, métodos e herança </summary>

A classe `PessoaCandidata` herda da classe `Pessoa`, ficando responsável por representar a pessoa candidata. Essa classe é formada por:
1. Atributos:
    - `nome`: herdado da classe `Pessoa`;
    - `numero`: atributo do tipo **primitivo** inteiro que armazena o número identificador para voto;
    - `votos`: atributo do tipo **primitivo** inteiro que armazena o número de votos recebidos pela pessoa candidata.
2. Métodos:
    - getters e setters referentes aos atributos.
    - `receberVoto`: método responsável por adicionar 1 ao atributo `votos` para representar a quantidade de votos recebidos pela pessoa candidata. O método não retorna nada.
3. Construtor: seu construtor recebe dois parâmetros, o `nome` e o `numero`, e os armazena nos respectivos atributos. O método construtor também inicializa o atributo `votos` com o valor zero.

Note que todos os métodos da classe em questão são públicos.

</details>

## 3 - Implemente a classe PessoaEleitora

<details>
    <summary>Implemente a classe PessoaEleitora</summary>

A classe `PessoaEleitora` herda da classe `Pessoa`, ficando responsável por representar a pessoa eleitora. Garanta que:
1. Além do(s) atributo(s) herdado(s), ela deve possuir um atributo privado adicional `cpf` do tipo String, que armazena o CPF da pessoa eleitora. 
2. A classe deve possuir os _getters_ e _setters_ correspondentes aos atributos.

Note que todos os métodos dessa classe são públicos.

</details>

## 4 - Implementar a classe GerenciamentoVotacao com atributos

<details>
    <summary>Implemente a classe que fará o gerenciamento do processo de votação e seus atributos</summary>

Neste requisito, você deve iniciar a implementação da classe `GerenciamentoVotacao` é responsável por gerenciar a votação e o cadastro de pessoas candidatas e pessoas eleitoras. A classe deve implementar a interface `GerenciamentoVotacaoInterface`, já disponibilizada com o projeto.

Por enquanto você não precisa completar os métodos da interface, apenas deverá criar três atributos privados:
- `pessoasCandidatas`: responsável por manter uma lista das pessoas candidatas cadastradas, ou seja, de objetos instanciados da classe `PessoaCandidata`;
- `pessoasEleitoras`: responsável por manter uma lista das pessoas eleitoras cadastradas, ou seja, de objetos instanciados da classe `PessoaEleitora`;
- `cpfsComputados`: responsável por manter uma lista com os CPFs das pessoas eleitoras que já votaram, ou seja, de Strings.

Para criar os três atributos acima, você deve utilizar a classe `ArrayList`. Nós aprenderemos mais sobre essa classe posteriormente, mas utilizaremos essa classe aqui porque ela pode receber novos objetos de uma forma mais simples e eficiente do que com os _arrays_ nativos do Java. Um exemplo de uso:

```java
ArrayList<String> fruits = new ArrayList<String>();
fruits.add("maça");
fruits.add("uva");
System.out.println(cars.get(1)); // Imprime "uva"
```

Para mais informações, você pode consultar o site da [W3Schools](https://www.w3schools.com/java/java_arraylist.asp), ou a [documentação](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html) oficial.

</details>

## 5 - Implementar os métodos de cadastro da classe GerenciamentoVotacao

<details>
    <summary>Implemente os métodos de cadastro da classe GerenciamentoVotacao</summary>

Neste requisito, você deve implementar os métodos da classe `GerenciamentoVotacao` referentes a cadastro, conforme abaixo:

- **Método** `cadastrarPessoaCandidata`: esse método público deve receber dois parâmetros: o `nome` (String) e o `numero` (inteiro) da pessoa candidata. Neste método você deve:
   - Verificar se o número da pessoa candidata já está cadastrado na lista `pessoasCandidatas` e, caso esteja, imprimir a mensagem `Número da pessoa candidata já utilizado!` no console;
   - Caso contrário, instanciar um objeto da classe `PessoaCandidata` utilizando os valores recebidos;
   - Por fim, adicionar o novo objeto na lista `pessoasCandidatas` (Dica: utilize o método `.add` da classe `ArrayList`).
- **Método** `cadastrarPessoaEleitora`: esse método público deve receber dois parâmetros: o `nome` (String) e o `cpf` (String) da pessoa candidata. Neste método você deve:
    - Verificar se o CPF da pessoa já está cadastrado na lista `pessoasEleitoras` e, caso esteja, imprimir a mensagem `Pessoa eleitora já cadastrada!` no console;
    - Caso contrário, instanciar um objeto da classe `PessoaEleitora` utilizando os valores recebidos
    - Por fim, adicionar o novo objeto na lista;
    `pessoaEleitoras` .

</details>

## 6 - Implementar os métodos de votação da classe GerenciamentoVotacao

<details>
    <summary>Implemente os métodos de votação da classe GerenciamentoVotacao</summary>

Neste requisito, você deve implementar os métodos da classe `GerenciamentoVotacao` referentes à votação, conforme abaixo:

- **Método** `votar`: esse método público deve receber dois parâmetros: o `cpfPessoaEleitora` e o `numeroPessoaCandidata`. Nesse método você deve:
   - Verificar se o CPF da pessoa eleitora já está inserido na lista `cpfsComputados` e, caso esteja, deve imprimir a mensagem `Pessoa eleitora já votou!` no console;
   - Caso contrário, deve percorrer o array `pessoasCandidatas` para encontrar o objeto da pessoa candidata que tenha o número passado pelo parâmetro `numeroPessoaCandidata`. Quando encontrar o objeto que representa a pessoa candidata, deverá chamar o método `receberVoto` desse objeto.
   - Por fim, deve inserir o CPF da pessoa eleitora na lista `cpfsComputados`, de forma que essa pessoa eleitora não possa votar novamente 
- **Método** `mostrarResultado`: esse método público é responsável por imprimir no console o resultado da eleição, seja o resultado parcial ou o final. Ele não recebe nenhum parâmetro. No método, você deve:
   - Verificar se já existe algum voto computado e, caso não, mostrar a mensagem `É preciso ter pelo menos um voto para mostrar o resultado.`. Você pode utilizar a lista de CPFs para verificar o total de votos.
   - Caso já tenha votos computados, imprimir no console o nome de cada pessoas candidata com a quantidade de votos que ela recebeu e o percentual de votos recebidos. Além disso, mostrar o total de votos computados. Exemplo de saída:
```text
Nome: Maria - 2 votos ( 67% )
Nome: José - 1 votos ( 33% )
Total de votos: 3
```

Nota: no cálculo da porcentagem, arredonde o valor para inteiro utilizando o método estático `round` da classe `Math` do Java.

</details>

## 7 - Implementar a classe Principal

<details>
    <summary>Implementar a classe Principal, responsável por interagir com a pessoa usuária</summary>

Neste requisito você irá implementar a classe `Principal`, que fará a execução de todo o processo de cadastro e votação.

Será preciso criar um menu com três etapas:
- Cadastro de pessoas candidata;
- Cadastro de pessoas eleitoras;
- Votação.

Para implementar o sistema, a classe `Principal` deve conter o método `main`, que utilizará a classe `GerenciamentoVotacao` para realizar as diferentes etapas.

Você poderá utilizar laços de repetição para processar cada etapa.

### Cadastro de pessoas candidatas

O menu de cadastro de pessoas candidatas deverá ter o seguinte formado:

```text
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
```

Se a pessoa usuária entrar com o valor 1 (que indica que ela quer cadastrar uma pessoa candidata), a mensagem `Entre com o nome da pessoa candidata:` deverá ser impressa no console.

Em seguida, após inserir o nome da pessoa candidata e pressionar enter, aparecerá a mensagem `Entre com o número da pessoa candidata:` no console. Depois que a pessoa usuária inserir o número da pessoa candidata, o sistema deverá retornar ao estado inicial do menu. 

Supondo que o nome da primeira pessoa candidata seja "Maria" e o seu número para votar seja "1", então um exemplo do conteúdo do console depois de cadastrar a primeira pessoa candidata será:

```text
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa candidata:
Maria
Entre com o número da pessoa candidata:
1
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
```

Esse ciclo se repete até não haver mais pessoas candidatas para serem cadastradas. Quando isso acontecer, a pessoa usuária entrará com a opção 2 do menu, o que vai parar o primeiro laço. O segundo laço, que representa a etapa de cadastro de pessoas eleitoras, deve ser iniciado logo na sequência.

⚠️🔴**IMPORTANTE: para facilitar o uso da classe `Scanner` do Java, cadastra-se apenas o primeiro nome da pessoa candidata — ou seja, Maria, e não Maria Silva ou Maria Clara.** 🔴⚠️

### Cadastro de pessoas candidatas

Após finalizar o cadastro de pessoas candidatas, passamos para o cadastro de pessoas eleitoras. O menu deverá ter o seguinte formato:

```text
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
```

Se a pessoa usuária entrar com o valor 1 (que indica que ela quer cadastrar uma pessoa eleitora), então a mensagem `Entre com o nome da pessoa eleitora:` será impressa no console. Em seguida, depois de inserir o nome da pessoa eleitora e pressionar enter, aparecerá no console a mensagem `Entre com o CPF da pessoa eleitora:`.

Depois que a pessoa usuária inserir o CPF da pessoa eleitora, o sistema deve retornar ao estado inicial do menu. Supondo que o nome da primeira pessoa eleitora seja "João", portador do CPF "123.456.789-00", um exemplo do conteúdo do console após cadastrá-la será:

```text
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
João
Entre com o cpf da pessoa eleitora:
123.456.789-00
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
 ```

Esse ciclo se repete até o esgotamento das pessoas eleitoras a serem cadastradas. Ao final desse cadastro, a pessoa usuária entrará com a opção 2 do menu, o que vai parar o segundo laço e iniciar o terceiro, marcando o início da votação.

### Votação

Após finalizar o cadastro de pessoas eleitoras, entramos na etapa de votação. O menu deve ter o seguinte formato:

```text
 Entre com o número correspondente à opção desejada:
 1 - Votar
 2 - Resultado Parcial
 3 - Finalizar Votação
```

Se a pessoa usuária entrar com o valor 1 (que indica que ela quer computar um voto), a mensagem `Entre com o cpf da pessoa eleitora:` deverá ser impressa no console. Em seguida, após inserir o CPF da pessoa eleitora e pressionar enter, deverá aparecer a mensagem `Entre com o número da pessoa candidata:` no console. Feito isso, o voto deve ser computado, e o sistema retorna ao estado inicial do menu. Supondo que o CPF da primeira pessoa eleitora seja "123.456.789-00", e o número da pessoa candidata seja 1, então um exemplo do conteúdo do console após realizar um voto será:

```text
 Entre com o número correspondente à opção desejada:
 1 - Votar
 2 - Resultado Parcial
 3 - Finalizar Votação
 1
 Entre com o cpf da pessoa eleitora:
123.456.789-00
 Entre com o número da pessoa candidata:
 1
 Entre com o número correspondente à opção desejada:
 1 - Votar
 2 - Resultado Parcial
 3 - Finalizar Votação
```

Se a pessoa escolher a opção 2 ("Resultado parcial"), o resultado parcial deverá ser mostrado, mas a votação continua. Já se a pessoa escolher a opção 3, deverá ser mostrado o resultado final, e a execução termina.

</details>



## Por que isso é importante?

O objetivo deste exercício é compreender os conceitos fundamentais da POO e como a linguagem Java aplica esses conceitos. Ao explorar esse sistema de votação, os desenvolvedores podem avaliar a eficácia de diferentes abordagens de programação em Java, considerando fatores como legibilidade, eficiência e facilidade de manutenção.

## Como Usar

1. Clone o repositório para o seu ambiente local:

  git clone: https://github.com/marianeCandian/Project-Java-Sistema-Votacao.git


2. Abra o projeto em sua IDE Java preferida.

3. Execute a classe principal `Main.java` para iniciar o sistema de votação.

4. Siga as instruções no console para criar eleições, cadastrar eleitores, registrar candidatos e realizar votações.

5. Ao final da eleição, os resultados serão divulgados automaticamente.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorar este projeto.
