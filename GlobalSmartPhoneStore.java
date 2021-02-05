/**
 * smart phone store in Global
 * this class extends smartPhoneStore class
 */
public class GlobalSmartPhoneStore  extends smartPhoneStore{
    /**
     * this method  factory method
     * create smart phone
     * @param type string (type of smartPhone)
     * @return smartPhone
     */
    @Override
    protected smartPhone createPhone(String type) {
        smartPhoneIngredientFactory smartPhoneIngredientFactory=
                new GlobalSmartPhoneIngredientFactory();
        if(type.equals("MaximumEffort")){
            this.setSmartPhone(new MaximumEffort(smartPhoneIngredientFactory));
            this.getSmartPhone().setModel("Global Maximum Effort");

        }
        else if(type.equals("I_I_Aman_Iflas")){
            this.setSmartPhone(new I_I_Aman_Iflas(smartPhoneIngredientFactory));
            this.getSmartPhone().setModel("Global I I Aman Iflas");
        }
        else if(type.equals("IflasDeluxe")){
            this.setSmartPhone(new IflasDeluxe(smartPhoneIngredientFactory));
           this.getSmartPhone().setModel("Global Iflas Deluxe");
        }
        return this.getSmartPhone();
    }
}
