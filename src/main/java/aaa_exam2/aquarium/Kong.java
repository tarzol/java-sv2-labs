package aaa_exam2.aquarium;

public class Kong extends Fish {

    private boolean memoryLoss;

    public Kong(String name, int weight, String color) {
        super(name, weight, color);
        this.memoryLoss = false;
    }

    public boolean hasMemoryLoss() {
        return memoryLoss;
    }

    public void setMemoryLoss(boolean memoryLoss) {
        this.memoryLoss = memoryLoss;
    }

    @Override
    public String getStatus() {
        return getName()+", weight: "+getWeight()+", color: "+getColor()+", short-term memory loss: "+hasMemoryLoss();
    }

    @Override
    public void feed() {
        setWeight(getWeight()+2);
    }
}
