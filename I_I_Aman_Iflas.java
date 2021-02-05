/**
 * this class extends smartPhone class
 * it prepare I I Aman Iflas smartphone
 */
public class I_I_Aman_Iflas extends smartPhone{
    /**
     * reference of smart phone ingredient factory
     */
    private smartPhoneIngredientFactory ingredientFactory;


    /**
     * constructor
     * initialize hashmap for   I I Aman Iflas  smartphone
     * and initialize ingredientFactory for territories
     * @param ingredientFactory is ingredient factories
     */
    public I_I_Aman_Iflas(smartPhoneIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
       this.getHashMap().put("display", "4.5 inches");
        this.getHashMap().put("battery", "16h, 2000mAh");
        this.getHashMap().put("cpuAndRam", "2.2GHz, 4GB");
        this.getHashMap().put("storage", "MicroSD support, 16GB");
        this.getHashMap().put("camera", "8Mp front 5Mp rear");
        this.getHashMap().put("case", "143x69x7.3 mm waterproof, plastic");
    }

    /**
     * prepare smart phone
     */
    @Override
    public void prepare() {
        System.out.println("preparing " + this.getModel());
        this.setDisplay(ingredientFactory.createDisplay());
        this.setBattery(ingredientFactory.createBattery());
        this.setCpuAndRam(ingredientFactory.createCpuAndRam());
        this.setStorage(ingredientFactory.createStorage());
        this.setCamera(ingredientFactory.createCamera());
        this.setCase(ingredientFactory.createCase());
    }
}
