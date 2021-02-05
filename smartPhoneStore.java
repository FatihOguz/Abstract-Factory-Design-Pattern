/**
 * this class abstract class for territories smart phone
 */
public abstract class smartPhoneStore {
    /**
     * reference of smart phone
     */
    private smartPhone smartPhone;

    /**
     * get smart phone
     * @return smartPhone class
     */
    public smartPhone getSmartPhone() {
        return smartPhone;
    }

    /**
     * update smart phone
     * @param smartPhone smartPhone class
     */
    public void setSmartPhone(smartPhone smartPhone) {
        this.smartPhone = smartPhone;
    }

    /**
     * order smart phone
     * create smart phone and prepare
     * then attach properties of smart phone
     * @param type model of smartphone
     * @return smart phone
     */
    public smartPhone orderSmartPhone(String type){

        smartPhone = createPhone(type);
        smartPhone.prepare();
        smartPhone.attachDisplay();
        smartPhone.attachBattery();
        smartPhone.attachCpuAndRam();
        smartPhone.attachStorage();
        smartPhone.attachCamera();
        smartPhone.encloseCase();
        return smartPhone;
    }

    /**
     * abstract method
     * every territories store implement this method with own style
     * @param type name of model
     * @return smartPhone class
     */
    protected abstract smartPhone createPhone(String type);

}
