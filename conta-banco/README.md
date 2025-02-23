# Desafio ContaBanco

Este projeto consiste em um programa Java simples que simula a criação de uma conta bancária por meio da entrada de dados via terminal.

## Funcionalidades
- Solicita ao usuário as seguintes informações:
  - Número da conta (inteiro)
  - Número da agência (texto)
  - Nome do cliente (texto)
  - Saldo inicial (decimal)
- Exibe uma mensagem de confirmação com os dados inseridos.

## Tecnologias Utilizadas
- Java
- Scanner para entrada de dados
- Concatenação de Strings para exibição da mensagem final

## Como Executar
1. Clone este repositório.
2. Compile o programa:
   ```sh
   javac ContaTerminal.java
   ```
3. Execute o programa:
   ```sh
   java ContaTerminal
   ```
4. Insira os dados conforme solicitado e veja a mensagem de confirmação.

## Exemplo de Saída
```
Por favor, digite o número da conta: 1021
Por favor, digite o número da agência: 067-8
Por favor, digite o nome do cliente: MARIO ANDRADE
Por favor, digite o saldo inicial: 237.48

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```

## Estrutura de Pastas

O espaço de trabalho contém duas pastas por padrão, onde:

- `src`: pasta para armazenar os arquivos-fonte
- `lib`: pasta para armazenar dependências

Enquanto isso, os arquivos compilados serão gerados na pasta `bin` por padrão.
