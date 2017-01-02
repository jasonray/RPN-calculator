package rpn.operator;

public class DivisionOperator extends BinaryOperator {

    private static final String DIVIDE = "/";

    @Override
    protected int doOperation(int lhs, int rhs) {
        return lhs / rhs;
    }

    @Override
    public boolean handlesOperatorCharacter(String operand) {
        return DIVIDE.contentEquals( operand );
    }

}
