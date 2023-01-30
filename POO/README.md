# Programação Orientada a Objetos

## O que é?
É um paradigma de programação, análise e projeto de software baseado na composição e na interação de diversas unidades de softwares chamados de objetos. Traz melhorias com relação ao outro paradigma: o paradigma etruturado (usado em C).
Enquanto o Estruturado foca em funções e dados, o POO foca na modelagem de entidades e na interação entre elas.

## Fundamentos
- Abstração: processo pelo qual se isolam características de um determinado objeto. Ex.: Cadeira. Há vários tipos, e exemplificar todas seria um atraso de vida. Abstração é a capacidade de simplificar a cadeira em suas características mais básicas: 4 pernas, um assento e um encosto. Esse objeto simples que criamos é a asbtração de uma cadeira, e pode ser usado de várias formas, inclusive como base para outros projetos de cadeiras.

- Reuso: é a capacidade de criar novas unidades de códigos a partir de outras que já existem. É o sentido de abstrair algo. Uma função é um bom exemplo disso. OUtro exemplo é uso de métodos em Java.

- Encapsulamento: encapsular é proteger dados e esconder complexidades de determinado bloco de código de modo a beneficiar o código.

## Estruturas Básicas na OO
### Classe 
Tudo em OO começa com a classe. É a unidade mínima. É uma estrutura que abstrai um conjunto de objetos com características similares. Uma classe define o comportamento de seus objetos através de métodos e os estados possíveis destes objetos através de atributos. Em outros termos, uma classe descreve os serviços providos por seus objetos e quais informações eles podem armazenar. 
#### DICAS
- Substantivos
- Nome significativos
- Contexto deve ser considerado

### Atributo
 É o elemento de uma classe responsável por definir sua estrutura de dados. O conjunto destes será responsável por representar suas características e fará parte dos objetos criados a partir da classe. Definido dentro do parênteses após o nome da Classe.
#### DICAS
- Substantivos e adjetivos
- Nome significativos
- Contexto deve ser considerado
- Abstração
- Tipos de dados adequados

### Método
É uma porção de código (sub-rotina) que é disponibilizada pela classe. Este é executado quando é feita uma requisição a ele. Um método serve para identificar quais serviços, ações, que a classe oferece. Eles são responsáveis por definir e realizar um determinado comportamento.
Há ainda os métodos Construtor (pode ser usado para criar objetos e prover valores iniciais para ele) e Destrutor (não destrói, mas auxilia nesse processo pra liberar memória, espaço - iniciado por void em Java). 

#### DICAS
- Verbos
- Nome significativos
- Contexto deve ser considerado
  
### Objeto
Um objeto é a representação de um conceito/entidade do mundo real, que pode ser física (bola, carro, árvore etc.) ou conceitual (viagem, estoque, compra etc.) e possui um significado bem definido para um determinado software. Para esse conceito/entidade, deve ser definida inicialmente uma classe a partir da qual posteriormente serão
instanciados objetos distintos.

### Mensagem
É o processo de ativação de um método de um objeto. Isto ocorre quando uma requisição (chamada) a esse método é realizada, assim disparando a execução  de seu comportamento descrito por sua classe. Pode também ser direcionada diretamente à classe, caso a requisição seja a um método estático.

## Herança
É o relacionamento entre classes em que uma classe chamada de subclasse (classe filha, classe derivada) é uma extensão, um subtipo, de outra classe chamada de superclasse (classe pai, classe mãe, classe base). Devido a isto, a subclasse consegue
reaproveitar os atributos e métodos dela. Além dos que venham a ser herdados, a subclasse pode definir seus próprios membros.
