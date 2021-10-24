## Design Patterns - Java

* Some of the most famous design patterns separated by packages.
* Java is used as the main language.
* This project is for educational and quick reference purposes.
* References: Head First Design Patterns - Eric Freeman.

## Patterns

* Strategy: Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
    * Principles: 
        * Identify the aspects of your application that vary and separate them from what stays the same.
        * Program to an interface, not an implementation. (Supertypes).
        * Favor composition over inheritance.
* Observer: Defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically.
    * Principles:
        * Strive for loosely coupled designs between objects that interact.
* Decorator: Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
    * Principles:
        * Classes should be open for extension, but closed for modification.
    * Notes:
        * Recursive behavior.
* Factory: 
    * The Factory Method Pattern: Defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
        * Principles:
            * Depend upon abstractions. Do not depend upon concrete classes.
        * Notes:
            * Is used for create one product.
    * The Abstract Factory Pattern: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
        * Notes:
            * Is used to create famuly of products.

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
