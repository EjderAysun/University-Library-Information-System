import java.util.ArrayList;
import java.util.List;

public class TotalNumberOfContents {

    public void returnAllInformationAboutContents(){

        System.out.println("All contents set other than borrowed:   " + ExtraForAddContentToTheSystem.dictionaryForContent.keySet());

        int totalNumberOfContents = 0;
        for(String i: ExtraForAddContentToTheSystem.dictionaryForContent.keySet()){
            totalNumberOfContents += ExtraForAddContentToTheSystem.dictionaryForContent.get(i);
        }

        System.out.println("Except for borrowed content there are " + totalNumberOfContents + " content in total in the system.");
        System.out.println("Except for borrowed content there are " + ExtraForAddContentToTheSystem.dictionaryForContent.size() + " different content in total in the system.");

        System.out.println("All contents borrowed and to whom it was given:   " + LendContentToTheUser.dictionaryForContentLendingRecords);
        System.out.println(LendContentToTheUser.dictionaryForContentLendingRecords.size() + " content borrowed.");
        int count = (int) LendContentToTheUser.dictionaryForContentLendingRecords.values().stream().distinct().count();
        System.out.println(count + " different content borrowed.");

        System.out.println("There are " + (totalNumberOfContents + LendContentToTheUser.dictionaryForContentLendingRecords.size()) + " content in the system, along with the loaned content.");


        List<String> allContentsList = new ArrayList<>(ExtraForAddContentToTheSystem.dictionaryForContent.keySet().stream().toList());

        for(Long i: LendContentToTheUser.dictionaryForContentLendingRecords.keySet()){
            String temporary = LendContentToTheUser.dictionaryForContentLendingRecords.get(i);
            allContentsList.add(temporary);
        }

        List<String> uniqueList = allContentsList.stream().distinct().toList();

        int allDifferentContentsSize = uniqueList.size();

        System.out.println("There are " + allDifferentContentsSize + " different content in the system, along with the loaned content.");
    }
}
