## 📌 Enunciado

Escreva um programa Java que utilize **operadores lógicos** para verificar se um número está entre **10 e 20 (inclusive)**.

Valor utilizado no exemplo:

```java
int numero = 15;
```

---

## 💻 Código da Questão

```java
package org.example;

/**
 * RESOLUÇÃO POR: LUIZ FELIPE
 * ENUNCIADO: Escreva um programa Java que use os operadores lógicos
 * para verificar se um número está entre 10 e 20 (inclusive).
 */

public class q1 {
    public static void main(String[] args) {

        int numero = 15; // Declaração da variável

        if (numero >= 10 && numero <= 20) {
            System.out.println("O numero esta entre (inclusive) 10 e 20");
        } else {
            System.out.println("O numero nao esta entre (inclusive) 10 e 20");
        }

    }
}
```

---

## 🧠 Conceitos Explicados

### Variáveis

```java
int numero = 15;
```

* `int` é o tipo de dado inteiro
* `numero` é o nome da variável
* `15` é o valor armazenado

A variável é usada para guardar o número que será verificado.

---

### Operadores Relacionais

Os operadores relacionais comparam valores e retornam **true** ou **false**.

| Operador | Descrição      |
| -------- | -------------- |
| `==`     | Igual          |
| `!=`     | Diferente      |
| `>`      | Maior que      |
| `<`      | Menor que      |
| `>=`     | Maior ou igual |
| `<=`     | Menor ou igual |

Iremos utilizador os operadores de **Maior ou igual** e **Menor ou igual** para descobrir se o valor da variável esta no intervalo definido.

---

### Operadores Lógicos 

Os operadores lógicos são utilizadoa para criar expressões lógicas que retornam **true** ou **false**.

| Operador | Descrição      |
| -------- | -------------- |
| `&&`     | AND            |
| `||`     | OR             |
| `!`      | NOT            |

### Operador Lógico AND (`&&`)

```java
numero >= 10 && numero <= 20
```

O operador `&&` representa a lógica **AND**.

A condição só será verdadeira se **todas as comparações forem verdadeiras ao mesmo tempo**.

---

### Estrutura Condicional `if / else`

```java
if (condicao) {
    // executa se for verdadeira
} else {
    // executa se for falsa
}
```

No programa:

* Se o número estiver dentro do intervalo, uma mensagem positiva é exibida
* Caso contrário, uma mensagem negativa é mostrada

---

## 📊 Exemplos de Teste

| Valor | Resultado                                     |
| ----- | --------------------------------------------- |
| 10    | O numero esta entre (inclusive) 10 e 20       |
| 15    | O numero esta entre (inclusive) 10 e 20       |
| 20    | O numero esta entre (inclusive) 10 e 20       |
| 9     | O numero nao esta entre (inclusive) 10 e 20   |
| 21    | O numero nao esta entre (inclusive) 10 e 20   |

---

## 🎯 Objetivo Educacional

Este exercício permite ao aluno praticar:

* Declaração de variáveis
* Comparações 
* Operadores lógicos
* Estruturas de decisão

---

📘 Linguagem: Java
✍️ Autor: Luiz Felipe
