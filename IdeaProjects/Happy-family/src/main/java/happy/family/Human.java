package happy.family;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int yearofbirth;
    private Family family;
    private String schedule[][];

    public Human(String name, String surname, int yearofbirth) {
        this.name = name;
        this.surname = surname;
        this.yearofbirth = yearofbirth;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(int yearofbirth) {
        this.yearofbirth = yearofbirth;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
    public void greetPet(Pet pet){
        System.out.println("Hello" + pet.getNickname());
    }
    public void descripePet(Pet pet){
        String result=(pet.getTricklevel()>50)?"very sly" : "almost not sly";
        System.out.printf("I have an %s dog,it is %d age,he is %s.%n"+pet.getSpecies(),
                pet.getAge(),result);
    }

    public String schedulestring(){
        return Arrays.deepToString(schedule);
    }
    @Override
    public String toString() {
        return  "{name=" + name +
               ", surname=" + surname +
               ", birth year=" + yearofbirth +
               ", schedule="+ schedulestring();
    }
}
