# Arabic and Roman numeral converter

Java project for bidirectional conversion between Arabic and Roman numerals, with graphical interaction through JOptionPane.

## Features

- Converts Arabic numerals to Roman numerals.
- Converts Roman numerals to Arabic numerals.
- Uses custom exceptions for invalid input.
- Includes unit tests for the converters.

## Technologies

Java, Swing/JOptionPane, Maven and JUnit Jupiter. pom.xml targets Java 18.

## Run locally

With JDK 18 and Maven installed:

```bash
mvn compile
java -cp target/classes application.Program
```

The environment must support graphical windows.

## Tests

```bash
mvn test
```

## Structure

- `converters/`: conversion algorithms.
- `numbers/`: models and exceptions.
- `application/`: menu and entry point.
- `src/test/java/`: converter tests.

## Context

A study project covering Java, input validation and unit testing.
