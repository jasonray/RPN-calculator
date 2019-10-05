# RPN calculator 
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/27bc341af2dc449dad2dbfc90bffa329)](https://www.codacy.com/manual/jasonray/RPN-calculator?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=jasonray/RPN-calculator&amp;utm_campaign=Badge_Grade)

The [RPN](http://en.wikipedia.org/wiki/Reverse_Polish_notation) calculator implementation is a good exercise for working through a languages capabilities and exploring OO strategies.

I have done three variations of the RPN calculator as exploratory into languages: 
-   [java](https://github.com/jasonray/RPN-calculator) 
-   [scala](https://github.com/jasonray/RPN-calculator-scala)
-   [javascript / node.js](https://github.com/jasonray/RPN-calculator-node)

## How to run
This implementation utilizes Java and Gradle.

### Prereqs
To install Java and Gradle, either download or install using brew
``` bash
brew install java
brew install gradle
```

### Unit Test
To run the tests, run the following command:
``` bash
gradle test
```

## To add a new operator
1) Create a new operator implementation class.  Add this class to the `operators` directory.  Follow the conventation of `(operator name)-operator.js` (example: `addition-operator.js`).

2) The operator implementation class needs to implement the interface `Operator`, which will have the class implement the following methods
-   `doOperation(RpnStack)`: this method is responsible for `pop`-ing the operands from the stack, execute the operation, and `push` the result back to the stack
-   `handlesOperatorCharacter(String)`: this method is responsible for checking if this class handles a particular operator character.  For example, an addition operation class would return `true` for `+`.

A sample base implementation for addition is shown below:

``` java
public class AdditionOperator implements Operator {

    private static final String PLUS = "+";

    @Override
    public int doOperation(RpnStack numbers) {
        int rhs = numbers.pop();
        int lhs = numbers.pop();
        int result = rhs + lhs;
        numbers.push(result);
        return result;
    }

    @Override
    public boolean handlesOperatorCharacter(String operand) {
        return PLUS.contentEquals( operand );
    }

}
```

3) Register operator in `OperatorRegistry`.  To do this, add the following statement: 
``` java
operatorRegistry.add( new AdditionOperator() );
```
