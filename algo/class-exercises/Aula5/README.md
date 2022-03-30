# Operadores
## Operadores relacionais
Os operadores relacionais do Java são: >, <, >=, <=, ==, !=

## Operadores lógicos
Os operadores lógicos são: ! (not), && (and), || (or)

```java
!false == true;
true && !false == true;
false || true == true;
```
# Fazendo testes
## Testando expressões com if
### if
Se o teste avaliado no if for verdadeiro ele roda o que estiver dentro do bloco, em seguinda ele roda o resto do código

```java
int var = 7;

if (var > 6){
    System.out.println("var é maior que 6");
}

if (var >= 6) System.out.println("var é maior ou igual a 6");

System.out.println("O valor de var é " + var);
```

### else
Se o teste avaliado no if for falso, ele roda o que estiver no bloco do else, em seguida ele roda o resto do código
```java
int var = 3;

if (var > 6){
    System.out.println("var é maior que 6");
} else {
    System.out.println("var é menor que 6");
}

System.out.println("O valor de var é " + var);
```

### else if
Após o primeiro teste avaliado for falso, ele vai rodar o bloco de código da condição que é verdadeira, se nenhuma condição for verdadeira ele roda o bloco do else
```java
int var = 6;

if (var > 6){
    System.out.println("var é maior que 6");
} else if (var < 6){
    System.out.println("var é menor que 6");
} else {
    System.out.println("var é igual a 6");
}

System.out.println("O valor de var é " + var);
```