/**
 * created properties of smartphone methods
 */
public interface smartPhoneIngredientFactory {
    /**
     * crate display
     * @return Display class
     */
    public Display createDisplay();

    /**
     * create bateery
     * @return Battery
     */
    public Battery createBattery();

    /**
     * create cpu and ram
     * @return CpuAndRam
     */
    public CpuAndRam createCpuAndRam();

    /**
     * create storage
     * @return Storage
     */
    public Storage createStorage();

    /**
     * create camera
     * @return Camera
     */

    public Camera createCamera();

    /**
     * create case
     * @return Case
     */
    public Case createCase();
}
