# O que são Operadores Relacionais?

Símbolos capazes de comparar determinados operandos (minimamente 2), seguindo obviamente determinadas regras;

Temos 2 tipos de operadores relacionais:

## Similaridade

- Igualdade: determina se um operando é igual ao outro (usa-se o símbolo ==);
- Diferença: determina se um operando é diferente do outro(usa-se o síbolo !=);

## Tamanho

- Maior: determina se um operando é maior que o outro (usamos >);
- Menor: Determina se um operando é menor que o outro (usamos <);
- Maior ou igual: Aceita duas possibilidades (usamos >=);
- Menor ou igual: Aqui duas possibilidades também (usamos <=).
  
# O que são Operadores Lógicos?

Símbolos capazes de realizar comparações lógicas entre determinados operandos lógicos (minimamente 2), seguindo obviamente determinadas regras;  

## Conjunção (&& chamado "e")
 True se e somente se ambos os operandos são verdadeiros;

 ## Disjunção (|| chamado "ou")
 True se algum dos operandos é verdadeiro;

## Disjunção exclusiva (^ chamado "xor")
True se os operandos forem opostos (um verdadeiro e outro falso);

## Negação (! entendido como "inversão")
Inverte o valor lógico do operando ou da expressão;

# Estruturas Controle de Fluxo
Estruturas que direcionam o fluxo do código.

## Decisão
Avalia uma condição booleana ou variável para direcionar o fluxo de execução. É preferível usar o if em expessões booleanas:

- if: o código se depara com uma decisão. Caso ele corresponda a condição seja verdadeira, o código segue. Do contrário ele para o código;
- if-else: se a condição ideal não for atendida, há uma alternativa (else);
- if-else-if: aqui há mais condições, mais caminhos possíveis. 

## Criação

- operador ternário (condição ? true : false;): Aqui há duas possibilidades. Em uma linha declaramos o caminho caso atenda a cada uma delas.

## Escolha

- switch: Escolhe entre N opções (cases não necessariamente booleanos), indicando a consequência. Caso nenhum dos cases seja atendido (default), o processo finaliza. É como um aninhamento de "if's".
  
## Repetição

- for
- while
- do while

## Interrupção

- break
- continue
- return
