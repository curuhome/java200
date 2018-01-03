package xyz.curuhome.chap088;

public class WarMain {
    public static void main(String[] args) {
        Platoon platoon  = new Platoon("Cobra");

        Squad firstsquad = new Squad();                        // (name:null -> <name:Mohican>)
        firstsquad.setPlatoonName(platoon.getPlatoonName());   // <name:Mohican>, (pname:Cobra->platoonName:Cobra)

        Squad secondsquad=new Squad("Stinger");         // (name:null -> <name:Stringer>)
        secondsquad.setPlatoonName(platoon.getPlatoonName());  // name:Cobra, (pname:Cobra->platoonName:Cobra)

        Squad thirdsquad=new Squad(platoon);                   // (name:null, platoonName:Cobra)
        thirdsquad.setSquadName("Abangardo");                  // name:null, (sname:Abangardo-><name:Abangardo>)

        Squad fourthsquad=new Squad(platoon,"Tiger");  // platoonName:Cobra, <name:Tiger>

        platoon.showPlatoonName();
        /* Debug @name : Cobra */

        firstsquad.showSquad();
        /* Debug @platoonName : Cobra, @name : Mohican */

        secondsquad.showSquad();
        /* Debug @platoonName : Cobra, @name : Stinger */

        thirdsquad.showSquad();
        /* Debug @platoonName : Cobra, @name : Abangardo */

        fourthsquad.showSquad();
        /* Debug @platoonName : Cobra, @name : Tiger */
    }
}
