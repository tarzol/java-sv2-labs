package aaa_exam2.aquarium;

public class Tang extends Fish {

    private boolean memoryLoss;

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        this.memoryLoss = true;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }


    /*public void setMemoryLoss(boolean memoryLoss) {
        this.memoryLoss = memoryLoss;
    }*/

    @Override
    public String getStatus() {
        return getName()+", weight: "+getWeight()+", color: "+getColor()+", short-term memory loss: "+hasMemoryLoss();
    }

    @Override
    public void feed() {
        setWeight(getWeight()+1);
    }
}
