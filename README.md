# 📌 Cadastro de Conta Bancária

Este é um [desafio de projeto do bootcamp da DIO](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe) que simula o cadastro de uma conta bancária via terminal. Como melhoria foi implementado a validação dos dados informados pelo usuário antes do registro das informações.

## 🚀 Funcionalidades adicionadas

- Solicita informações do usuário para criar uma conta:
    - **Número da Conta** (somente números)
    - **Agência** (formato 4 dígitos ou 4 dígitos + dígito verificador)
    - **Nome Completo** (apenas letras e espaços)
    - **Saldo Inicial** (número decimal)
- Validação de entrada para evitar erros no cadastro.
- Exibe uma mensagem de confirmação com os dados da conta criada.

## 🛠 Tecnologias Utilizadas

- Java
- Scanner para entrada de dados
- Expressões regulares (Regex) para validação de entradas
- Tratamento de exceções com `try-catch`

