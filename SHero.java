

public class SHero extends SObject{
    private int ID;
    private String name;
    private int HP;
    private int attack;
    private final static InFormationHero inf = new InFormationHero();
    public SHero()
    {
        createObject();
    }
    @Override
    public String getAttributeValue(String strAttribute) {
        switch(strAttribute)
        {
            case "ID":
                return String.valueOf(ID);
            case "name":
                return name;
            case "HP":
                return String.valueOf(HP);
            case "attack":
                return String.valueOf(attack);
        }
        return "N/A";
    }
    @Override
    public boolean setAttributeValue(String strAttribute, String value) {
        switch (strAttribute)
        {
            case "ID":
                ID = Integer.valueOf(value);
                return true;
            case "name":
                name = value;
                return true;
            case "HP":
                HP = Integer.valueOf(value);
                return true;
            case "attack":
                attack = Integer.valueOf(value);
                return true;
        }
        return false;
    }
    @Override
    public String ExecuteMethod(String methodName, String params) {
        switch(methodName)
        {
            case "getInformationHero":
                return getInformationHero(); 
        }
        return "N/A";
    }

    private String getInformationHero() {
        return InFormationHero.getInformationHero(name);
    }
}