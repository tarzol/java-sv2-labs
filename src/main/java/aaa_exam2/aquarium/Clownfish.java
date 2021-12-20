package aaa_exam2.aquarium;

public class Clownfish extends Fish {

    private boolean memoryLoss;

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
        memoryLoss = false;
    }


    public int getWeight() {
        return super.getWeight();
    }


    @Override
    public boolean hasMemoryLoss() {
        return super.hasMemoryLoss();
    }

    /*public void setMemoryLoss(boolean memoryLoss) {
        this.memoryLoss = memoryLoss;
    }*/

    @Override
    public String getStatus() {
        //Nemo, weight: 5, color: orange-white, short-term memory loss: false
        return getName()+", weight: "+getWeight()+", color: "+getColor()+", short-term memory loss: "+hasMemoryLoss();
    }

    @Override
    public void feed() {
        setWeight(getWeight()+1);
    }
}
