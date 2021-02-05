/**
 * this class extends smartPhone class
 * it prepare  Maximum Effort smartphone
 */
public class MaximumEffort extends smartPhone {
    /**
     * reference of smart phone ingredient factory
     */
   private smartPhoneIngredientFactory ingredientFactory;
    /**
     * constructor
     * initialize hashmap for   Maximum Efffort  smartphone
     * and initialize ingredient Factory for territories
     * @param ingredientFactory is ingredient factories
     */
   public MaximumEffort(smartPhoneIngredientFactory ingredientFactory){
       this.ingredientFactory=ingredientFactory;
       this.getHashMap().put("display","5.5 inches");
       this.getHashMap().put("battery","27h, 3600mAh" );
       this.getHashMap().put("cpuAndRam","2.8GHz, 8GB");
       this.getHashMap().put("storage","MicroSD support, 64GB");
       this.getHashMap().put("camera","12Mp front, 8Mp rear");
       this.getHashMap().put("case","151x73x7.7 mm dustproof, waterproof, aluminum");

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
