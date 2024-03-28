#  Refactoring to Design Patterns

This repository contains code that needs to be refactored. In this dojo, we want to enforce refactoring to these specific the Strategy and Factory design patterns. Below is a brief description of these patterns.

### Strategy Design Pattern:
![Strategy Header](src/strategy_header.png)

This pattern allows defining a family of algorithms, encapsulating each of them, and making them interchangeable. This way, the client can vary the algorithm it uses without altering its structure.

### Strategy Pattern UML Diagram
![Strategy Diagram](src/strategy_pattern_uml_diagram.jpg)

### Example

```java
//Code before refactoring
class Calculator {
    public int calculate(String operation, int a, int b) {
        int result;
        if ("add".equals(operation)) {
            result = a + b;
        } else if ("subtract".equals(operation)) {
            result = a - b;
        } else if ("multiply".equals(operation)) {
            result = a * b;
        } else if ("divide".equals(operation)) {
            if (b != 0) {
                result = a / b;
            } else {
                throw new IllegalArgumentException("Cannot divide by zero");
            }
        } else {
            throw new IllegalArgumentException("Invalid operation: " + operation);
        }
        return result;
    }
}
```
### Implementation steps
```java
//IMPLEMENTATION
// Step 1
// Create an interface. 
// Normally called Strategy
interface Operation {
    int doOperation(int a, int b);
}

//Step 2
//Create concrete classes implementing the same interface.
//Normally called strategies
class AdditionOperation implements Operation {
    @Override
    public int doOperation(int a, int b) {
        return a + b;
    }
}

class SubtractionOperation implements Operation {
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}

class MultiplicationOperation implements Operation {
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}

class DivisionOperation implements Operation {
    @Override
    public int doOperation(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
    }
}
//Step 3
//Create Context/Calculator Class.
class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public int executeOperation(int a, int b) {
        return operation.doOperation(a, b);
    }
}

//Step 4
//Use the Context to see change in behaviour when it changes its strategy.
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new AdditionOperation());
        System.out.println("10 + 5 = " + calculator.executeOperation(10, 5));

        calculator = new Calculator(new SubtractionOperation());
        System.out.println("10 - 5 = " + calculator.executeOperation(10, 5));

        calculator = new Calculator(new MultiplicationOperation());
        System.out.println("10 * 5 = " + calculator.executeOperation(10, 5));
    }
}
```

### Factory Design Pattern:
![Factory Header](src/factory-method_header.png)

The Factory pattern provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects created. This enables the creation of objects without specifying the exact class of the object to be created.
### Factory Design Pattern UML Diagram
![Factory Diagram](src/factory_pattern_uml_diagram.jpg)

### Example

```java
//Code before refactoring
public class Main {
    public static void main(String[] args) {
        String circleShape = "circle";

        if ("circle".equalsIgnoreCase(shapeType)) {
            Circle circle = new Circle();
            circle.draw();
        } else if ("rectangle".equalsIgnoreCase(shapeType)) {
            Rectangle rectangle = new Rectangle();
            rectangle.draw();
        } else if ("square".equalsIgnoreCase(shapeType)) {
            Square square = new Square();
            square.draw();
        } else {
            System.out.println("Type of Shape Unknown);
        }

        String rectangle = "rectangle";

        if ("circle".equalsIgnoreCase(shapeType)) {
            Circle circle = new Circle();
            circle.draw();
        } else if ("rectangle".equalsIgnoreCase(shapeType)) {
            Rectangle rectangle = new Rectangle();
            rectangle.draw();
        } else if ("square".equalsIgnoreCase(shapeType)) {
            Square square = new Square();
            square.draw();
        } else {
            System.out.println("Type of Shape Unknown);
        }

        String square = "square";

        if ("circle".equalsIgnoreCase(shapeType)) {
            Circle circle = new Circle();
            circle.draw();
        } else if ("rectangle".equalsIgnoreCase(shapeType)) {
            Rectangle rectangle = new Rectangle();
            rectangle.draw();
        } else if ("square".equalsIgnoreCase(shapeType)) {
            Square square = new Square();
            square.draw();
        } else {
            System.out.println("Type of Shape Unknown);
        }
    }
}
```
### Implementation steps
```java
//After refactoring
import java.util.HashMap;

//IMPLEMENTATION
// Step 1
// Create an interface. 
interface Shape {
    void draw();
}

//Step 2
//Create concrete classes implementing the same interface.
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

//Step 3
//Create a Factory to generate object of concrete class based on given information.
class ShapeFactory {

    Map<String, Shape> shapeMap = new HashMap<>();

    public ShapeFactory() {
        shapeMap.put("CIRCLE", new Circle());
        shapeMap.put("RECTANGLE", new Rectangle());
        shapeMap.put("SQUARE", new Square());
    }

    public Shape getShape(String shapeType) {
        return shapeMap.get(type.toUpperCase());
    }
}
//Step 4
//Use the Factory to get object of concrete class
//by passing an information such as type.
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();
    }
}
```
## Basic Refactoring Techniques
Some basic refactoring techniques that can be applied include:
### Extract Method:
Divide a large method into smaller, more manageable parts.
### Rename Method:
Change the name of a method without changing its functionality to make the code clearer and more understandable
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
<https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm>
<https://www.tutorialspoint.com/design_pattern/factory_pattern.htm>