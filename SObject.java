
public class SObject {
    protected int handle;

    public void createObject()
    {
        handle = SObjectManager.createNewObject(this);
    }

	public int getHandle() {
		return handle;
	}

	public String getAttributeValue(String strAttribute) {
		return null;
	}

	public boolean setAttributeValue(String strAttribute, String value) {
        return false;
	}

	public String ExecuteMethod(String methodName, String params) {
		return null;
	}

}