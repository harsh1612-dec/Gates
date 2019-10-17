package gates;

public class NOTGate {
    private int input;

    public NOTGate(int input) {
        this.input = input;

    }

    public NOTGate() {
    }

    private int getOutput(int input) {
        if (input == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private void printOutput(int input) {

    }

    public void printTruthTable() {
        System.out.println("----Truth Table For NOT Gate----\n" +
                "NOT0 results 1\n" +
                "NOT1 results 0");
    }

}

