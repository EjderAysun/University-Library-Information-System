import java.util.Scanner;
public class DeleteUser {

    ExtraForRegisterNewUser extraForRegisterNewUser = new ExtraForRegisterNewUser();

    public long takeIdToBeDeleted () {
        long idToBeDeleted = 1;
        label:
        while(true) {
            long idTemporary = extraForRegisterNewUser.getId("(which you want to delete)user");

            Scanner scanner = new Scanner(System.in);

            label2:
            while(true) {

                System.out.println("The username you typed: " + idTemporary);
                System.out.println("Do you approve this " + idTemporary);
                System.out.println("If you want to delete this " + idTemporary + " from the system, press 'Y' or 'y'.");
                System.out.println("If you want to rewrite the " + idTemporary + " you will delete, press 'N' or 'n'.");
                System.out.println("If you have opted out of the deletion process, press 'E' or 'e'.");

                String answerForIdToBeDeleted = scanner.nextLine();

                switch (answerForIdToBeDeleted) {
                    case "Y":
                    case "y":
                        idToBeDeleted = idTemporary;
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
        return idToBeDeleted;
    }

    public void deleteRegisteredUserFromList(long idToBeDeleted){

        if (ExtraForRegisterNewUser.dictionaryForUser.containsKey(idToBeDeleted) && !(LendContentToTheUser.dictionaryForContentLendingRecords.containsKey(idToBeDeleted))){

            String user = ExtraForRegisterNewUser.dictionaryForUser.get(idToBeDeleted);
            ExtraForRegisterNewUser.userList.remove(ExtraForRegisterNewUser.dictionaryForUser.get(idToBeDeleted));
            ExtraForRegisterNewUser.idList.remove(idToBeDeleted);
            ExtraForRegisterNewUser.dictionaryForUser.remove(idToBeDeleted);

            System.out.println(user + "(" + idToBeDeleted + ") has been deleted from the system.");
        } else if(LendContentToTheUser.dictionaryForContentLendingRecords.containsKey(idToBeDeleted)){
                System.out.println("This user has borrowed content from the system. The user cannot be deleted from the system without returning this content.");
        }
        else {
            System.out.println("The id you want to delete does not already exist in the system.");
        }
    }
}
