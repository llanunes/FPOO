# Operadores aritmeticos

  * "*"
  * "+"
  * "-"
  * "/"

-----------------------------------------------------------

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
  
