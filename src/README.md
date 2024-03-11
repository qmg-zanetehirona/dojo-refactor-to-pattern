#  Refactoring to Design Patterns

This repository contains code that needs to be refactored. In this dojo, we want to enforce refactoring to these specific the Strategy and Factory design patterns. Below is a brief description of these patterns.

### Strategy Pattern:
![Strategy Header](strategy_header.png)
This pattern allows defining a family of algorithms, encapsulating each of them, and making them interchangeable. This way, the client can vary the algorithm it uses without altering its structure.

### Factory Patter:
![Factory Header](factory-method_header.png)
The Factory pattern provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects created. This enables the creation of objects without specifying the exact class of the object to be created.

## Basic Refactoring Techniques
Some basic refactoring techniques that can be applied include:
### Extract Method:
Divide a large method into smaller, more manageable parts.
### Move Method:
Transfer a method to a more suitable class.
### Replace Duplicate Code with Method or Class:
Identify and remove code duplications by creating methods or classes that can be reused.

## Implementation of Refactoring Methods
To implement the aforementioned refactoring methods, follow these steps:
- Identify problematic areas in the code that could benefit from refactoring.
- Select the most suitable refactoring method for the specific problem.
- Apply the refactoring method, ensuring that tests pass before and after the changes.
- Refactor incrementally, constantly reviewing the code to maintain quality and functionality.

## Practice Exercises
### Refactoring to Strategy Pattern:
Identify an area of the code where the Strategy pattern can be applied to encapsulate a set of interchangeable algorithms.
Implement the necessary classes to represent the different algorithms and the context class that uses them.

### Refactoring to Factory Pattern:
Find a case in the code where the advantages of the Factory pattern can be applied to create objects without specifying their concrete class.
Create a factory that can create different types of objects according to the program's needs.

##  Objective
With these exercises, you'll be able to practice applying the Strategy and Factory design patterns, as well as improve your code refactoring skills.

#### References
<https://refactoring.guru/design-patterns/strategy>  
<https://sourcemaking.com/design_patterns/strategy>  
<https://refactoring.guru/design-patterns/factory-method>  
<https://sourcemaking.com/design_patterns/factory_method>