package xyz.curuhome.chap098;

public class Ant {
    private String name = "Ant";
    String getName(){
        return name;
    }
    public String toString(){
        return "이름  : "+name;
    }
    public void print(){
        System.out.println(name+"은 동굴에 산다.");
    }
}
