package happy.family;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;
    private Family family;

    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
        this.children = new Human[0];
    }

    public Human getMother() {
        return mother;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    public void addchild(Human child) {
        if (children == null) {
            children = new Human[]{child};
        } else {
            Human[] newchildren = new Human[children.length + 1];
            for (int i = 0; i < children.length; i++) {
                newchildren[i] = children[i];
            }
            newchildren[children.length] = child;
            children = newchildren;

        }
        child.setFamily(this);

    }

    public boolean deletechild(int index) {
        if (children == null || children.length < 1 || index < 0 || index >= children.length ) {
            return false;
        }
        Human[] newchildren = new Human[children.length - 1];
        int newindex = 0;
        for (int i = 0; i < newchildren.length; i++) {
            if (i == index) {
                children[i].setFamily(null);
            }
            newchildren[newindex++]=children[i];
        }
        children = newchildren;
        return true;
    }

    public int countfamily(Family family) {
        return 2 + children.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family1 = (Family) o;
        return Objects.equals(mother, family1.mother) && Objects.equals(father, family1.father) && Objects.deepEquals(children, family1.children) && Objects.equals(pet, family1.pet) && Objects.equals(family, family1.family);
    }



    @Override
    public String toString() {
        return "Family{\n" +
               "mother=" + mother + "\n"+
               ", father=" + father + "\n" +
               ", children=" + Arrays.toString(children) + "\n" +
               ", pet=" + pet +"\n"+
               '}';
    }
}
