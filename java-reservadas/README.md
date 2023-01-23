# Palavras Reservadas

São 52 palavras reservadas em Java, que têm inclusive concorrência entre elas.

Essas palavras não podem ser utilizadas para nomear coisa alguma em Java.

# As 52

## Controle de Pacotes
- import: importa pacotes ou classespara dentro do código;
- package: especifica a qual pacote todas as classes de um arquivo pertencem;

## Modificadores de acesso
- public: acesso de qulquer classe;
- private: acesso apenas dentro da classe;
- protected: acesso por classes no mesmo pacote e subclasses (apenas usado no uso de herança);

## Primitivos
- boolean: um valor indicando true ou false;
- bite: um inteiro de 8 bits;
- char: um caractere unicode (16 bits);
- double: um número de ponto flutuante de 64 bits;
- float: um número de ponto flutuante de 32 bits;
- int: um inteiro de 32 bits;
- long: um inteiro de 64 bits;
- short: um inteiro de 32 bits;
- void: indica que o método não tem retorno de valor;

## Modificadores de classes, variáveis ou métodos
- abstract: o comportamento dessa classe será definido numa classe filha (hereditariedade);
- class: especifica uma classe;
- extends: indica uma superclasse a qual a subclasse está extendendo;
- final: impossibilita extenção, sobrescrição ou reinicialização de classe devido a ela ter uma finalidade específica;
- implements: indica interfaces que uma classe implementará;
- interface: especifica uma interface;
- native: indica um metódo escrito em uma linguagem que não Java (ex.: C);
- new: instancia um novo objeto, chamando seu construtor;
- static: faz um método independer de seus objetos - a classe provê a estrutura para seu próprio funcionamento;
- strictfp: indica que números de ponto flutuante seguirão regras de ponto flutuante em todas as expressões;
- synchronized: indica que um método só pode ser acessado por uma thread de cada vez;
- transient: impede serialização de campos. A info não é salva e sempre será reinicializada;
- volatile: indica que uma variável pode ser alterada durante o uso de threads;

## Controle de fluxo dentro do bloco de código
- break: sai do bloco de código em que ele está;
- case: executa um bloco dependendo do teste do switch;
- continue: pula a execução do código que viria após essa linha e vai para a próxima passagem do loop;
- catch: declara o bloco usado para tratar uma exceção;
- finally: bloco usado após um try-catch executado independente do fluxo do programa;
- throw: passa uma exceção ao método que o chamou;
- throws: indica um método que pode passar uma exceção ao método que o chamou;
- try: bloco que tentará ser executado, mas que pode causar uma exceção;

## Variáveis de referência
- super: refere-se a uma superclasse imediata;
- this: refere-se a instância tual do projeto;

