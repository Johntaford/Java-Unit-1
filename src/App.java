import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class App {

	

	public static void printVariableNames(List<Variable> vars) {
        for (Variable var : vars) {
            System.out.println(var.getName());
        }
    }

    public static int getTotalBits(List<Variable> vars) {
        int totalBits = 0;
        for (Variable var : vars) {
            totalBits += var.getBits();
        }
        return totalBits;
    }

    public static void main(String[] args) {
        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        List<Variable> variableList = new ArrayList<Variable>();

        while (!userInput.equalsIgnoreCase("}")) {
            System.out.println("Declare a variable as {type} {name} or Enter } to quit.");
            userInput = scanner.nextLine();
            if (!userInput.equalsIgnoreCase("}")) {
                StringTokenizer var = new StringTokenizer(userInput);
                String type = var.nextToken(" ");
                String name = var.nextToken(";");

                Variable variable = new Variable(name, type);
                variableList.add(variable);
            }
        }
        scanner.close();
        printVariableNames(variableList);
        System.out.println("Total Bits: "+getTotalBits(variableList));
    }
}