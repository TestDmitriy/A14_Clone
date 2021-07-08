package hw14dk;

public class Objectsd {
    public String objName;
    private Object obj;


    @Override
    public String toString() {
        return " Objects: !NAME = " + objName + " !OBJECT: = " + obj;
    }

    public Objectsd(String objName, Object obj) {
        this.objName = objName;
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }
}
