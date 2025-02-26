import happy.family.Family;
import happy.family.Human;
import happy.family.Pet;
import happy.family.Species;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Human mother1 = new Human("Victoria", "Karleone", 1955);
        Human father1 = new Human("Vito", "Karleone", 1950);
        Human child1 = new Human("Ali", "Murad", 2005);
        Human child2 = new Human("Kamil", "Muradli", 2004);
        Pet pet1 = new Pet(Species.DOG, "Bob");
        Family family1 = new Family(mother1, father1, pet1);

        family1.addchild(child1);
        family1.addchild(child2);
        mother1.setFamily(family1);
        family1.setFamily(family1);
        //All checks:
        System.out.println("Before child deleting: " + mother1.getFamily());
        System.out.println("Children: " + Arrays.toString(family1.getChildren()));
        System.out.println(family1.countfamily(family1));
        family1.deletechild(0);
        System.out.println("After child deleting: " + mother1.getFamily());
        System.out.println("Children: " + Arrays.toString(family1.getChildren()));
        System.out.println(family1.countfamily(family1));

    }
}
