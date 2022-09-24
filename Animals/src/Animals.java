
public abstract class Animals {
    private String kindName;
    private String weight;
    private String age;

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    void getDosage() {
        System.out.println("give 5mg c vitamin for " + getKindName());
    }

    void getFeedSchedule() {
        System.out.println("2 times food a day for " + getKindName());
    }
}

class Horses extends Animals {
    Horses(String kindName, String weight, String age) {
        setKindName(kindName);
        setWeight(weight);
        setAge(age);
    }

    @Override
    void getFeedSchedule() {
        System.out.println("3 times food a day for " + getKindName());
    }
}

class Felines extends Animals {
    Felines(String kindName, String weight, String age) {
        setKindName(kindName);
        setWeight(weight);
        setAge(age);
    }

    @Override
    void getDosage() {
        System.out.println("give 2mg c vitamin for " + getKindName());
    }
}

class Rodents extends Animals {
    Rodents(String kindName, String weight, String age) {
        setKindName(kindName);
        setWeight(weight);
        setAge(age);
    }

    @Override
    void getDosage() {
        System.out.println("give 7mg c vitamin for " + getKindName());
    }
}

class Main {
    public static void main(String[] args) {
        Horses animal1 = new Horses("Zebra", "280kg", "12");
        Felines animal2 = new Felines("Cat", "12kg", "4");
        Rodents animal3 = new Rodents("Rat", "2kg", "2");
        animal1.getDosage();
        animal1.getFeedSchedule();
        animal2.getDosage();
        animal2.getFeedSchedule();
        animal3.getDosage();
        animal3.getFeedSchedule();

    }
}
