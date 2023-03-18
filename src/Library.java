import java.util.Scanner;
public class Library {
    public static void main(String[] args) {

        RegisterNewUser registerNewUser = new RegisterNewUser();
        ExtraForLibrary extraForLibrary = new ExtraForLibrary();
        DeleteUser deleteUser = new DeleteUser();
        ExtraForRegisterNewUser extraForRegisterNewUser = new ExtraForRegisterNewUser();
        AddContentToTheSystem addContentToTheSystem = new AddContentToTheSystem();
        ExtraForAddContentToTheSystem extraForAddContentToTheSystem = new ExtraForAddContentToTheSystem();
        DeleteContentToTheSystem deleteContentToTheSystem = new DeleteContentToTheSystem();
        UserInformationQuery userInformationQuery = new UserInformationQuery();
        ContentQuery contentQuery = new ContentQuery();
        TotalNumberOfUsers totalNumberOfUsers = new TotalNumberOfUsers();
        TotalNumberOfContents totalNumberOfContents = new TotalNumberOfContents();
        LendContentToTheUser lendContentToTheUser = new LendContentToTheUser();
        ReturnContent returnContent = new ReturnContent();


        while(true){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Press '0' if you want to exit the system.");
            System.out.println("If you don't want to shut down the system, press any key other than '0' and continue.");

            if(scanner.nextLine().equals("0")){
                System.out.println("The system has been shut down.");
                System.exit(0);
            }

            System.out.println("Please enter admin id and password");  // Only admin can enter the system and only admin has admin id and password.
            System.out.println("Please enter admin id: ");
            String adminId = scanner.nextLine();
            System.out.println("Please enter admin password: ");
            String adminPassword = scanner.nextLine();

            if(adminId.equals("123456789") && adminPassword.equals("qwert123")){

                while(true){
                    System.out.println("Please enter the number of the transaction you want to make: ");
                    System.out.println("Press [0]   ===>>>   Terminate the program");
                    System.out.println("Press [1]   ===>>>   Start a library membership for a user");
                    System.out.println("Press [2]   ===>>>   End library subscription for a user");
                    System.out.println("Press [3]   ===>>>   Add new content to the library");
                    System.out.println("Press [4]   ===>>>   Delete content from the system");
                    System.out.println("Press [5]   ===>>>   Query id from username");
                    System.out.println("Press [6]   ===>>>   Query username from id");
                    System.out.println("Press [7]   ===>>>   Query content");
                    System.out.println("Press [8]   ===>>>   Total number of users and all users");
                    System.out.println("Press [9]   ===>>>   Total number of contents and all contents");
                    System.out.println("Press [10]   ===>>>   Lend content to user");
                    System.out.println("Press [11]   ===>>>   Return content from user");

                    int operationSelection = extraForLibrary.operationSelection();

                    if ((operationSelection >= 0 && operationSelection <= 11)) {
                        extraForLibrary.controller = 0;
                        switch (operationSelection) {
                            case 0 -> {
                                System.out.println("The system has been shut down.");
                                System.exit(0);
                            }
                            case 1 -> {
                                String takeUserName = registerNewUser.askUserToConfirmNameOrSurname("name", "new user");
                                if (!(takeUserName.equals(""))) {
                                    String takeUserSurname = registerNewUser.askUserToConfirmNameOrSurname("surname", "new user");
                                    if (!(takeUserSurname.equals(""))) {
                                        extraForRegisterNewUser.addRegisteredUserToList(takeUserName, takeUserSurname);
                                        if (extraForRegisterNewUser.controlAddNameList) {
                                            extraForRegisterNewUser.controlAddNameList = false;
                                            long takeUserId = registerNewUser.askUserToConfirmId(takeUserName, takeUserSurname);
                                            if (!(takeUserId == 1)) {
                                                extraForRegisterNewUser.addRegisteredIdToList(takeUserId);
                                                extraForRegisterNewUser.putUserAndUserIdInDictinoary(takeUserName, takeUserSurname, takeUserId);
                                            }
                                        }
                                    }
                                }
                            }
                            case 2 -> {
                                long idToBeDeleted = deleteUser.takeIdToBeDeleted();
                                if (!(idToBeDeleted == 1)) {
                                    deleteUser.deleteRegisteredUserFromList(idToBeDeleted);
                                }
                            }
                            case 3 -> {
                                String newContent = addContentToTheSystem.askToConfirmContent();
                                if (!(newContent.equals(""))) {
                                    int newContentNumber = addContentToTheSystem.askToConfirmContentNumber(newContent);
                                    if (!(newContentNumber == 0)) {
                                        extraForAddContentToTheSystem.addNewContentDictionary(newContent, newContentNumber);
                                    }
                                }
                            }
                            case 4 -> {
                                String contentToBeDeleted = deleteContentToTheSystem.askForContentToBeDeleted();
                                if (!(contentToBeDeleted.equals(""))) {
                                    int contentNumberToBeDeleted = deleteContentToTheSystem.askForContentNumberToBeDeleted(contentToBeDeleted);
                                    if (!(contentNumberToBeDeleted == 0)) {
                                        deleteContentToTheSystem.deleteContent(contentToBeDeleted, contentNumberToBeDeleted);
                                    }
                                }
                            }
                            case 5 -> userInformationQuery.queryId(userInformationQuery.askForTheUserQuery());
                            case 6 -> userInformationQuery.queryUser(userInformationQuery.askForTheIdToQuery());
                            case 7 -> contentQuery.queryContent(contentQuery.askToContentToQuery());
                            case 8 -> totalNumberOfUsers.returnAllInformationAboutUsers();
                            case 9 -> totalNumberOfContents.returnAllInformationAboutContents();
                            case 10 -> {
                                long theUserIdToWhomTheContentWillBeGiven = lendContentToTheUser.takeTheUserIdToWhomTheContentWillBeGiven();
                                if (!(theUserIdToWhomTheContentWillBeGiven == 1)) {
                                    String contentToBeLoaned = lendContentToTheUser.takeWhatContentWillBeGiven();
                                    if (!(contentToBeLoaned.equals(""))) {
                                        lendContentToTheUser.lendContent(theUserIdToWhomTheContentWillBeGiven, contentToBeLoaned);
                                    }
                                }
                            }
                            case 11 -> {
                                long theUserIdWhichWillReturnTheContent = returnContent.takeTheUserIdWhichWillReturnTheContent();
                                if (!(theUserIdWhichWillReturnTheContent == 1)) {
                                    returnContent.addTheReturnedContentToTheSystem(theUserIdWhichWillReturnTheContent);
                                }
                            }
                        }
                    } else{
                        System.out.println("Please enter an integer indicating your selection!");
                        extraForLibrary.controller = 0;
                    }
                }
            } else if(!adminId.equals("123456789") && adminPassword.equals("qwert123")){
                System.out.println("Wrong admin id");
                System.out.println("Please try again.");
            } else if(adminId.equals("123456789")){
                System.out.println("Wrong admin password");
                System.out.println("Please try again.");
            } else{
                System.out.println("Both admin id and admin password are wrong.");
                System.out.println("Please try again.");
            }
        }
    }
}