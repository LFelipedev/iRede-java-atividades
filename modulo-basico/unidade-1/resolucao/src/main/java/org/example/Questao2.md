## 📌 Enunciado

Escreva um programa que mostre na tela os **tipos de dados primitivos em Java** com seus valores atribuídos.

---

## 💻 Código da Questão

```java
package org.example;

/**
 * RESOLUÇÃO POR: LUIZ FELIPE
 * ENUNCIADO: Escreva um programa que mostre na tela os tipos
 * de dados primitivos em Java com seus valores atribuídos.
 */

public class q2 {
    public static void main(String[] args) {

        boolean maiorIdade = true;
        char sexo = 'M';
        int idade = 19;
        float altura = 1.75f;

        System.out.println("Exemplo de tipo boolean: " + maiorIdade);
        System.out.println("Exemplo de tipo char: " + sexo);
        System.out.println("Exemplo de tipo int: " + idade);
        System.out.println("Exemplo de tipo float: " + altura);
    }
}
```

---

## 🧠 O que são Tipos Primitivos?

Tipos primitivos são os **tipos de dados básicos de uma linguagem**. Eles armazenam valores simples diretamente na memória e não possuem métodos.

O Java possui **8 tipos primitivos**.

---

## 📋 Lista Completa dos Tipos Primitivos em Java

| Tipo      | Descrição                          | Exemplo         |
| --------- | ---------------------------------- | --------------- |
| `boolean` | Valor lógico (verdadeiro ou falso) | `true`, `false` |
| `char`    | Um único caractere                 | `'A'`, `'M'`    |
| `byte`    | Inteiro pequeno                    | `10`            |
| `short`   | Inteiro curto                      | `200`           |
| `int`     | Inteiro padrão                     | `19`            |
| `long`    | Inteiro longo                      | `100000L`       |
| `float`   | Decimal simples precisão           | `1.75f`         |
| `double`  | Decimal dupla precisão             | `3.14`          |

---

## 🎯 Objetivo Educacional

Com este exercício, o aluno aprende a:

* Conhecer todos os tipos primitivos do Java
* Declarar variáveis corretamente
* Entender a diferença entre tipos
* Exibir informações no console

---

📘 Linguagem: Java
✍️ Autor: Luiz Felipe
