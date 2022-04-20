# Verificando valores com `switch-case` e estruturas de repetição
## O `switch-case`
Evita uma pirâmide de `if-else` que só compara o valor de uma variável
```java
switch (valor) {
    case "valor possível":
        System.out.println("Eu tenho esse valor");
        break;

    case "outro valor":
    case "valor secreto":
        System.out.println("Eu tenho esse outro valor");
        break;

    default:
        System.out.println("Eu tenho esse outro OUTRO valor");
        break;
}
```

## Repetindo sem repetir código
Ao invés de você fazer Y e Crtl+C Crtl+V X vezes, faça o Y rodar X vezes
### `while`
Cheque a condição, se for verdadeira repita até ser falsa ou o loop querbar
```java
while (true) {
    System.out.println("INFINITOOOOOOO");
    
    if (kb.nextBoolean()) {
        break; // Quebra o loop
    }
}

// while (false) {
//     System.out.println("Não vou rodar");
// }
```

### `do-while`
Faça e repita se a condição for verdadeira
```java
do {
    System.out.println("Só vou rodar uma vez");
} while (false);
```

### `for`
Faça algo e uma coisa no final até que a condição seja falsa
```java
// inicialize algo; condição; ação pós fim do loop
for (int i = 0; i < 10; i++) {
    System.out.println("Valor de i: " + i);
}
```

## BÔNUS: operador ternário
É um `if-else` muito simplificado
```java
 System.out.println( x % 2 == 0 ? "É par!" : "É ímpar!");
```