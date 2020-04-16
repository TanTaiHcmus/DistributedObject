
public class DistributeObject {
    public static void main(String[] args) {
        CHero yasuo = new CHero();
        yasuo.setID(1);
        yasuo.setName("Yasuo");
        yasuo.setHP(650);
        yasuo.setAttack(80);
        System.out.println(yasuo.getID() + " " + yasuo.getName() + " " + yasuo.getInformationHero() 
            + " " + yasuo.getHP() + " " + yasuo.getAttack());
        CHero zed = new CHero();
        zed.setID(2);
        zed.setName("Zed");
        zed.setHP(670);
        zed.setAttack(75);
        System.out.println(zed.getID() + " " + zed.getName() + " " + zed.getInformationHero() 
        + " " + zed.getHP() + " " + zed.getAttack());
    }

}