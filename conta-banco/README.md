# 🚀 Desafio ContaBanco

Este projeto consiste em um programa Java que simula a criação de uma conta bancária por meio da entrada de dados via terminal.

## 📌 Funcionamento

O sistema solicita ao usuário os seguintes dados:
- 🔢 **Número da conta** (inteiro)
- 🏦 **Número da agência** (texto)
- 👤 **Nome do cliente** (texto)
- 💰 **Saldo inicial** (decimal)

Após a entrada dos dados, o sistema exibe uma mensagem de confirmação contendo as informações inseridas.

### 🔹 Exemplo de Entrada e Saída
#### Entrada:
```sh
Por favor, digite o número da conta: 1021
Por favor, digite o número da agência: 067-8
Por favor, digite o nome do cliente: MARIO ANDRADE
Por favor, digite o saldo inicial: 237.48
```
#### Saída:
```sh
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```
## 🔧 Tecnologias Utilizadas

- ☕ **Java**
- 📥 **Scanner** para entrada de dados
- 🔗 **Concatenação de Strings** para exibição da mensagem final

## ▶️ Como Executar

1. ⬇️ Clone este repositório.
2. 🔨 Compile o programa:
   ```sh
   javac ContaTerminal.java
   ```
3. ▶️ Execute o programa:
   ```sh
   java ContaTerminal
   ```
4. ✍️ Insira os dados conforme solicitado e veja a mensagem de confirmação.

## 📂 Estrutura de Pastas

O espaço de trabalho contém duas pastas por padrão, onde:

- 📁 `src`: pasta para armazenar os arquivos-fonte
- 📦 `lib`: pasta para armazenar dependências

## 👥 Autor
Desenvolvido como parte do conteúdo da [DIO](www.dio.me) e baseado no desafio proposto por [Gleyson Sampaio](https://github.com/glysns).
