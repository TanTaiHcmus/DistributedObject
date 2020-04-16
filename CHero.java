
public class CHero extends CObject {

    public CHero()
    {
        createObject("Hero");
    }
    public int getID()
    {
        return Integer.valueOf(getAttributeValue("ID"));
    }
    public void setID(int value)
    {
        setAttributeValue("ID", String.valueOf(value));
    }
    public String getName()
    {
        return getAttributeValue("name");
    }
    public void setName(String value)
    {
        setAttributeValue("name", value);
    }
    public int getHP()
    {
        return Integer.valueOf(getAttributeValue("HP"));
    }
    public void setHP(int value)
    {
        setAttributeValue("HP", String.valueOf(value));
    }
    public int getAttack()
    {
        return Integer.valueOf(getAttributeValue("attack"));
    }
    public void setAttack(int value)
    {
        setAttributeValue("attack", String.valueOf(value));
    }
    public String getInformationHero()
    {
        return ExecuteMethod("getInformationHero", "");
    }
}