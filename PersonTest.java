import java.util.ArrayList;

/**
 * @program: homework_assignment_5
 * @filename: PersonTest.java
 * @author: Ke Chen
 * @date: 2020/10/10
 **/
public class PersonTest {
    static void sort(ArrayList<Person> myLst, Boolean ascending, String attr) {
        int i, j, n = myLst.size();
        for (i = 0; i < n; i++) {
            for (j = 1; j < n - i; j++) {
                if (ascending) {
                    if (attr.equals("age") && myLst.get(j - 1).getAge() > myLst.get(j).getAge()) {
                        Person temp = myLst.get(j - 1);
                        myLst.set(j - 1, myLst.get(j));
                        myLst.set(j, temp);
                    }
                    if (attr.equals("firstname") && myLst.get(j - 1).getFirstName().compareTo(myLst.get(j).getFirstName()) > 0) {
                        Person temp = myLst.get(j - 1);
                        myLst.set(j - 1, myLst.get(j));
                        myLst.set(j, temp);
                    }
                    if (attr.equals("lastnameLength") && myLst.get(j - 1).getLastName().length() > myLst.get(j).getLastName().length()) {
                        Person temp = myLst.get(j - 1);
                        myLst.set(j - 1, myLst.get(j));
                        myLst.set(j, temp);
                    }
                } else {
                    if (attr.equals("age") && myLst.get(j - 1).getAge() < myLst.get(j).getAge()) {
                        Person temp = myLst.get(j - 1);
                        myLst.set(j - 1, myLst.get(j));
                        myLst.set(j, temp);
                    }
                    if (attr.equals("firstname") && myLst.get(j - 1).getFirstName().compareTo(myLst.get(j).getFirstName()) < 0) {
                        Person temp = myLst.get(j - 1);
                        myLst.set(j - 1, myLst.get(j));
                        myLst.set(j, temp);
                    }
                    if (attr.equals("lastnameLength") && myLst.get(j - 1).getLastName().length() < myLst.get(j).getLastName().length()) {
                        Person temp = myLst.get(j - 1);
                        myLst.set(j - 1, myLst.get(j));
                        myLst.set(j, temp);
                    }
                }
            }
        }
        for(Person p: myLst){
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<Person>();
        Person person1 = new Person("Joe", "Simth", 40);
        Person person2 = new Person("Amy", "Gold", 32);
        Person person3 = new Person("Tony", "Stork", 21);
        Person person4 = new Person("Sean", "Irish", 24);
        Person person5 = new Person("Tina", "Brock", 28);
        Person person6 = new Person("Lenny", "Hep", 18);
        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);
        arrayList.add(person4);
        arrayList.add(person5);
        arrayList.add(person6);
        System.out.println("Sort your list of persons based on their age ascending:");
        sort(arrayList, true, "age");
        System.out.println("Sort your list of persons based on their age descending:");
        sort(arrayList, false, "age");

        System.out.println("Sort your list of persons based on their firstname ascending:");
        sort(arrayList, true, "firstname");
        System.out.println("Sort your list of persons based on their firstname descending:");
        sort(arrayList, false, "firstname");

        System.out.println("Sort your list of persons based on their lastname Length ascending:");
        sort(arrayList, true, "lastnameLength");
        System.out.println("Sort your list of persons based on their lastname Length descending:");
        sort(arrayList, false, "lastnameLength");


    }
}
