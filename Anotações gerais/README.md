# FPOO

## Java: linguagem de programação orientada a objeto.

 * Classes: `Uma classe é um elemento que utilizamos para representar objetos do mundo real. Dentro dela é comum declararmos atributos  e métodos, que representam,  respectivamente, as características e comportamentos desse objeto. Representa a estrutura em si.` 
 

 * Atributos: `Características. Os atributos são os dados que um classe possui. Uma entidade que possui estado e comportamento é conhecida como um objeto, por exemplo, cadeira, bicicleta, marcador, caneta, mesa, carro, etc.`
 

* Métodos: `São as ações. Em geral, um método é uma maneira de executar alguma tarefa. Da mesma forma, o método em Java é uma coleção de instruções que executam uma tarefa específica. Ele fornece a reutilização do código.`

Métodos de set: `dá o valor do atributo.`

Método de get: `pega o valor do atributo.`

# Estrutura de decisão 
 [Desvio condicional]

* Simples (Se verdadeiro, exibe algo, se não, não exibe nada).
* Composta (Se verdadeiro, exibe algo, se não, exibe outra coisa).
* Aninhada/encadeada (Uma estrutura de decisão com outras decisões dentro).

#### Estrutura composta:

if= quando o teste lógico for verdadeiro.

else= quando o teste lógico for falso.

#### Estrutura simples:

if= quando o teste lógico for verdadeiro.
para expressões logicas: unir dois testes lógicos

# Operadores lógicos

* E [and]   ->  & 
* Ou [or]   ->  || [pipe]
* Não [Not] ->  !

E [and]: `Numa lógica E, somente quandos todas as entradas forem verdadeiras/acionadas é que a saída vai ser verdadeira/acionadas.`

Ou [or] => `Numa lógica Ou, se UMA ou MAIS entradas for verdadeira/acionada, a saída será verdadeira/acionada.` 

# Laços

for ( Quando sabemos previamente a quantidade de repetições )

     for ( ; ; ) {
     }            

    ( inicialização ; teste ; atualização ) {
    }
    
   while ( Quando não sabemos previamente a quantidade de repetições ) [enquanto]

    int i = 1

    (expressão de teste) {
    }

    while (i<=10) {
      System.out.println(i);
      i++;
    }
Função do break - quebrar o laço. Não quebra decisão.

# Operadores aritmeticos

  * "*"
  * "+"
  * "-"
  * "/"

## Operadores reelacionais [Comparação]

  * ">"    maior que
  * "<"    menor que
  * ">="   maior ou igual a
  * "<="   menor ou igual a
  * "=="   igualdade
  * "!="   desigualdade [diferença]

-------------------------------------------------------------

### Variaveis 
Espaço reservado [alocado] na memória RAM para guardar uma informação de um tipo pré-estabelecido. 


  Números inteiros:
  * byte    => 8 bits (vai do -128 ate o 127)
  * short   => 16 bits
  * int     => 32 bits
  * long    => 64 bits

byte [8 bits]
2^8 = 256 / 2 = 128

0 ... 255
-128 ... 0 ... 127

 Números decimais:
  
  * float   => 32 bits
  * double  => 64 bits
  
  -------------------------------------
  
  ### Estrutura de repetição
  
  Laços/loop
  
  ==> Java
  
  for 
  while
  do while
  
  ------------------------------------------------------------------------------
  
 # Laço [for]
   -> é mais adequado utilizar o laço for, quando sabemos antecipadamente a quantidade de repetições.
   
   Síntaxe:
   
   
      for ( ; ; ) {
      }
                 
      
      ( inicialização ; teste ; atualização ) {
      }

       2, 4, 6, 8,
       PA: Inicio, final, razão
       
       * Inicialização : Determina o inicio da contagem.
       * Teste: Determina o final da contagem.
       * Atualização: Determina o passo [razão] da contagem.
       
  ### Exemplo  
  
     1, 4, 7, 10, 13
   
     for ( int i=1 ; i <=13 ; i=i+3 ) {
      System.out.println (i);
     }
  

