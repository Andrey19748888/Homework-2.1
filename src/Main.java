public class Main {
    public static void main(String[] args) {

        Human human1 = new Human(null, "Минск", 1988,"бренд-менеджер");
        Human human2 = new Human("Аня", " Москва", 1993,"методист образовательных программ");
        Human human3 = new Human("Катя", "Калининград", 1992, "продакт-менеджер");
        Human human4 = new Human("Артем", "Москва", 1995, "директора по развитию бизнеса");
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);



    }
}