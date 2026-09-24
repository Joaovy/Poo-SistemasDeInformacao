# Programação Orientada a Objetos — POO

Repositório de estudos da disciplina **Programação Orientada a Objetos (POO)** do curso de Sistemas de Informação (BSI) da **Universidade Federal de Uberlândia - FACOM**. Cada trabalho fica isolado em sua própria pasta e vai sendo adicionado ao longo do semestre, conforme os conceitos são apresentados em aula.

---

## Stack

| | |
|---|---|
| Linguagem | Java (JDK 15+) |
| IDE | IntelliJ IDEA / VS Code |
| Build | `javac` + `java` (sem Gradle/Maven) |
| Paradigma | Orientação a Objetos |

> **Por que JDK 15+?** Alguns exercícios usam *text blocks* (`"""..."""`) para arte ASCII multilinha, recurso introduzido no Java 15.

---

## Estrutura do repositório

```
ProgramacaoOrientadaObjetos/
├── README.md                          # Este arquivo
└── trabalho1/                         # Trabalho 01 — Classes, Objetos, Atributos, Métodos
    ├── README.txt                     # Instruções de compilação e execução
    ├── trabalho01.pdf                 # Enunciado original
    └── src/main/java/
        ├── exercicio1/                # Veículo
        ├── exercicio2/                # Sistema Financeiro (Banco)
        ├── exercicio3/                # Avaliação de Aluno
        ├── exercicio4/                # Item de Coleção (Filme) + Scanner
        └── exercicio5/                # Entidade de Jogo (Pikachu)
```

Futuros trabalhos (`trabalho2/`, `trabalho3/`, ...) seguirão o mesmo padrão: pasta própria, código isolado, enunciado e README de instruções junto.

---

## Trabalhos

### Trabalho 01 — Classes, Objetos, Atributos, Métodos, Construtores e Entrada de Dados

Primeiro contato com a orientação a objetos em Java: modelar entidades do mundo real como classes, encapsular estado em atributos privados, expor comportamento por métodos e usar construtores para inicializar objetos.

| # | Entidade | Conceito explorado |
|---|----------|--------------------|
| 1 | **Veículo** (`Veiculo`) | Atributos identificadores, construtor com parâmetros, método de relatório (`exibir`) e métodos que alteram estado (`ligarMotor`, `pararMotor`) |
| 2 | **Sistema Financeiro** (`Banco`) | Atributos de dono/saldo, construtores, métodos que **adicionam** (`deposito`) e **subtraem** (`saque`) valores, com validação de saldo insuficiente |
| 3 | **Avaliação de Aluno** (`Aluno`) | Atributos de identificação + atributos numéricos (notas), método que processa esses números (`calcularMedia`) e imprime **Aprovado / Reprovado** conforme a média |
| 4 | **Item de Coleção** (`Filme`) | Modelagem de item de mídia (nome, gênero, sinopse, duração, data de lançamento) com **leitura via `Scanner`**, `SimpleDateFormat` para converter texto em data e tratamento de `ParseException` |
| 5 | **Entidade de Jogo** (`Pikachu`) | Atributos numéricos que representam estado mutável (vida, energia, nível) e métodos que **aumentam/diminuem** esses valores (`receberDano`, `comer`, `treinar`), demonstrando a mudança no `main` |

📄 Enunciado completo: [`trabalho1/trabalho01.pdf`](./trabalho1/trabalho01.pdf)
📘 Instruções de execução: [`trabalho1/README.txt`](./trabalho1/README.txt)

---

## Como executar

Cada trabalho é independente e traz seu próprio `README.txt` com os comandos exatos. O padrão geral para qualquer trabalho é:

```bash
# 1. Entrar na pasta do trabalho
cd trabalho1

# 2. Compilar todos os exercícios de uma vez
javac -encoding UTF-8 -d bin \
    src/main/java/exercicio1/*.java \
    src/main/java/exercicio2/*.java \
    src/main/java/exercicio3/*.java \
    src/main/java/exercicio4/*.java \
    src/main/java/exercicio5/*.java

# 3. Rodar o exercício desejado
java -cp bin exercicio1.main
java -cp bin exercicio2.main
java -cp bin exercicio3.main
java -cp bin exercicio4.main
java -cp bin exercicio5.main
```

> 💡 **Terminal não exibindo caracteres especiais?** Alguns exercícios usam arte ASCII com caracteres Unicode. Se aparecerem `?` no lugar da arte, rode com `-Dfile.encoding=UTF-8`:
> ```bash
> java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -cp bin exercicio2.main
> ```
> No Windows, execute `chcp 65001` antes.

---

## Convenções do repositório

- **Um trabalho por pasta** — `trabalho1/`, `trabalho2/`, etc. Nada de misturar código de trabalhos diferentes.
- **Um pacote por exercício** — dentro de cada trabalho, cada exercício vive em seu próprio pacote (`exercicio1`, `exercicio2`, ...) com sua classe de domínio e um `main` para testar.
- **Sem dependências externas** — só JDK padrão. Isso garante que qualquer pessoa (professor incluído) consiga compilar e rodar sem instalar nada além do Java.
- **Encoding UTF-8** — todos os arquivos-fonte são salvos em UTF-8 e devem ser compilados com `-encoding UTF-8`.
- **Enunciado versionado junto** — o PDF de cada trabalho fica na pasta do próprio trabalho, para consulta rápida sem precisar procurar em outro lugar.

---

## Objetivo

Este repositório documenta meu aprendizado prático de **POO em Java** ao longo da disciplina. Cada trabalho é implementado do zero para fixar os conceitos apresentados em aula — classes, objetos, encapsulamento, construtores, entrada de dados e, nos próximos, herança, polimorfismo, interfaces e tratamento de exceções.

O código é intencionalmente **simples e direto**: nada de padrões de projeto sofisticados ou abstrações prematuras — o foco é entender bem os fundamentos antes de construir por cima.

---

**Autor:** João Antônio Rodrigues
**Curso:** Sistemas de Informação — FACOM/UFU
