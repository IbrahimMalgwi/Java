package dietel.Chapter7;

import dietel.Chapter7.ComputeSimulator;

class ComputeSimulatorTest {
    public static void main(String[] args) {
        ComputeSimulator computerSimulator = new ComputeSimulator();
        computerSimulator.readInstructions();
        computerSimulator.runSML();
        computerSimulator.printDump();
    }

}