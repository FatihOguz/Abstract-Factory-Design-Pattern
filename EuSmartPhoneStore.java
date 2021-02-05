/**
 * smart phone store in European
 * this class extends smartPhoneStore class
 */
public class EuSmartPhoneStore extends smartPhoneStore {
    /**
     * this method  factory method
     * create smart phone
     * @param type string (type of smartPhone)
     * @return smartPhone
     */
    @Override
    protected smartPhone createPhone(String type) {
        smartPhoneIngredientFactory smartPhoneIngredientFactory=
                new EuSmartPhoneIngredientFactory();
        if(type.equals("MaximumEffort")){
            this.setSmartPhone(new MaximumEffort(smartPhoneIngredientFactory));
            this.getSmartPhone().setModel("EU Maximum Effort");

        }
        else if(type.equals("I_I_Aman_Iflas")){
            this.setSmartPhone(new I_I_Aman_Iflas(smartPhoneIngredientFactory));
            this.getSmartPhone().setModel("EU I I Aman Iflas");
        }
        else if(type.equals("IflasDeluxe")){
            this.setSmartPhone(new IflasDeluxe(smartPhoneIngredientFactory));
            this.getSmartPhone().setModel("EU Iflas Deluxe");
        }
        return  this.getSmartPhone();
    }
}
