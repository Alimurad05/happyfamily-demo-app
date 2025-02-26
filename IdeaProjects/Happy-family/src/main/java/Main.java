import happy.family.Family;
import happy.family.Human;
import happy.family.Pet;

public class Main {
    public static void main(String[] args) {

        Human mother1 = new Human("Victoria", "Karleone", 1955);
        Human father1 = new Human("Vito", "Karleone", 1950);
        Human child1=new Human("Ali","Murad",2005);
        Pet pet1=new Pet("Golden","Bob");
        Family family1=new Family(mother1,father1,pet1);
        family1.addchild(child1);
        System.out.println(child1.getFamily());

    }
}
