public class CObject
{
    protected int handle;
    public String getAttributeValue(String strAttribute)
    {
        return CObjectManager.getAttributeValue(handle, strAttribute);
    }
    public void setAttributeValue(String strAttribute, String value)
    {
        CObjectManager.setAttributeValue(handle, strAttribute, value);
    }
    public void createObject(String strObjectName)
    {
        handle = CObjectManager.createObject(strObjectName);
    }
    public String ExecuteMethod(String methodName, String params)
    {
        return CObjectManager.ExecuteMethod(handle, methodName, params);
    }
}