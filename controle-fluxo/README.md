# Desafio Controle de Fluxo

Este projeto faz parte da trilha **Java Básico** da [DIO](www.dio.me) e tem como objetivo exercitar os conceitos apresentados no módulo de **Controle de Fluxo**.

## 📌 Funcionamento

O sistema recebe dois números inteiros como parâmetros via terminal e realiza uma contagem incremental entre eles. O desafio inclui a criação de uma exceção personalizada para validar a entrada dos parâmetros.

### 🔹 Regras de Funcionamento
- O usuário informa dois números inteiros.
- O programa realiza uma contagem incremental do primeiro número até o segundo.
- Caso o primeiro número seja maior que o segundo, uma exceção personalizada `ParametrosInvalidosException` será lançada com a mensagem: **"O segundo parâmetro deve ser maior que o primeiro"**.

### 🔹 Exemplo de Entrada e Saída
#### Entrada:
```
Digite o primeiro parâmetro:
12
Digite o segundo parâmetro:
30
```
#### Saída:
```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
...
Imprimindo o número 18
```
## 🔧 Tecnologias Utilizadas

- ☕ **Java**
- 📥 **Scanner** para entrada de dados
- 🔗 **Concatenação de Strings** para exibição da mensagem final

## ▶️ Como Executar
1. ⬇️ Clone este repositório.
2. 🔨 Compile o programa:
   ```sh
   javac Contador.java
   ```
3. ▶️ Execute o programa:
   ```sh
   java Contador
   ```
4. ✍️ Insira os valores conforme solicitado no terminal.

## 📂 Estrutura de Pastas

O espaço de trabalho contém duas pastas por padrão, onde:

- 📁 `src`: pasta para armazenar os arquivos-fonte
- 📦 `lib`: pasta para armazenar dependências

## 👥 Autor
Desenvolvido como parte do conteúdo da [DIO](www.dio.me) e baseado no desafio proposto por [Gleyson Sampaio](https://github.com/glysns).
