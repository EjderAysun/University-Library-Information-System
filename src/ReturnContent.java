import java.util.Scanner;

public class ReturnContent {

    ExtraForRegisterNewUser extraForRegisterNewUser = new ExtraForRegisterNewUser();
    long theUserIdWhichWillReturnTheContent = 1;

    public long takeTheUserIdWhichWillReturnTheContent(){

        label:
        while(true){

            long theUserIdWhichWillReturnTheContentTemporary = extraForRegisterNewUser.getId("the user who will return the content");

            Scanner scanner = new Scanner(System.in);

            label2:
            while(true) {

                System.out.println("The id of the user from whom the content will be retrieved:" + theUserIdWhichWillReturnTheContentTemporary);
                System.out.println("Do you approve this id? ");
                System.out.println("If you want to return the content from the user with this id, press 'Y' or 'y'.");
                System.out.println("If you want to rewrite the id of the user you want to return content from, press 'N' or 'n'.");
                System.out.println("If you stopped returning content, press 'E' or 'e'.");

                String answerForTakeUserId = scanner.nextLine();

                switch (answerForTakeUserId) {
                    case "Y":
                    case "y":
                        theUserIdWhichWillReturnTheContent = theUserIdWhichWillReturnTheContentTemporary;
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
        long theUserIdWhichWillReturnTheContentReturn = theUserIdWhichWillReturnTheContent;
        theUserIdWhichWillReturnTheContent = 1;
        return theUserIdWhichWillReturnTheContentReturn;
    }

    public void addTheReturnedContentToTheSystem(long theUserIdWhichWillReturnTheContent){

        if(LendContentToTheUser.dictionaryForContentLendingRecords.containsKey(theUserIdWhichWillReturnTheContent)){
            String content = LendContentToTheUser.dictionaryForContentLendingRecords.get(theUserIdWhichWillReturnTheContent);
            if(ExtraForAddContentToTheSystem.dictionaryForContent.containsKey(content)){
                int number = ExtraForAddContentToTheSystem.dictionaryForContent.get(content);
                ++number;
                ExtraForAddContentToTheSystem.dictionaryForContent.replace(content, number);
                System.out.println("Increased the number of " + content + " content returned in the system by 1. Because this content has been returned.");
                LendContentToTheUser.dictionaryForContentLendingRecords.remove(theUserIdWhichWillReturnTheContent);
            }else{
                ExtraForAddContentToTheSystem.dictionaryForContent.put(content, 1);
                System.out.println("Increased the number of "+ content + " content returned in the system by 1. Because this content has been returned.");
                System.out.println("Also, this content was already available on the system but is out of stock. This user is the first to return the content. Thank him for returning the content first :D");
                LendContentToTheUser.dictionaryForContentLendingRecords.remove(theUserIdWhichWillReturnTheContent);
            }
        }else{
            System.out.println("The user whose id you entered did not retrieve content from the library. Please try again.");
        }
    }
}
