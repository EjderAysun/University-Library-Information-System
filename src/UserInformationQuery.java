import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Set;
public class UserInformationQuery {

    ExtraForRegisterNewUser extraForRegisterNewUser = new ExtraForRegisterNewUser();
    long idToQuery = 1;
    String userToQuery = "";

    public long askForTheIdToQuery(){

        label:
        while(true){

            long idToQueryTemporary = extraForRegisterNewUser.getId("you want to query");

            Scanner scanner = new Scanner(System.in);

            label2:
            while(true) {

                System.out.println("The id you want to query: " + idToQueryTemporary);
                System.out.println("Do you approve this id? ");
                System.out.println("If you want to query this id, press 'Y' or 'y'.");
                System.out.println("If you want to rewrite the id you want to query, press 'N' or 'n'.");
                System.out.println("If you have given up on the query, press 'E' or 'e'.");

                String answerForTakeUserId = scanner.nextLine();

                switch (answerForTakeUserId) {
                    case "Y":
                    case "y":
                        idToQuery = idToQueryTemporary;
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
        long idToQueryReturn = idToQuery;
        idToQuery = 1;
        return idToQueryReturn;
    }

    public String askForTheUserQuery(){

        label:
        while(true) {
            String userToQueryTemporary = extraForRegisterNewUser.getNameOrSurnameAndCheck("name and surname", "you want to query");

            Scanner scanner = new Scanner(System.in);

            label2:
            while(true) {

                System.out.println("The username you typed: " + userToQueryTemporary);
                System.out.println("Do you approve this user?");
                System.out.println("If you want to query this name, press 'Y' or 'y'.");
                System.out.println("If you want to rewrite the name you want to query, press 'N' or 'n'.");
                System.out.println("If you have given up on the query, press 'E' or 'e'.");

                String answerForTakeUser = scanner.nextLine();

                switch (answerForTakeUser) {
                    case "Y":
                    case "y":
                        userToQuery = userToQueryTemporary;
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
        String nameToQueryReturn = userToQuery;
        userToQuery = "";
        return nameToQueryReturn;
    }

    public void queryUser(long idToQuery){
        if(ExtraForRegisterNewUser.dictionaryForUser.containsKey(idToQuery)){
            System.out.println("User with this id: " + ExtraForRegisterNewUser.dictionaryForUser.get(idToQuery));
        }else{
            System.out.println("A user with this id could not be found in the system.");
        }
    }

    public void queryId(String user){
        if(ExtraForRegisterNewUser.dictionaryForUser.containsValue(user)){

            Set<Long> setId = ExtraForRegisterNewUser.dictionaryForUser.keySet().stream().filter(key -> user.equals(ExtraForRegisterNewUser.dictionaryForUser.get(key))).collect(Collectors.toSet());

            System.out.println("The id(s) of all users with this name: " + setId);
        }else{
            System.out.println("Id'(s) with this name and surname could not be found in the system.");
        }
    }
}
