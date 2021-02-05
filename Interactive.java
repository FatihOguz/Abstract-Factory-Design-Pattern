import java.util.Scanner;

/**
 * allows the user to access the information they want from 9 different phones
 */
public class Interactive {
    /**
     *allows the user to access the information they want from 9 different phones
     * @param args args
     */
    public static void main(String[] args){

        /**
         * for give command by user
         */
        Scanner scanner = new Scanner(System.in);
        /**
         * TurkeySmartPhoneStore
         */
        smartPhoneStore Turkey =  new TurkeySmartPhoneStore();
        /**
         * EuSmartPhoneStore
         */
        smartPhoneStore Eu = new EuSmartPhoneStore();
        /**
         * GlobalSmartPhoneStore
         */
        smartPhoneStore Global = new GlobalSmartPhoneStore();
        /**
         * command
         */
        int command=1;

        while(command!=0){

            System.out.println("1-->maximum effort turkey");
            System.out.println("2-->iflas deluxe turkey");
            System.out.println("3-->i i aman iflas turkey");
            System.out.println("4-->maximum effort eu");
            System.out.println("5-->iflas deluxe eu");
            System.out.println("6-->i i aman iflas eu");
            System.out.println("7-->maximum effort global");
            System.out.println("8-->iflas deluxe global");
            System.out.println("9-->i i aman iflas global");
            System.out.println("0--> Exit");
            System.out.println("give me command");
            command = scanner.nextInt();
            if(command==1){
                smartPhone smartPhone1 = Turkey.orderSmartPhone("MaximumEffort");
                System.out.println("**********************************************************");
            }
            else if(command==2){
                smartPhone smartPhone2 = Turkey.orderSmartPhone("IflasDeluxe");
                System.out.println("**********************************************************");
            }

            else if(command==3){
                smartPhone smartPhone3 = Turkey.orderSmartPhone("I_I_Aman_Iflas");
                System.out.println("*********************************************************");
            }

            else if(command==4){
                smartPhone smartPhone4 = Eu.orderSmartPhone("MaximumEffort");
                System.out.println("**********************************************************");
            }

            else if(command==5){
                smartPhone smartPhone5 = Eu.orderSmartPhone("IflasDeluxe");
                System.out.println("**********************************************************");
            }

            else if(command==6){
                smartPhone smartPhone6 = Eu.orderSmartPhone("I_I_Aman_Iflas");
                System.out.println("**********************************************************");
            }

            else if(command==7){
                smartPhone smartPhone7 = Global.orderSmartPhone("MaximumEffort");
                System.out.println("**********************************************************");
            }

            else if(command==8){

                smartPhone smartPhone8 = Global.orderSmartPhone("IflasDeluxe");
                System.out.println("**********************************************************");
            }

            else if(command==9){

                smartPhone smartPhone9 = Global.orderSmartPhone("I_I_Aman_Iflas");
                System.out.println("**********************************************************");
            }
        }

    }
}
