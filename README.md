![Banner](https://github.com/LucVinicius-DEV/heranca-e-polimorfismo/blob/main/banner.png?raw=true)

# 🏦 BankSystem - Simulação Bancária com POO

Este projeto demonstra a aplicação de conceitos de **Programação Orientada a Objetos (POO)**, como **herança** e **polimorfismo**, para simular um sistema bancário básico. O sistema inclui diferentes tipos de contas e operações fundamentais.

## 📚 Projeto disponível

Os arquivos Java principais do projeto são:

-   [`Account.java`](./src/Account.java) — Classe base (abstrata) para contas bancárias, contendo atributos e métodos comuns como número da conta, titular, saldo e operações de saque e depósito.
-   [`BusinessAccount.java`](./src/BusinessAccount.java) — Representa uma conta empresarial. Herda de `Account` e adiciona funcionalidades específicas, como limite para empréstimo.
-   [`SavingsAccount.java`](./src/SavingsAccount.java) — Representa uma conta poupança. Herda de `Account` e inclui funcionalidades como cálculo de rendimento baseado em uma taxa de juros.
-   [`Program.java`](./src/Program.java) — Classe principal de execução (main) utilizada para instanciar objetos das classes de conta, realizar operações e demonstrar o polimorfismo.

## ⚙️ Tecnologias Utilizadas

-   Java
-   Git & GitHub

## 🧩 Conceitos Aplicados

-   **Herança**: Utilizada para criar classes especializadas (`BusinessAccount`, `SavingsAccount`) a partir de uma classe base (`Account`), promovendo o reuso de código.
-   **Polimorfismo**: Permite que objetos de diferentes classes sejam tratados de maneira uniforme através da classe base, por exemplo, ao chamar métodos como `deposit` ou `withdraw` em diferentes tipos de contas.
-   **Encapsulamento**: Proteção dos dados das classes utilizando modificadores de acesso e expondo funcionalidades através de métodos `public` (`getters` e `setters` implícitos ou explícitos nas operações).
-   **Classes Abstratas e Métodos**: A classe `Account` pode ser abstrata para garantir que apenas suas subclasses concretas sejam instanciadas.
-   Modelagem de Entidades do Domínio Bancário (Contas, Operações).

## ▶️ Como Executar

1.  Clone o repositório:
    ```bash
    git clone [https://github.com/LucVinicius-DEV/heranca-e-polimorfismo.git](https://github.com/LucVinicius-DEV/heranca-e-polimorfismo.git)
    ```
2.  Navegue até o diretório do projeto BankSystem:
    ```bash
    cd heranca-e-polimorfismo/BankSystem
    ```
3.  Compile os arquivos Java (se não estiver usando uma IDE que compila automaticamente):
    ```bash
    javac ./src/*.java
    ```
4.  Execute o arquivo `Program.java` (ou a classe que contém o método `main`):
    ```bash
    java src.Program
    ```
5.  Acompanhe as simulações de criação de contas e operações bancárias no console.

## ✨ Exemplo de Saída (Conceitual)

A saída no console demonstrará a criação de diferentes tipos de contas e a realização de operações:

Conta criada:
Número: 1001, Titular: Alex Green, Saldo Inicial: R$ 500.00
Depósito de R$ 200.00 na conta 1001.
Novo Saldo: R$ 700.00
Saque de R$ 100.00 da conta 1001.
Novo Saldo: R$ 600.00
Conta Poupança criada:
Número: 1002, Titular: Maria Brown, Saldo Inicial: R$ 1000.00, Taxa de Juros: 0.02%
Saldo Atualizado com Juros (exemplo): R$ 1000.20
Conta Empresarial criada:
Número: 1003, Titular: Bob Grey, Saldo Inicial: R$ 2000.00, Limite Empréstimo: R$ 10000.00
Empréstimo de R$ 500.00 realizado.
Novo Saldo: R$ 2500.00


## 👨‍💻 Autor

Desenvolvido por Lucas Vinícius durante os estudos práticos de Programação Orientada a Objetos em Java.

[LinkedIn](https://www.linkedin.com/in/lucas-vin%C3%ADcius-05b41a35b/) | [GitHub](https://github.com/LucVinicius-DEV)

Se esse projeto te ajudou, deixe uma ⭐ no repositório e acompanhe minha evolução!

