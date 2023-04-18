package 4_lesson;

public class Animal<T extends BasicAnimal> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public T getInfoAboutAnimal() {
        return animal;
    }
}