========================================================
TRABALHO 01 - PROGRAMACAO ORIENTADA A OBJETOS
Universidade Federal de Uberlandia - Sistemas de Informacao
========================================================

Autor: Joao Antonio Rodrigues
Linguagem: Java (JDK 11+)

--------------------------------------------------------
ESTRUTURA
--------------------------------------------------------
src/main/java/
  exercicio1/  -> Veiculo (Veiculo.java + main.java)
  exercicio2/  -> Banco   (Banco.java + main.java)
  exercicio3/  -> Aluno   (Aluno.java + main.java)
  exercicio4/  -> Filme   (Filme.java + main.java)
  exercicio5/  -> Pikachu (Pikachu.java + main.java)
trabalho01.pdf -> Enunciado original


--------------------------------------------------------
COMO COMPILAR
--------------------------------------------------------
A partir da raiz do projeto (pasta "trabalho1"), execute:

    javac -encoding UTF-8 -d bin \
        src/main/java/exercicio1/*.java \
        src/main/java/exercicio2/*.java \
        src/main/java/exercicio3/*.java \
        src/main/java/exercicio4/*.java \
        src/main/java/exercicio5/*.java

Isso vai gerar os .class dentro da pasta "bin/".


--------------------------------------------------------
COMO EXECUTAR CADA EXERCICIO
--------------------------------------------------------
    java -cp bin exercicio1.main    (Veiculo)
    java -cp bin exercicio2.main    (Banco - pede valor de deposito e saque)
    java -cp bin exercicio3.main    (Aluno - calcula media e aprovacao)
    java -cp bin exercicio4.main    (Filme - pede dados do filme via teclado)
    java -cp bin exercicio5.main    (Pikachu - demonstra mudancas de estado)


--------------------------------------------------------
OBSERVACAO SOBRE ENCODING (UTF-8)
--------------------------------------------------------
O exercicio 2 (Banco) usa caracteres Unicode Braille em uma
arte ASCII. Se o terminal exibir "?" no lugar da arte,
execute a JVM forcando UTF-8 na saida:

    java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 \
         -cp bin exercicio2.main

No Windows, tambem pode ser necessario rodar antes:
    chcp 65001

Os demais exercicios usam apenas ASCII puro e nao tem
esse problema.
