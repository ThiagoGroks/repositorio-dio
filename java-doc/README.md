# Documentação

É imprescindível estudar a documentação da linguagem pretendida.

Quais informações obtemos através de classes documentadas na linguagem? Algumas tags representam dados relevantes que nos auxiliam no entendimento de certas informações:

- @autor: autor, criador;
- @version: versão;
- @since: versão / data de início da disponibilização do recurso;
- @param: descrição dos parâmetros dos métodos;
- @return: tipo de retorno do método;
- @throws: se o método lança alguma exceção;

## Tipos de comentários

- única linha: '//' antes do comentário;
- multilinha: ' /* ' antes, ' * ' a cada linha e '*/' após o final do comentário;
- documentação: Como o multilinha, porém no início e no final usamos ' ** ' ao lado da barra.
  
Tente se o mais claro possível no código, para que os comentários não sejam algo essencial para o entendimento.