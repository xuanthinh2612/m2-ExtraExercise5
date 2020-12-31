import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PopulationManager {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Family> populationManager = new ArrayList<>();
        List<Family> mungTho = new ArrayList<>();
        System.out.print("Nhap vao so ho gia dinh trong pho: ");
        int number = scanner.nextInt();
        int i = 0;
        while (i < number) {
            Family family = new Family();
            family.add();
            populationManager.add(family);
            i++;
        }
        System.out.println("Menu");
        System.out.println("1.Nhap vao thong tin ho gia dinh");
        System.out.println("2.Xem mung tho");
        System.out.println("0.Exit");
        int choice = scanner.nextInt();
        while (true){
            switch (choice){
                case 1:
                    Family family = new Family();
                    family.add();
                    populationManager.add(family);
                    break;
                case 2:
                    for (Family f: populationManager){
                        for (Person p : f.peopleList){
                            if (p.getAge()>=80){
                                System.out.println("so nha mung tho nam nay: "+ f.getHouseNumber());                            }
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.println("Menu");
            System.out.println("1.Nhap vao thong tin ho gia dinh");
            System.out.println("2.Xem mung tho");
            System.out.println("0.Exit");
             choice = scanner.nextInt();


        }

    }
}
