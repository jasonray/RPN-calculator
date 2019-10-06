package rpn;

import rpn.operator.AbsoluteOperator;
import rpn.operator.AdditionOperator;
import rpn.operator.AverageOperator;
import rpn.operator.ClearOperator;
import rpn.operator.DivisionOperator;
import rpn.operator.ExponentiationOperator;
import rpn.operator.FactorialOperator;
import rpn.operator.FibonacciOperator;
import rpn.operator.MaxOperator;
import rpn.operator.MinOperator;
import rpn.operator.MultiplicationOperator;
import rpn.operator.Operator;
import rpn.operator.ReverseOperator;
import rpn.operator.SubtractionOperator;

import java.util.ArrayList;
import java.util.List;

public class OperatorRegistry {

    private List<Operator> registry = getRegistry();

    private List<Operator> getRegistry() {
        List<Operator> operatorRegistry;
        operatorRegistry = new ArrayList<Operator>();
        operatorRegistry.add( new AdditionOperator() );
        operatorRegistry.add( new SubtractionOperator() );
        operatorRegistry.add( new MultiplicationOperator() );
        operatorRegistry.add( new DivisionOperator() );
        operatorRegistry.add( new FactorialOperator() );
        operatorRegistry.add( new ReverseOperator() );
        operatorRegistry.add( new AverageOperator() );
        operatorRegistry.add( new ClearOperator() );
        operatorRegistry.add( new ExponentiationOperator() );
        operatorRegistry.add( new AbsoluteOperator() );
        operatorRegistry.add( new FibonacciOperator() );
        operatorRegistry.add( new MaxOperator() );
        operatorRegistry.add( new MinOperator() );
        return operatorRegistry;
    }

    public Operator getOperator(String operatorCharacter) {
        Operator relevantOperator = null;
        if (operatorCharacter != null && !operatorCharacter.contentEquals( "" )) {
            for (Operator operator : registry) {
                if (operator.handlesOperatorCharacter( operatorCharacter )) {
                    relevantOperator = operator;
                    break;
                }
            }
        }
        return relevantOperator;
    }
}
