public class TotalNumberOfUsers {

    public void returnAllInformationAboutUsers(){

        System.out.println("All users and ids: " + ExtraForRegisterNewUser.dictionaryForUser);

        int totalNumberOfUser = 0;
        for(long ignored : ExtraForRegisterNewUser.idList){
            ++totalNumberOfUser;
        }
        System.out.println("There are " + totalNumberOfUser + " users in total in the system.");
    }
}
