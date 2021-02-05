/**
 * The class that produces parts of smartphones to be produced in the European market
 * this class extends smartPhoneIngredientFactory
 */
public class EuSmartPhoneIngredientFactory implements smartPhoneIngredientFactory{
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
      * @return IonBattery class
     */
    @Override
    public Battery createBattery() {
        return new IonBattery();
    }

    /**
     * create Cpu and Ram
     * @return Cores4 class
     */
    @Override
    public CpuAndRam createCpuAndRam() {
        return new Cores4();
    }

    /**
     * create storage
     * @return GB64 class
     */
    @Override
    public Storage createStorage() {
        return new GB64();
    }

    /**
     * create Camera
     * @return zoom3 class
     */
    @Override
    public Camera createCamera() {
        return new zoom3();
    }

    /**
     * create case
     * @return WaterProof1m  class
     */
    @Override
    public Case createCase() {
        return new WaterProof1m();
    }
}
