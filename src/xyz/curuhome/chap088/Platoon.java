package xyz.curuhome.chap088;

public class Platoon {
    private String name;
    public Platoon(){
        name="Platoon";
    }
    public Platoon(String name){
        this.name=name;
    }
    public String getPlatoonName(){
        return name;
    }
    public void showPlatoonName(){
        System.out.println("Debug @name : "+name);
    }
}
