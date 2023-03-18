import java.util.Scanner;

public class ContentQuery {

    String contentToQuery = "";

    ExtraForAddContentToTheSystem extraForAddContentToTheSystem = new ExtraForAddContentToTheSystem();

    public String askToContentToQuery(){
        label:
        while(true) {
            String contentToQueryTemporary = extraForAddContentToTheSystem.takeNewContentAndCheck("query");

            Scanner scanner = new Scanner(System.in);

            label2:
            while(true) {

                System.out.println("Content you want to query: " + contentToQueryTemporary);
                System.out.println("Do you approve of this content to query?");
                System.out.println("If you want to query this content, press the 'Y' or 'y' key.");
                System.out.println("Press 'N' or 'n' if you want to rewrite the content you want to query.");
                System.out.println("Press the 'E' or 'e' key if you have stopped querying for content.");

                String answerForNewContent = scanner.nextLine();

                switch (answerForNewContent) {
                    case "Y":
                    case "y":
                        contentToQuery = contentToQueryTemporary;
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
        String contentToQueryReturn = contentToQuery;
        contentToQuery = "";
        return contentToQueryReturn;
    }


    public void queryContent(String contentToQuery){
        if(ExtraForAddContentToTheSystem.dictionaryForContent.containsKey(contentToQuery)){
            System.out.println("There are " + ExtraForAddContentToTheSystem.dictionaryForContent.get(contentToQuery) + " " + contentToQuery + " content in the system.");
        }else{
            System.out.println("This content is not available in the system.");
        }
    }
}
