import java.util.HashMap;
import java.util.Map;

public class SObjectManager {

    private static Map<Integer, SObject> myMap = new HashMap<>();
    private static int nextHandle = 0;

	public static String getAttributeValue(int handle, String strAttribute) {
        if (myMap.containsKey(handle)) 
        {
            SObject object = myMap.get(handle);
            return object.getAttributeValue(strAttribute);
        }
        return "N/A";
	}

	public static boolean setAttributeValue(int handle, String strAttribute, String value) {
        if (myMap.containsKey(handle))
        {
            SObject object = myMap.get(handle);
            return object.setAttributeValue(strAttribute, value);
        }
        return false;
	}

	public static int createObject(String strObjectName) {

        SObject object = null;
        switch(strObjectName)
        {
            case "Hero":
                object = new SHero();
                break;
        }
        if (object != null)
            return object.getHandle();
        return 0;
	}

	public static int createNewObject(SObject sObject) {
        int handle = nextHandle++;
        myMap.put(handle, sObject);
        return handle;
	}

	public static String ExecuteMethod(int handle, String methodName, String params) {
        SObject sObject = null;
        if (myMap.containsKey(handle))
        {
            sObject = myMap.get(handle);
            return sObject.ExecuteMethod(methodName, params);
        }
        return "N/A";
	}

}