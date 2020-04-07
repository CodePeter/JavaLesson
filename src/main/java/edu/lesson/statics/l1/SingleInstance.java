package edu.lesson.statics.l1;

/**
 * 简单的单例模式
 */
public class SingleInstance {
    private static final SingleInstance single = new SingleInstance();
    public static final SingleInstance getSingleInstance() {
        return single;
    }

    private String name = "defaultName";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        SingleInstance instance = SingleInstance.getSingleInstance();
        System.out.println(instance.getName());
        instance.setName("new name");
        System.out.println(instance.getName());
    }
}
