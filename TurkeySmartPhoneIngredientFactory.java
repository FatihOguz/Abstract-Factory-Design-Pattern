/**
 * The class that produces parts of smartphones to be produced in the Turkey market
 * this class extends smartPhoneIngredientFactory
 */
public class TurkeySmartPhoneIngredientFactory implements smartPhoneIngredientFactory {
    /**
     * create Display
     * @return Display32Bit class
     */
    @Override
    public Display createDisplay() {
        return new Display32Bit();
    }
    /**
     * create battery
     * @return BoronBattery class
     */
    @Override
    public Battery createBattery() {
        return new BoronBattery();
    }
    /**
     * create Cpu and Ram
     * @return Cores8 class
     */
    @Override
    public CpuAndRam createCpuAndRam() {
        return new Cores8();
    }
    /**
     * create storage
     * @return GB128 class
     */
    @Override
    public Storage createStorage() {
        return new GB128();
    }
    /**
     * create Camera
     * @return zoom4 class
     */
    @Override
    public Camera createCamera() {
        return new zoom4();
    }
    /**
     * create case
     * @return WaterProof2m  class
     */
    @Override
    public Case createCase() {
        return new WaterProof2m();
    }
}
