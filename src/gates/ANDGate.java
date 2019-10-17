package gates;

public class ANDGate {
    private int input1;
    private int input2;

    public ANDGate(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public ANDGate(){

    }

    public int getInput1() {
        return input1;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput2() {
        return input2;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    private int getOutput(int input1, int input2){
        if (input1 == 1 && input2 == 1){
            return 1;
        }
        else {
            return 0;
        }
    }

    private void printOutput(int input1, int input2){

    }

    public void printTruthTable(){
        System.out.println("----Truth Table For AND Gate----\n" +
                "0 AND 0 results 0\n" +
                "0 AND 1 results 0\n" +
                "1 AND 0 results 0\n" +
                "1 AND 1 results 1");
    }
}
