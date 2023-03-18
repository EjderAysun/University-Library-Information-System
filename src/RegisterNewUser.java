import java.util.*;

public class RegisterNewUser {

    ExtraForRegisterNewUser extraForRegisterNewUser = new ExtraForRegisterNewUser();
    String newUserNameOrSurname = "";
    long newUserId = 1;


    public String askUserToConfirmNameOrSurname(String nameOrSurname, String newUserOrUserToBeDeleted){

        label:
        while(true) {
            String newUserNameOrSurnameTemporary = extraForRegisterNewUser.getNameOrSurnameAndCheck(nameOrSurname, newUserOrUserToBeDeleted);

            Scanner scanner = new Scanner(System.in);

            label2:
            while(true) {

                System.out.println("The username you typed: " + newUserNameOrSurnameTemporary);
                System.out.println("Do you approve this " + nameOrSurname + "?");
                System.out.println("If you want to confirm and save this " + nameOrSurname + " to the system, press 'Y' or 'y'.");
                System.out.println("If you want to rewrite the " + nameOrSurname + " you will save, press 'N' or 'n'.");
                System.out.println("If you have given up the registration process, press 'E' or 'e'.");

                String answerForTakeUserNameOrSurname = scanner.nextLine();

                switch (answerForTakeUserNameOrSurname) {
                    case "Y":
                    case "y":
                        newUserNameOrSurname = newUserNameOrSurnameTemporary;
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
        String newUserNameOrSurnameReturn = newUserNameOrSurname;
        newUserNameOrSurname = "";
        return newUserNameOrSurnameReturn;
    }

    public long askUserToConfirmId(String userName, String userSurname){

        String user = userName + " " + userSurname;

        label:
        while(true) {
            long newUserIdTemporary = extraForRegisterNewUser.checkIfIdInListOrNot(extraForRegisterNewUser.getId(user));

            if(newUserIdTemporary == 1) continue;

            Scanner scanner = new Scanner(System.in);

            label2:
            while(true) {

                System.out.println("The id you typed: " + newUserIdTemporary);
                System.out.println("Do you approve this " + newUserIdTemporary + "?");
                System.out.println("If you want to confirm and save this " + newUserIdTemporary + " to the system, press 'Y' or 'y'.");
                System.out.println("If you want to rewrite the " + newUserIdTemporary + " you will save, press 'N' or 'n'.");
                System.out.println("If you have given up the registration process, press 'E' or 'e'.");

                String answerForTakeUserId = scanner.nextLine();

                switch (answerForTakeUserId) {
                    case "Y":
                    case "y":
                        newUserId = newUserIdTemporary;
                        break label;
                    case "N":
                    case "n":
                        break label2;
                    case "E":
                    case "e":
                        ExtraForRegisterNewUser.userList.remove(user);
                        System.out.println("Adding a new user has been cancelled.");
                        break label;
                }

                System.out.println("Please enter a valid answer! ");

            }
        }
        long newUserIdReturn = newUserId;
        newUserId = 1;
        return newUserIdReturn;
    }
}