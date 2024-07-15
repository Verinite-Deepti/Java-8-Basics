# Java 8 Basics

Welcome to the Java 8 Basics repository! This README provides a concise overview of key features introduced in Java 8, including Optional, Streams, Collection API improvements, new Date and Time APIs, and more. It also includes assignments and a PDF.
## Optional

`Optional` is a container object that may or may not hold a non-null value. It helps avoid null references by providing methods to:

- Check for the presence of a value.
- Retrieve values if present.
- Handle default cases or exceptions if no value is present.

## Streams and Parallel Streams

- **Stream**: Represents a sequence of elements that can be processed in a functional style. Supports operations like filtering, mapping, and collecting.
- **Parallel Stream**: Allows concurrent processing of elements using multiple threads, improving performance for large datasets.

## Collection API Improvements

Java 8 enhanced the Collection API with new methods:

- **`forEach`**: Iterates over each element and performs a given action.
- **`removeIf`**: Removes elements that satisfy a specified condition.
- **`replaceAll`**: Replaces each element with the result of applying a specified operator.
- **`compute`**: Computes a new value for a given key in a map.
- **`merge`**: Merges a value into a map based on a specified merging function.
- **`spliterator`**: Provides a way to traverse and partition elements.

## Composition of Streams and Collection API

Java 8 allows combining streams with collection operations for advanced data processing:

- Use streams for filtering, mapping, and reducing data.
- Employ collection methods like `forEach` and `removeIf` for enhanced handling and manipulation.

## New Date and Time APIs

Java 8 introduced a new Date and Time API, including:

- **`LocalDateTime`**: Represents date and time without time zone information.
- **`ZonedDateTime`**: Represents date and time with time zone information, offering a comprehensive approach to date and time management.

## Default and Static Methods in Interfaces

Java 8 allows interfaces to have:

- **Default Methods**: Methods with default implementations that can be overridden by implementing classes.
- **Static Methods**: Methods that belong to the interface itself, rather than to instances of the interface.

## Lambda Expressions and Functional Interfaces

- **Lambda Expressions**: Provide a concise way to represent instances of functional interfaces using the syntax `(parameters) -> expression`.
- **Functional Interfaces**: Interfaces with a single abstract method, used as the target type for lambda expressions.

