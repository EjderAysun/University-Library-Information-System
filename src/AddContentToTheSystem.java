import java.util.Scanner;

public class AddContentToTheSystem {

    String newContent = "";
    int newContentNumber = 0;

    ExtraForAddContentToTheSystem extraForAddContentToTheSystem = new ExtraForAddContentToTheSystem();

    public String askToConfirmContent(){
        label:
        while(true) {
            String newContentTemporary = extraForAddContentToTheSystem.takeNewContentAndCheck("new");

            Scanner scanner = new Scanner(System.in);

            label2:
            while(true) {

                System.out.println("The new content you typed: " + newContentTemporary);
                System.out.println("Do you approve this new content?");
                System.out.println("If you want to confirm and save this new content to the system, press 'Y' or 'y'.");
                System.out.println("If you want to rewrite the new content you will save, press 'N' or 'n'.");
                System.out.println("If you have given up on adding new content, press the 'E' or 'e'.");

                String answerForNewContent = scanner.nextLine();

                switch (answerForNewContent) {
                    case "Y":
                    case "y":
                        newContent = newContentTemporary;
                        break label;
                    case "N":
                    case "n":
                        break label2;
                    case "E":
                    case "e":
                        break label;
                }

                System.out.println("Please enter a valid answer! ");

            }
        }
        String newUserNameOrSurnameReturn = newContent;
        newContent = "";
        return newUserNameOrSurnameReturn;
    }

    public int askToConfirmContentNumber(String newContent){
        label:
        while(true) {
            int newContentNumberTemporary = extraForAddContentToTheSystem.askHowManyContent(newContent, "added");

            Scanner scanner = new Scanner(System.in);

            label2:
            while(true) {

                System.out.println("You want to add " + newContentNumberTemporary + " of these new content.");
                System.out.println("Do you approve this new content number?");
                System.out.println("If you want to confirm and save this new content number to the system, press 'Y' or 'y'.");
                System.out.println("If you want to rewrite the new content number you will save, press 'N' or 'n'.");
                System.out.println("If you have given up on adding new content, press the 'E' or 'e'.");

                String answerForNewContentNumber = scanner.nextLine();

                switch (answerForNewContentNumber) {
                    case "Y":
                    case "y":
                        newContentNumber = newContentNumberTemporary;
                        break label;
                    case "N":
                    case "n":
                        break label2;
                    case "E":
                    case "e":
                        break label;
                }

                System.out.println("Please enter a valid answer! ");

            }
        }
        int newContentNumberReturn = newContentNumber;
        newContentNumber = 0;
        return newContentNumberReturn;
    }

}
