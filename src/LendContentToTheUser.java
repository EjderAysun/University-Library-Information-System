import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LendContentToTheUser {

    ExtraForRegisterNewUser extraForRegisterNewUser = new ExtraForRegisterNewUser();
    ExtraForAddContentToTheSystem extraForAddContentToTheSystem = new ExtraForAddContentToTheSystem();
    long userIdToWhomTheContentWillBeGiven = 1;
    String contentToBeLoaned = "";
    public static Map<Long, String> dictionaryForContentLendingRecords = new HashMap<>();

    public long takeTheUserIdToWhomTheContentWillBeGiven(){

        label:
        while(true){

            long userIdToWhomTheContentWillBeGivenTemporary = extraForRegisterNewUser.getId("user to whom the content will be given");

            Scanner scanner = new Scanner(System.in);

            label2:
            while(true) {

                System.out.println("The id of the user to whom the content will be given: " + userIdToWhomTheContentWillBeGivenTemporary);
                System.out.println("Do you approve this id? ");
                System.out.println("If you want to give content to the user with this id, press 'Y' or 'y'.");
                System.out.println("If you want to rewrite the id of the user you want to give content to, press 'N' or 'n'.");
                System.out.println("If you have stopped lending content, press 'E' or 'e'.");

                String answerForTakeUserId = scanner.nextLine();

                switch (answerForTakeUserId) {
                    case "Y":
                    case "y":
                        userIdToWhomTheContentWillBeGiven = userIdToWhomTheContentWillBeGivenTemporary;
                        break label;
                    case "N":
                    case "n":
                        break label2;
                    case "E":
                    case "e":
                        break label;
                }
            }
        }
        long userIdToWhomTheContentWillBeGivenReturn = userIdToWhomTheContentWillBeGiven;
        userIdToWhomTheContentWillBeGiven = 1;
        return userIdToWhomTheContentWillBeGivenReturn;
    }

    public String takeWhatContentWillBeGiven(){

        label:
        while(true) {
            String contentToBeLoanedTemporary = extraForAddContentToTheSystem.takeNewContentAndCheck("will be loaned");

            Scanner scanner = new Scanner(System.in);

            label2:
            while(true) {

                System.out.println("Content to be given: " + contentToBeLoanedTemporary);
                System.out.println("Do you approve of the lending of this content? ");
                System.out.println("If you consent to the delivery of this content, press 'Y' or 'y'.");
                System.out.println("If you want to rewrite the content to export, press 'N' or 'n'.");
                System.out.println("If you have stopped lending the content, press the 'E' or 'e'.");

                String answerForContent = scanner.nextLine();

                switch (answerForContent) {
                    case "Y":
                    case "y":
                        contentToBeLoaned = contentToBeLoanedTemporary;
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
        String contentToBeLoanedReturn = contentToBeLoaned;
        contentToBeLoaned = "";
        return contentToBeLoanedReturn;
    }

    public void lendContent(long theUserIdToWhomTheContentWillBeGiven, String contentToBeLoaned){
        if(dictionaryForContentLendingRecords.containsKey(theUserIdToWhomTheContentWillBeGiven)){
            System.out.println("This user has not returned any content yet. More than 1 content cannot be borrowed at the same time.");
        } else if(ExtraForRegisterNewUser.idList.contains(theUserIdToWhomTheContentWillBeGiven) || ExtraForAddContentToTheSystem.dictionaryForContent.containsKey(contentToBeLoaned)){
            if(!(ExtraForRegisterNewUser.idList.contains(theUserIdToWhomTheContentWillBeGiven))){
                System.out.println("There is no such user in the system. Please try again.");
            }else if(!(ExtraForAddContentToTheSystem.dictionaryForContent.containsKey(contentToBeLoaned))){
                System.out.println("There is no such content in the system. Please try again.");
            }else{
                if(ExtraForAddContentToTheSystem.dictionaryForContent.get(contentToBeLoaned) > 1){
                    String user = ExtraForRegisterNewUser.dictionaryForUser.get(theUserIdToWhomTheContentWillBeGiven);
                    dictionaryForContentLendingRecords.put(theUserIdToWhomTheContentWillBeGiven, contentToBeLoaned);
                    System.out.println("In order for the library to serve more people effectively, each user can borrow only 1 content at a time.");
                    System.out.println("It has been noted that a user named " + user + " was given content named " + contentToBeLoaned + ".");
                    int number = ExtraForAddContentToTheSystem.dictionaryForContent.get(contentToBeLoaned);
                    --number;
                    ExtraForAddContentToTheSystem.dictionaryForContent.replace(contentToBeLoaned, number);
                    System.out.println("The number of content named " + contentToBeLoaned + " in the system has been reduced by 1.");
                }else if(ExtraForAddContentToTheSystem.dictionaryForContent.get(contentToBeLoaned) == 1){
                    String user = ExtraForRegisterNewUser.dictionaryForUser.get(theUserIdToWhomTheContentWillBeGiven);
                    dictionaryForContentLendingRecords.put(theUserIdToWhomTheContentWillBeGiven, contentToBeLoaned);
                    System.out.println("In order for the library to serve more people effectively, each user can borrow only 1 content at a time.");
                    System.out.println("It has been noted that a user named " + user + " was given content named" + contentToBeLoaned + ".");
                    ExtraForAddContentToTheSystem.dictionaryForContent.remove(contentToBeLoaned);
                    System.out.println("The last " + contentToBeLoaned + " content has been borrowed and the content has been deleted from the system. When the user returns the content, it will be added back to the system.");
                }
            }
        }else{
            System.out.println("Both such content and such a user do not exist in the system. Please try again.");
        }
    }
}
