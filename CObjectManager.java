public class CObjectManager
{
    public static String getAttributeValue(int handle, String strAttribute)
    {
        return SObjectManager.getAttributeValue(handle, strAttribute);
    }
	public static boolean setAttributeValue(int handle, String strAttribute, String value) {
		return SObjectManager.setAttributeValue(handle, strAttribute, value);
	}
	public static int createObject(String strObjectName) {
		return SObjectManager.createObject(strObjectName);
	}
	public static String ExecuteMethod(int handle, String methodName, String params) {
		return SObjectManager.ExecuteMethod(handle, methodName, params);
	}
}