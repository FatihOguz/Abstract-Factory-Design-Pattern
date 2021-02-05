/**
 * smart phone store in Turkey
 * this class extends smartPhoneStore class
 */
public class TurkeySmartPhoneStore extends smartPhoneStore {

    /**
     * this method  factory method
     * create smart phone
     * @param type string (type of smartPhone)
     * @return smartPhone
     */

    @Override
    protected smartPhone createPhone(String type) {
        smartPhoneIngredientFactory smartPhoneIngredientFactory=
                new TurkeySmartPhoneIngredientFactory();
        if(type.equals("MaximumEffort")){
            this.setSmartPhone(new MaximumEffort(smartPhoneIngredientFactory));
           this.getSmartPhone().setModel("Turkey Maximum Effort");

        }
        else if(type.equals("I_I_Aman_Iflas")){
            this.setSmartPhone(new I_I_Aman_Iflas(smartPhoneIngredientFactory));
            this.getSmartPhone().setModel("Turkey I I Aman Iflas");
        }
        else if(type.equals("IflasDeluxe")){
            this.setSmartPhone( new IflasDeluxe(smartPhoneIngredientFactory));
            this.getSmartPhone().setModel("Turkey Iflas Deluxe");
        }
        return this.getSmartPhone();
    }
}
