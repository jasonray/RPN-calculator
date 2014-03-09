package rpn.operator;

public class DivisionOperator extends BinaryOperator {

    private static final String DIVIDE = "/";

    @Override
    public boolean handlesOperatorCharacter(String operand) {
        return DIVIDE.contentEquals(operand);
    }

    @Override
    protected int doOperation(int lhs, int rhs) {
        return lhs / rhs;
    }

}
