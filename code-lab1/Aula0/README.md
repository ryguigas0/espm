# Guardando vários valores em uma variável

## Arrays
Cria um array que guarde 42 inteiros
```java
    int[] x = new int[42];
    x[0] = 22; // Atribuir valor para um elemento
    // A contagem do índice do array começa no 0
    System.out.println(x); // Imprime o endereço de memória do array
    System.out.println(x[0]); // Imprime 22
    System.out.println(x[1]); // Imprime 0 (inteiro quando não atribui valor)
```