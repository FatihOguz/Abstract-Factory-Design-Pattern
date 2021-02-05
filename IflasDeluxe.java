/**
 * this class extends smartPhone class
 * it prepare  Iflas Deluxe smartphone
 */
public class IflasDeluxe extends smartPhone{

    /**
     * reference of smart phone ingredient factory
     */
    private smartPhoneIngredientFactory ingredientFactory;
    /**
     * constructor
     * initialize hashmap for   Iflas Deluxe   smartphone
     * and initialize ingredient Factory for territories
     * @param ingredientFactory is ingredient factories
     */
    public IflasDeluxe(smartPhoneIngredientFactory ingredientFactory){
        this.ingredientFactory=ingredientFactory;


        this.getHashMap().put("display", "5.3 inches");
        this.getHashMap().put("battery", "20h, 2800mAh");
        this.getHashMap().put("cpuAndRam", "2.2GHz, 6GB");
        this.getHashMap().put("storage", "MicroSD support, 32GB");
        this.getHashMap().put("camera", "12Mp front, 5Mp rear");
        this.getHashMap().put("case", "149x73x7.7 mm waterproof, aluminum");
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
