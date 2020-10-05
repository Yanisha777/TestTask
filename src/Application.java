import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Yanika on 02.10.2020.
 */
public class Application {
    public static void main(String[] args) {

        List<User> userList = new ArrayList<>(5);
        userList.add(new User("Ivan", "Petrov", 25, "ivan_p@gmail.com", Status.ACTIVE, new Date()));
        userList.add(new User("Alla", "Zubr", 15, "zubral@gmail.com", Status.NEW, new Date(1601586000000L)));
        userList.add(new User("Nik", "Zotov", 23, "dinky12@gmail.com", Status.ACTIVE, new Date()));
        userList.add(new User("Dan", "Balan", 32, "vlast@gmail.com", Status.ACTIVE, new Date()));
        userList.add(new User("Lena", "Kvadr", 45, "kvadrl@gmail.com", Status.NEW, new Date(1601586000000L)));
        userList.add(new User("Alya ", "Bodnar", 53, "bodnaral@gmail.com", Status.ACTIVE, new Date()));

        task(userList);

        for (int i = 0; i < userList.size(); i++){
            System.out.println(userList.get(i).toString());
        }

    }

    public static void task(List<User> list){
        int today = dateToDays (new Date());

        for (int i = 0; i < list.size(); i++){
            if(dateToDays(list.get(i).getTimestamp()) < today+1) {
                if (list.get(i).getStatus() == Status.NEW) {
                    list.get(i).setStatus(Status.ACTIVE);
                }
            }
        }
    }

    public static int dateToDays(Date date){
        return (int) date.getTime() / (24*60*60*1000);
    }
}
