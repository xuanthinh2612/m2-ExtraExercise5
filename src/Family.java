import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Family {
    Scanner scanner = new Scanner(System.in);
    private int peopleInFamily;
    private String houseNumber = "";

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    List<Person> peopleList = new ArrayList<>();

    public Family() {

    }

//    public Family(int peopleInFamily, String houseNumber) {
//        this.peopleInFamily = peopleInFamily;
//        this.houseNumber = houseNumber;
//    }

    public void add() {
        System.out.println("So nha");
        houseNumber = scanner.nextLine();
        int count = 0;
        System.out.println("Nhap vao so thanh vien trong gia dinh ");
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            peopleList.add(addNew());
            count++;
        }
        peopleInFamily = count;

    }

    public void showFamilyInfo() {
        for (Person person : peopleList) {
            System.out.println(person);
        }
    }

    public Person showByAge() {
        for (Person person : peopleList) {
            if (person.getAge() >= 80) {
                return person;
            }
        }
        return null;
    }

    public Person addNew() {
        System.out.println("Ho va ten");
        String name = scanner.nextLine();
        System.out.println("Nhap tuoi");
        int age = scanner.nextInt();
        System.out.println("Nghe nghiep");
        String job = scanner.nextLine();
        Person person = new Person(name, age, job);
        return person;
    }


}
