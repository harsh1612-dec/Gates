package gates;

public class ORGate {
    private int input1;
    private int input2;

    public ORGate(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public ORGate(){

    }
    private int getOutput(int input1, int input2) {
        if (input1 == 0 && input2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public void printTruthTable(){
        System.out.println("----Truth Table For OR Gate----\n" +
                    "0 OR 0 results 0\n" +
                    "0 OR 1 results 1\n" +
                    "1 OR 0 results 1\n" +
                    "1 OR 1 results 1");
        }
    }





