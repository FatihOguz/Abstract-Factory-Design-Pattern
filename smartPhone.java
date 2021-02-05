import java.util.HashMap;

/**
 * abstract class
 * hold on properties of smart phone
 * ann implements attach method
 * has a abstract method(prepare method) for different type and different territories  smartphones
 */
public abstract class smartPhone {
    /**
     * hold on model of smart phone
     */
    private String Model;
    /**
     *  hold on cpu and ram smart phone
     */
    private CpuAndRam CpuAndRam;
    /**
     *     hold on display smart phone
     */
    private Display Display;
    /**
     *     hold on battery smart phone
     */
    private Battery Battery;
    /**
     *     hold on storage smart phone
     */
    private Storage Storage;
    /**
     *     hold on camera smart phone
     */
    private Camera Camera;
    /**
     *     hold on case smart phone
     */
    private Case Case;
    /**
     *     hold on knowledge of different type smart phone(maximum effort,ıflas deluxe,etc)
     */
    private HashMap hashMap = new HashMap();

    /**
     * abstract method
     * for different type and different territories  smartphones
     */
    public abstract void prepare();

    /**
     * attach cpu and ram
     */
    void attachCpuAndRam(){
        System.out.println("attach " + this.CpuAndRam + " and " + hashMap.get("cpuAndRam"));
    }

    /**
     * attach display
     */
    void attachDisplay(){
        System.out.println("attach " + this.Display+ " and " + hashMap.get("display"));
    }

    /**
     * attach battery
     */
    void attachBattery(){
        System.out.println("attach " +this.Battery+   " and " + hashMap.get("battery"));
    }

    /**
     * attach storage
     */
    void attachStorage(){
        System.out.println("attach " + this.Storage + " and " + hashMap.get("storage"));
    }

    /**
     * attach camera
     */
    void attachCamera(){
        System.out.println("attach " + this.Camera+ " and " + hashMap.get("camera"));
    }

    /**
     * enclose case
     */
    void encloseCase(){
        System.out.println("attach " + this.Case + " and " + hashMap.get("case"));
    }

    /**
     * get model
     * @return model of smart phone
     */
    public String getModel() {
        return Model;
    }

    /**
     * update model
     * @param model of smart phone
     */
    public void setModel(String model) {
        Model = model;
    }

    /**
     * get cpu and ram
     * @return CpuAndRam class
     */
    public CpuAndRam getCpuAndRam() {
        return CpuAndRam;
    }

    /**
     * update cpu and ram
     * @param cpuAndRam CpuAndRam class
     */
    public void setCpuAndRam(CpuAndRam cpuAndRam) {
        CpuAndRam = cpuAndRam;
    }

    /**
     * get display
     * @return Display class
     */
    public Display getDisplay() {
        return Display;
    }

    /**
     * update display
     * @param display Display class
     */
    public void setDisplay(Display display) {
        Display = display;
    }

    /**
     * get Battery
     * @return Battery class
     */
    public Battery getBattery() {
        return Battery;
    }

    /**
     * update Battery
     * @param battery Battery class
     */
    public void setBattery(Battery battery) {
        Battery = battery;
    }

    /**
     * get Storage
     * @return Storage class
     */
    public Storage getStorage() {
        return Storage;
    }

    /**
     * update storage
     * @param storage Storage class
     */
    public void setStorage(Storage storage) {
        Storage = storage;
    }

    /**
     * get Camera
     * @return Camera Class
     */
    public Camera getCamera() {
        return Camera;
    }

    /**
     * update camera
     * @param camera is Camera class
     */
    public void setCamera(Camera camera) {
        Camera = camera;
    }

    /**
     * get case
     * @return Case class
     */
    public Case getCase() {
        return Case;
    }

    /**
     * update case
     * @param aCase is Case class
     */
    public void setCase(Case aCase) {
        Case = aCase;
    }

    /**
     * get hash map .
     * it uses for features of models
     * @return hashMap
     */
    public HashMap getHashMap() {
        return hashMap;
    }

    /**
     * update hashMap
     * it uses features of models
     * @param hashMap hashMap class
     */
    public void setHashMap(HashMap hashMap) {
        this.hashMap = hashMap;
    }
}
