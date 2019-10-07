public class Robot implements Participant{

    private String name;
    private int maxDistance = 50;
    private double maxHeight = 0.5;
    private boolean isReady;

    //создаем конструктор
    public Robot(String name, int maxDistance, double maxHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        isReady = true;
    }

    @Override
    public boolean isReady(){
        return isReady;
    }

    @Override
    public void run (int distance) {
        if (!isReady){
            return;
        }
        if (maxDistance < distance) {
            isReady = false;
            System.out.println(this.name + " не пробежал " + distance + " метров");
        } else {
            System.out.println(this.name + " прбежал " + distance);
        }
    }

    @Override
    public void jump(double height) {
        if(!isReady){
            return;
        }
        if (maxHeight < height) {
            isReady = false;
            System.out.println(this.name + " не перепрыгнул " + height + " метров");
        } else {
            System.out.println(this.name + " перепрыгнул " + height + " метров");
        }
    }

}
