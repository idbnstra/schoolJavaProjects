package schoolJavaProjects.calculator;

public class UnkownOperatorException extends Exception {
    public UnkownOperatorException() {
        super("Unkown operator! where did you learn how to do math? \n Re-enter your last line:");
    }
}
