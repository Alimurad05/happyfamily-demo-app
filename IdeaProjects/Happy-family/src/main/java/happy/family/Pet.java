package happy.family;

import java.util.Arrays;

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int tricklevel;
    private String[] habits;
    public Pet(Species species,String nickname){
        this.species=species;
        this.nickname=nickname;
    }

    public Pet(Species species,
               String nickname,
               int age, int tricklevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.tricklevel = tricklevel;
        this.habits = habits;
    }

    public void foul(){
        System.out.println("I need to cover it up");
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTricklevel() {
        return tricklevel;
    }

    public void setTricklevel(int tricklevel) {
        this.tricklevel = tricklevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    @Override
    public String toString(){
        return getSpecies()+"{nickname=" + nickname +
                       ", age=" + age+
                       ", trickLevel="+tricklevel+
                       ", habits="+Arrays.toString(habits)+
                       "}";
    }
}
