/**
 * The class that produces parts of smartphones to be produced in the Global market
 * this class extends smartPhoneIngredientFactory
 */


public class GlobalSmartPhoneIngredientFactory implements smartPhoneIngredientFactory{
    /**
     * create Display
     * @return Display24Bit class
     */
    @Override
    public Display createDisplay() {
        return new Display24Bit();
    }
    /**
     * create battery
     * @return CobaltBattery class
     */
    @Override
    public Battery createBattery() {
        return new CobaltBattery();
    }
    /**
     * create Cpu and Ram
     * @return Cores2 class
     */
    @Override
    public CpuAndRam createCpuAndRam() {
        return new Cores2();
    }
    /**
     * create storage
     * @return GB32 class
     */
    @Override
    public Storage createStorage() {
        return new GB32();
    }
    /**
     * create Camera
     * @return zoom2 class
     */
    @Override
    public Camera createCamera() {
        return new zoom2();
    }
    /**
     * create case
     * @return WaterProof50cm  class
     */
    @Override
    public Case createCase() {
        return new WaterProof50cm();
    }
}
