import java.util.*;

public class ExtraForAddContentToTheSystem {

    public static Map<String, Integer> dictionaryForContent = new HashMap<>();

    public String takeNewContentAndCheck(String newOrToBeDeletedContent){

        String newContent;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Please write the " + newOrToBeDeletedContent + " content's name. ");
            if(newOrToBeDeletedContent.equals("new"))
                System.out.println("If you enter a content that you have already entered, the number of content will be added to the previous one.");

            String newContentTemporary = scanner.nextLine();
            newContentTemporary = newContentTemporary.trim();

            if (newContentTemporary.matches("[a-zA-ZçğöşıüÇĞÖŞİÜ1-9]+")) {
                newContent = newContentTemporary.substring(0,1).toUpperCase()+newContentTemporary.substring(1).toLowerCase();
                break;
            }

            else if((newContentTemporary.matches(".*[a-zA-ZçğöşıüÇĞÖŞİÜ1-9].*")) && (newContentTemporary.contains(" "))){
                String newContentTemporary2 = newContentTemporary.replaceAll("\s+", "");

                if(newContentTemporary2.matches("[a-zA-ZçğöşıüÇĞÖŞİÜ1-9]+")){

                    List<Integer> indexList = new ArrayList<>();

                    newContentTemporary = newContentTemporary.replaceAll("\s+", " ");
                    int index = 1;
                    while(true){
                        index = newContentTemporary.indexOf(" ", index);
                        if (index == -1) break;
                        indexList.add(index);
                        index = index + 2;
                    }

                    newContentTemporary = newContentTemporary.toLowerCase();

                    char[] newContentTemporaryChars = newContentTemporary.toCharArray();

                    for(int i: indexList){
                        char charOfSpace = newContentTemporaryChars[i+1];
                        String stringOfSpace = String.valueOf(charOfSpace);
                        String toUpperCaseStringOfSpace = stringOfSpace.toUpperCase();
                        char[] toUpperCaseCharOfSpace = toUpperCaseStringOfSpace.toCharArray();
                        newContentTemporaryChars[i+1] = toUpperCaseCharOfSpace[0];
                    }
                    String errorEscapeValue = String.valueOf(newContentTemporaryChars[0]).toUpperCase();
                    newContentTemporaryChars[0] = errorEscapeValue.charAt(0);
                    newContent = String.valueOf(newContentTemporaryChars);
                    break;
                }
                System.out.println("Please use only the English alphabet(a-z or A-Z) or 'çğöşıüÇĞÖŞİÜ' and space or number if necessary!");
                continue;
            }

            else if (newContentTemporary.length() > 0 && newContentTemporary.length() == newContentTemporary.chars().filter(i -> i == ' ').count()){

                System.out.println("Please do not spam spaces!");
                continue;

            }

            else if (newContentTemporary.isEmpty()){
                System.out.println("Please enter an entry!");
                continue;
            }

            System.out.println("Please use only the English alphabet(a-z or A-Z) or 'çğöşıüÇĞÖŞİÜ' and space or number if necessary!");

        }
        return newContent;
    }

    public int askHowManyContent(String newContent, String addedOrDeleted){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many " + newContent + " will be " + addedOrDeleted + " to the library? ");
        while(true){
            int numberTemporaryInt;
            String numberTemporary = scanner.nextLine();
            try {
                numberTemporaryInt = Integer.parseInt(numberTemporary);
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter a valid!!!");
                continue;
            }
            if(!(numberTemporaryInt > 0)){
                System.out.println("The number of books to be added to the system cannot be negative or zero!");
                continue;
            }
            return numberTemporaryInt;
        }
    }

    public void addNewContentDictionary(String newContent, int newContentNumber){
        if (dictionaryForContent.containsKey(newContent)){
            int contentNumber = dictionaryForContent.get(newContent);
            newContentNumber += contentNumber;
            dictionaryForContent.replace(newContent, newContentNumber);
        }else{
            dictionaryForContent.put(newContent, newContentNumber);
        }
        System.out.println("The content has been added to the library.");
    }
}
