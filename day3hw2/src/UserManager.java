public class UserManager {
    public void add(User user){
        System.out.println("kullanici eklendi!"+user.getFirstName()+user.getLastName());

    }
    public void delete(User user){
        System.out.println("kullanici silindi!"+user.getFirstName()+user.getLastName());

    }
}
