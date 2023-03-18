import java.util.*;

public class ExtraForRegisterNewUser {

    public static Map<Long, String> dictionaryForUser = new HashMap<>();
    public static List<String> userList = new ArrayList<>();
    public static List<Long> idList = new ArrayList<>();
    public boolean controlAddNameList = false;

    public String getNameOrSurnameAndCheck(String nameOrSurname, String newUserOrUserToBeDeleted){

        String newUserNameOrSurname;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Please write the " + newUserOrUserToBeDeleted + "'s " + nameOrSurname + ": ");

            String newUserNameOrSurnameTemporary = scanner.nextLine();
            newUserNameOrSurnameTemporary = newUserNameOrSurnameTemporary.trim();

            if (newUserNameOrSurnameTemporary.matches("[a-zA-ZçğöşıüÇĞÖŞİÜ]+")) {
                newUserNameOrSurname = newUserNameOrSurnameTemporary.substring(0,1).toUpperCase()+newUserNameOrSurnameTemporary.substring(1).toLowerCase();
                break;
            }

            else if((newUserNameOrSurnameTemporary.matches(".*[a-zA-ZçğöşıüÇĞÖŞİÜ].*")) && (newUserNameOrSurnameTemporary.contains(" "))){
                String newUserNameOrSurnameTemporary2 = newUserNameOrSurnameTemporary.replaceAll("\s+", "");

                if(newUserNameOrSurnameTemporary2.matches("[a-zA-ZçğöşıüÇĞÖŞİÜ]+")){

                    List<Integer> indexList = new ArrayList<>();

                    newUserNameOrSurnameTemporary = newUserNameOrSurnameTemporary.replaceAll("\s+", " ");
                        int index = 1;
                    while(true){
                        index = newUserNameOrSurnameTemporary.indexOf(" ", index);
                        if (index == -1) break;
                        indexList.add(index);
                        index = index + 2;
                    }

                    newUserNameOrSurnameTemporary = newUserNameOrSurnameTemporary.toLowerCase();

                    char[] newUserNameOrSurnameTemporaryChars = newUserNameOrSurnameTemporary.toCharArray();

                    for(int i: indexList){
                        char charOfSpace = newUserNameOrSurnameTemporaryChars[i+1];
                        String stringOfSpace = String.valueOf(charOfSpace);
                        String toUpperCaseStringOfSpace = stringOfSpace.toUpperCase();
                        char[] toUpperCaseCharOfSpace = toUpperCaseStringOfSpace.toCharArray();
                        newUserNameOrSurnameTemporaryChars[i+1] = toUpperCaseCharOfSpace[0];
                    }
                    String errorEscapeValue = String.valueOf(newUserNameOrSurnameTemporaryChars[0]).toUpperCase();
                    newUserNameOrSurnameTemporaryChars[0] = errorEscapeValue.charAt(0);
                    newUserNameOrSurname = String.valueOf(newUserNameOrSurnameTemporaryChars);
                    break;
                }
                System.out.println("Please use only the English alphabet(a-z or A-Z) or 'çğöşıüÇĞÖŞİÜ' and space if necessary!");
                continue;
            }

            else if (newUserNameOrSurnameTemporary.length() > 0 && newUserNameOrSurnameTemporary.length() == newUserNameOrSurnameTemporary.chars().filter(i -> i == ' ').count()){

                System.out.println("Please do not spam spaces!");
                continue;

            }

            else if (newUserNameOrSurnameTemporary.isEmpty()){
                System.out.println("Please enter an entry!");
                continue;
            }

            System.out.println("Please use only the English alphabet(a-z or A-Z) or 'çğöşıüÇĞÖŞİÜ' and space if necessary!");

        }
        return newUserNameOrSurname;
    }

    public void addRegisteredUserToList(String newUserName, String newUserSurname){

        String newUser = newUserName + " " + newUserSurname;
        userList.add(newUser);
        System.out.println(newUser + " has been added from the system.");
        controlAddNameList = true;
    }

    public long getId(String newUser){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write the " + newUser + "'s id (the id contains 11 numbers and is unique to each person): ");

        while (true) {

            long newUserIdTemporaryLong;

            String newUserIdTemporary = scanner.nextLine();

            if (newUserIdTemporary.length() > 0 && newUserIdTemporary.length() == newUserIdTemporary.chars().filter(i -> i == ' ').count()){
                System.out.println("Please do not spam spaces! ");
                continue;
            } else if (newUserIdTemporary.isEmpty()){
                System.out.println("Please enter an entry! ");
                continue;
            }

            try
            {
                newUserIdTemporaryLong = Long.parseLong(newUserIdTemporary);
            }
            catch(NumberFormatException nfe)
            {
                if (newUserIdTemporary.contains(" ")) {

                    String newUserIdTemporaryString = newUserIdTemporary.replace(" ", "");

                    try
                    {
                        Long.parseLong(newUserIdTemporaryString);
                    }

                    catch (NumberFormatException nfe3)
                    {
                        System.out.println("Please enter an integer!");
                        continue;
                    }

                    System.out.println("Please write the number without spaces!");

                } else{System.out.println("Please enter a valid!!!");
                }
                continue;
            }

            if(!(newUserIdTemporaryLong > 0)){
                System.out.println("Cannot be negative id!");
                continue;
            }

            if (newUserIdTemporary.length() == 11) {

                return newUserIdTemporaryLong;

            } else {
                System.out.println("Id is 11 digits!");
            }
        }
    }

    public long checkIfIdInListOrNot(long newUserId){

        Scanner scanner = new Scanner(System.in);

        if (idList.contains(newUserId)) {
            System.out.println("This id is another user's id. Please re-enter. Each user's ID is 11 digits and unique to him.");
            scanner.nextLine();
            newUserId = 1;
        }
        return newUserId;
    }

    public void addRegisteredIdToList(long newUserId){

        idList.add(newUserId);
        System.out.println(newUserId + " has been added from the system.");
    }

    public void putUserAndUserIdInDictinoary(String name, String surname, Long userId){
        String user = name + " " + surname;
        dictionaryForUser.put(userId, user);
    }
}
