package practice.strategy;

public class Movement {
    Strategy movement;

    public Movement(Strategy movement) {
        this.movement = movement;
    }

    public void executeMovement(){
        movement.execute();
    }
}
