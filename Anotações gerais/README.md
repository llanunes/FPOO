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
     
 # Tipo Char
char letra = 's';

string : `" " haspas (programação: haspas duplas).`

char :  ` ' ' apóstrofo (programação: haspas simples).`

char ch /u2588
  
# Java

Métodos: `faz uma única coisa específica.`
* pow (potência)
* sqrt (radiciação)
* sin (seno)
* cos (cosceno)
* tan (tangente)

Toda linguagem de programação trabalha com operadores.

## Aritiméticos ou operadores matemáticos.
* + soma
* - subtração
* * multiplicação
* / divisão 
* ^ potência
* % módulo (retorna o resto da divisão entre dois numeros inteiros e não trabalha com números decimais)

ex de módulo: 
int n1 = 10

int n2= 7

int n3 =  n1 % n2 (recebendo o módulo do n1 com o n2 que é o resto da divisão entre eles)

n1/n2= 1 (não usamos vírgula pois estamos trabalhando com "int" que somente é números inteiros).

n3= 3 (resto da divisão do n1 com o n2).

int n1= 12      
int n2= 9       
int n3= 3       
int n4= 1       


"-->" no diagrama de blocos: fluxo do processamento.

padrão para nomes compostos do java
* Camel case: RestoDaDivisao (nome da classe que é o mesmo nome do arquivo criado).

## Computação

Saída em Java: `System.out.println`
Processamento: `variáveis, operadores, etc`
Entrada: `Interação com o usuario, ele determinará os valores que serão guardados e posteriormente processados. Gráfica/Texto`

### Classes: 

[métodos] não disponíveis por padrão:

* temos que importar.

* temos que criar um objeto dessa classe. [Criar uma instância da classe]

* podemos utilizar os métodos da classe.

* Entrada de dados de forma gráfica

classe:JOptionPane

métodos: 

********************
showMessageDialog ()
********************
show: mostrar

Message: mensagem

Dialog: diálogo [caixa de diálogo, Janela] 

método de saída.


***************
showInputDialog
***************
show: mostrar

Input: entrada

Dialog: caixa de diálogo [Janela]

método de entrada.



# Variável para números:

* primitivas/básicas que ja nasceram com a linguagem.
* int (números inteiros)
* double (números decimais)


## Variável para texto:

* String

são classes, foram desenvolvidas e introduzidas depois.

    /u : caractere unicode

# métodos: 
não fazem duas coisas, serve para fazer uma coisa só.

     main () ---- principal ---- iniciar a execução
     string ()
     pow ()
     sqrt ()
     next ()
 ...
 
* if ( ) for ( ) while ( ) [tem parenteses mas não são métodos, são estruturas de decisão ( if ); estruturas de repetição ( for; while; ) ]

  # criar nossos métodos: 
  
  * ex: public static void main ( ) --- (argumento)
                                                
tem métodos que recebem argumentos e outros não. Há métodos que retornam alguma coisa e outros não.
  
  modificador:  public `modificador de acesso [visibidade]`
  
  ### outros modificadores:
   * public (método que todos podem acessar, método publico)
   * private (método privado, restrito, oculto, método não disponível para todos, somenta para alguns)
   * default (método padrão, quando não há modificador de acesso ele se torna default)
   * protected (método protegido)
   * static (modificador especial, estático)

   ### tipo de retorno

   * void [vazio]
   * int
   * double
   * objeto (classe)

   método quando não retorna nada, é do tipo `void`. Como exemplo: String, que exibe um texto mas não armazena algo. Metodo `main` é do tipo `void`, pois retorna um void.
   
   public static void main (String args []) 
   `vetor []`
   
criando método com decimais:
   
   * primeiro colocamos a visibilidade.
   * static (não obrigatório).
   * especificamos o tipo de retorno.
   * nome do método.
   * no argumento colocamos primeiro o tipo do argumento que está sendo recebido e depois o noome de uma variável que vai guardar aquele argumento.

    public static double somar(double n1, double n2){
        double soma = n1 + n2;
        return soma; ou return(n1 + n2);
    }
    return usamos quando precisamos retornar algo, só não usaremos quando for do tipo void.

# Array List

Devemos importá-la.

import java.util.ArrayList

* ArrayList<>
dentro de "<>" colocamos uma classe. 

ex: 

ArrayList<String> cidades = new ArrayList<String>();

### Adicionar (add)
	
	idade.add(25);
	idade.add(40);
	
  cidade.add("Bogota");
	cidade.add("Osasco");
	cidade.add("Barueri");
	
### Recuperar (get)
	
	System.out.println(idade.get(0));
	System.out.println(cidade.get(2));
	
 ### Remover (remove)
	
	cidade.remove("Osasco");
	
	
ArrayList<Object> lista = new ArrayList<Object>();
	
guarda qualquer tipo de informação (String, número inteiro, número decimal, caractere...)
	
lista.add("Larissa");
	
lista.add(23);
	
lista.add("s");
	
lista.add(9.5);
