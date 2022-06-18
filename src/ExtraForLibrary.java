import java.util.Scanner;

public class ExtraForLibrary {

    public int controller = 0;

    public int operationSelection(){

        int operationSelection = 0;

        while (controller == 0) {

            Scanner scanner = new Scanner(System.in);

            String operationSelectionString = scanner.nextLine();

            if (operationSelectionString.equals("")) {
                System.out.println("Please enter a entry!");
                continue;
            } else if (operationSelectionString.length() > 0 && operationSelectionString.length() == operationSelectionString.chars().filter(i -> i == ' ').count()) {
                System.out.println("Please do not spam spaces! ");
                continue;
            }

            try
            {
                operationSelection = Integer.parseInt(operationSelectionString);
            }
            catch (NumberFormatException nfe)
            {
                if (operationSelectionString.contains(" ")) {

                    String operationSelectionStringTemporary = operationSelectionString.replace(" ", "");

                    try
                    {
                        operationSelection = Integer.parseInt(operationSelectionStringTemporary);
                    }

                    catch (NumberFormatException nfe2)
                    {
                        System.out.println("Please enter an integer!");
                        continue;
                    }

                    System.out.println("Please write the number without spaces!");

                } else { System.out.println("Please enter an integer!");
                }
                continue;
            }

            controller = 1;

            }
        return operationSelection;
        }
    }
