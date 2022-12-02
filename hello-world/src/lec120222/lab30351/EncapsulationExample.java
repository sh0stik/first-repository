package lec120222.lab30351;

public class EncapsulationExample {
    public static void main(String[] args) {
        HumanBeing humanBeing = new HumanBeing();
        // using setters of HumanBeing
        humanBeing.setHeight(1.65f);
        humanBeing.setWeight(68);
        humanBeing.setBmi(calculateBmi(humanBeing));

        // using getters of HumanBeing
        System.out.println("Person has " + humanBeing.getWeight() + " kgs and is " + humanBeing.getHeight()
                + " meters in height, which results in BMI of " + humanBeing.getBmi());
    }

    public static float calculateBmi(HumanBeing humanBeing) {
        return humanBeing.getWeight() / (humanBeing.getHeight() * humanBeing.getHeight());
    }
}

