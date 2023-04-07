package 2_lesson.Task1;

public abstract class Actor implements ActorBehaviour {
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    String name;

    public abstract String getName();
}