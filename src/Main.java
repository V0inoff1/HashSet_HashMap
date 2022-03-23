import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Petya");
        list.add("Olya");
        list.add("Tanya");

        String name = list.get(1);// ВЫтаскиваем из списка
        list.set(1,"Kolya");

        MyMap<String, Userinfo> map = new MyMap<>();
        map.put("Petya", new Userinfo(8));//"Petya"- ключ, new Userinfo - значение
        map.put("Olya", new Userinfo(15));
        Userinfo info = map.get("Olya");
        System.out.println(info);

    }
}
