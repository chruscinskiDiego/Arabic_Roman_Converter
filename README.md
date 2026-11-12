# Conversor de números arábicos e romanos

Projeto em Java para conversão bidirecional entre números arábicos e romanos, com interação gráfica via JOptionPane.

## Funcionalidades

- Conversão de arábicos para romanos.
- Conversão de romanos para arábicos.
- Exceções específicas para entradas inválidas.
- Testes unitários dos conversores.

## Tecnologias

Java, Swing/JOptionPane, Maven e JUnit Jupiter. O pom.xml define compilação para Java 18.

## Executar

Com JDK 18 e Maven instalados:

```bash
mvn compile
java -cp target/classes application.Program
```

O ambiente precisa permitir a abertura de janelas.

## Testes

```bash
mvn test
```

## Organização

- `converters/`: algoritmos de conversão.
- `numbers/`: modelos e exceções.
- `application/`: menu e inicialização.
- `src/test/java/`: testes dos conversores.

## Contexto

Projeto de estudo de Java, validação de entradas e testes unitários.
