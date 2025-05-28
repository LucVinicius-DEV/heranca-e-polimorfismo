![Banner](https://github.com/LucVinicius-DEV/heranca-e-polimorfismo/blob/main/banner.png?raw=true)

# 📚 Projetos com Herança e Polimorfismo em Java

Bem-vindo! Este repositório é uma coleção de projetos desenvolvidos em Java com o objetivo de demonstrar e praticar os conceitos fundamentais da **Programação Orientada a Objetos (POO)**, com foco especial em **Herança** e **Polimorfismo**. Cada subpasta contém um projeto distinto que aborda diferentes cenários de aplicação desses conceitos.

## 🚀 Projetos Disponíveis

Abaixo estão os projetos incluídos neste repositório:

### 1. 🏦 BankSystem
   - **Descrição**: Simulação de um sistema bancário com diferentes tipos de contas (comum, poupança e empresarial). Demonstra a aplicação de herança para especializar tipos de conta e polimorfismo para realizar operações financeiras como saques e depósitos de forma genérica.
   - **Principais Entidades**: `Account.java`, `SavingsAccount.java`, `BusinessAccount.java`.
   - **Acesse o projeto**: [`BankSystem/`](./BankSystem/)

### 2. 👨‍💼 EmployeePayment
   - **Descrição**: Sistema para processamento de pagamentos de funcionários, diferenciando entre funcionários regulares e terceirizados, cada um com sua forma de cálculo de pagamento. Ilustra como a herança pode ser usada para modelar diferentes tipos de empregados e o polimorfismo para processar uma lista heterogênea de pagamentos.
   - **Principais Entidades**: `Employee.java`, `OutsourcedEmployee.java`.
   - **Acesse o projeto**: [`EmployeePayment/`](./EmployeePayment/)

### 3. 🏷️ ProductPrice
   - **Descrição**: Sistema para registro de produtos e exibição de suas etiquetas de preço. Contempla produtos comuns, importados (com taxa de importação) e usados (com data de fabricação). Aplica herança para os tipos de produto e polimorfismo para gerar a "etiqueta de preço" (`priceTag`) de cada um.
   - **Principais Entidades**: `Product.java`, `ImportedProduct.java`, `UsedProduct.java`.
   - **Acesse o projeto**: [`ProductPrice/`](./ProductPrice/)

## ⚙️ Tecnologias Utilizadas

-   Java (JDK 17 ou superior recomendado)
-   Git & GitHub

## 🧩 Conceitos Chave Demonstrados

Os projetos neste repositório exploram e aplicam os seguintes conceitos de POO:

-   **Programação Orientada a Objetos (POO)**: Paradigma central utilizado.
-   **Herança**: Reutilização e especialização de código através da criação de superclasses e subclasses.
-   **Polimorfismo**: Capacidade de objetos de diferentes classes responderem à mesma mensagem (chamada de método) de maneiras específicas (Sobrescrita de Métodos).
-   **Encapsulamento**: Proteção e organização dos dados e comportamentos dentro das classes.
-   **Classes Abstratas e Métodos Abstratos**: Usados para definir modelos comuns que devem ser implementados por subclasses (ex: `Account` no BankSystem).
-   **Upcasting e Downcasting**: Conversão entre tipos de objetos na hierarquia de herança.
-   **Composição**: Quando aplicável, para construir objetos complexos a partir de outros mais simples.

## ▶️ Como Executar

Cada projeto possui sua própria estrutura e ponto de entrada (geralmente uma classe `Program.java` ou `Main.java`). Para executar um projeto específico:

1.  **Clone o repositório** (caso ainda não tenha feito):
    ```bash
    git clone [https://github.com/LucVinicius-DEV/heranca-e-polimorfismo.git](https://github.com/LucVinicius-DEV/heranca-e-polimorfismo.git)
    ```
2.  **Navegue até o diretório do projeto desejado**:
    ```bash
    cd heranca-e-polimorfismo/NomeDoProjeto 
    # Ex: cd heranca-e-polimorfismo/BankSystem
    ```
3.  **Compile os arquivos Java**:
    * Para projetos como `BankSystem` (com arquivos na raiz do `src` e sem pacotes explícitos):
        ```bash
        javac src/*.java 
        ```
    * Para projetos como `EmployeePayment` e `ProductPrice` (com pacotes `application` e `entities` dentro de `src`):
        ```bash
        # Opção 1: Compilar tudo para um diretório 'out' (recomendado)
        mkdir out 
        javac -d out src/application/Program.java src/entities/*.java
        # Ou de forma mais genérica dentro da pasta do projeto:
        # javac -d out src/*/*.java (se todas as classes estiverem em subpastas diretas de src)
        ```
4.  **Execute a classe principal**:
    * Para `BankSystem`:
        ```bash
        java -cp src Program 
        # (Se Program.java não tiver 'package', senão ajuste o classpath e nome da classe)
        ```
    * Para `EmployeePayment` e `ProductPrice` (se compilado para `out` e `Program.java` está no pacote `application`):
        ```bash
        java -cp out application.Program
        ```
    * **Nota**: Verifique o `Program.java` de cada projeto para confirmar o nome do pacote (se houver) e a classe principal. Pode ser necessário ajustar os comandos de compilação e execução dependendo da sua IDE ou ambiente.

## ✨ Exemplos de Saída (Conceituais)

Cada projeto, ao ser executado, demonstrará diferentes saídas no console:

* **BankSystem**:
    ```
    Conta: 1001, Titular: Alex Green, Saldo: R$ 500.00
    Depósito de R$ 200.00 na conta 1001. Novo Saldo: R$ 700.00
    ...
    ```
* **EmployeePayment**:
    ```
    PAGAMENTOS:
    Alex: R$ 5200.00
    Bob (Terceirizado): R$ 2240.00
    ...
    ```
* **ProductPrice**:
    ```
    ETIQUETAS DE PREÇO:
    Notebook: R$ 1100.00
    Tablet (Usado): R$ 400.00 (Data de fabricação: 15/03/2021)
    iPhone (Importado): R$ 1460.00 (Taxa de Alfândega: R$ 200.00)
    ...
    ```

## 👨‍💻 Autor

Desenvolvido por Lucas Vinícius durante os estudos práticos de Programação Orientada a Objetos em Java.

[LinkedIn](https://www.linkedin.com/in/lucas-vin%C3%ADcius-05b41a35b/) | [GitHub](https://github.com/LucVinicius-DEV)

Se esse projeto te ajudou, deixe uma ⭐ no repositório e acompanhe minha evolução!
