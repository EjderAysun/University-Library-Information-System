import java.util.Scanner;

public class DeleteContentToTheSystem {

    String contentToBeDeleted = "";
    int contentNumberToBeDeleted = 0;
    ExtraForAddContentToTheSystem extraForAddContentToTheSystem = new ExtraForAddContentToTheSystem();

    public String askForContentToBeDeleted(){
        label:
        while(true) {

            String contentToBeDeletedTemporary = extraForAddContentToTheSystem.takeNewContentAndCheck("to be deleted");

            Scanner scanner = new Scanner(System.in);

            label2:
            while(true) {

                System.out.println("Content you want to be deleted: " + contentToBeDeletedTemporary);
                System.out.println("Do you approve this content to be deleted?");
                System.out.println("If you want to delete this content from the system, press the 'Y' or 'y'.");
                System.out.println("If you want to rewrite the content you are going to delete press 'N' or 'n'.");
                System.out.println("If you have given up on deleting content, press the 'E' or 'e'.");

                String answerForContentToBeDeleted = scanner.nextLine();

                switch (answerForContentToBeDeleted) {
                    case "Y":
                    case "y":
                        contentToBeDeleted = contentToBeDeletedTemporary;
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
        String newUserNameOrSurnameReturn = contentToBeDeleted;
        contentToBeDeleted = "";
        return newUserNameOrSurnameReturn;
    }

    public int askForContentNumberToBeDeleted(String contentToBeDeletedTemporary){
        label:
        while(true) {
            int contentNumberToBeDeletedTemporary = extraForAddContentToTheSystem.askHowManyContent(contentToBeDeletedTemporary, "deleted");

            if(ExtraForAddContentToTheSystem.dictionaryForContent.containsKey(contentToBeDeletedTemporary)){
                int contentNumber = ExtraForAddContentToTheSystem.dictionaryForContent.get(contentToBeDeletedTemporary);
                contentNumber -= contentNumberToBeDeletedTemporary;
                if(!(contentNumber >= 0)){
                    System.out.println("The maximum amount of content you can delete is " + ExtraForAddContentToTheSystem.dictionaryForContent.get(contentToBeDeletedTemporary) + ". Please enter a valid number.");
                    continue;
                }
            }

            Scanner scanner = new Scanner(System.in);

            label2:
            while(true) {

                System.out.println("Do you want to delete " + contentNumberToBeDeletedTemporary + " of the content you want to delete?");
                System.out.println("Do you approve the number of content you want to delete?");
                System.out.println("If you want to delete " + contentToBeDeletedTemporary + " of "+ contentNumberToBeDeletedTemporary + " contents in the system press 'Y' or 'y'.");
                System.out.println("If you want to retype the number of content you will delete press 'N' or 'n'.");
                System.out.println("If you have given up on deleting content press 'E' or 'e'.");

                String answerForContentNumberToBeDeleted = scanner.nextLine();

                switch (answerForContentNumberToBeDeleted) {
                    case "Y":
                    case "y":
                        contentNumberToBeDeleted = contentNumberToBeDeletedTemporary;
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
        int newContentNumberReturn = contentNumberToBeDeleted;
        contentNumberToBeDeleted = 0;
        return newContentNumberReturn;
    }

    public void deleteContent(String content, int number){
        if(ExtraForAddContentToTheSystem.dictionaryForContent.containsKey(content)){
            int contentNumber = ExtraForAddContentToTheSystem.dictionaryForContent.get(content);
            contentNumber -= number;
            if(contentNumber > 0){
                ExtraForAddContentToTheSystem.dictionaryForContent.replace(content, contentNumber);
                System.out.println(number + " " + content + " content has been deleted from the system.");
            }else if (contentNumber == 0){
                ExtraForAddContentToTheSystem.dictionaryForContent.remove(content);
            }else{
                System.out.println("The maximum amount of content you can delete is " + ExtraForAddContentToTheSystem.dictionaryForContent.get(content) + ". Please enter a valid number.");
            }
        }else{
            System.out.println("The content you want to delete does not already exist in the system.");
        }
    }
}
