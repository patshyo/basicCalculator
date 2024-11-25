public class Multiplication extends Addition {

    private double firstInput;
    private double secondInput;
    private double finalInput;

    public void setFirstInput(double firstInput) {
        this.firstInput = firstInput;
    }

    public void setSecondInput(double secondInput){
        this.secondInput = secondInput;
    }

    @Override
    public double getFirstInput() {
        this.finalInput = firstInput*secondInput;
        return finalInput;
    }

    public String toString() {
        return String.format("f%n", finalInput);
    }
}

//pseudocode:
// step 1. get symbol * to symbolise multiplication
// basically when * is scanned this invokes the multiplication method
// Multiplication(mxn) is m adding to itself n number of times
//how to achieve this - possibly a for loop that has a count=no. of times adding(n) and adds another m each cycle.
//
//