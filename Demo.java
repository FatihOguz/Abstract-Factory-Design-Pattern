/**
 * show knowledge of objects.Objects are (Maximum effort , IflasDeluxe,I_I_Aman_Iflas) of (Turkey store,Eu store, Global store)
 */
public class Demo {
    /**
     * show knowledge of objects.Objects are (Maximum effort , IflasDeluxe,I_I_Aman_Iflas) of (Turkey store,Eu store, Global store)
     * @param args args
     */
    public static void main(String[] args){


        smartPhoneStore Turkey =  new TurkeySmartPhoneStore();
        smartPhoneStore Eu = new EuSmartPhoneStore();
        smartPhoneStore Global = new GlobalSmartPhoneStore();

        System.out.println("**********************************************************");
        smartPhone smartPhone1 = Turkey.orderSmartPhone("MaximumEffort");
        System.out.println("**********************************************************");
        smartPhone smartPhone2 = Turkey.orderSmartPhone("IflasDeluxe");
        System.out.println("**********************************************************");
        smartPhone smartPhone3 = Turkey.orderSmartPhone("I_I_Aman_Iflas");
        System.out.println("*********************************************************");
        smartPhone smartPhone4 = Eu.orderSmartPhone("MaximumEffort");
        System.out.println("**********************************************************");
        smartPhone smartPhone5 = Eu.orderSmartPhone("IflasDeluxe");
        System.out.println("**********************************************************");
        smartPhone smartPhone6 = Eu.orderSmartPhone("I_I_Aman_Iflas");
        System.out.println("**********************************************************");
        smartPhone smartPhone7 = Global.orderSmartPhone("MaximumEffort");
        System.out.println("**********************************************************");
        smartPhone smartPhone8 = Global.orderSmartPhone("IflasDeluxe");
        System.out.println("**********************************************************");
        smartPhone smartPhone9 = Global.orderSmartPhone("I_I_Aman_Iflas");
        System.out.println("**********************************************************");

    }

}
