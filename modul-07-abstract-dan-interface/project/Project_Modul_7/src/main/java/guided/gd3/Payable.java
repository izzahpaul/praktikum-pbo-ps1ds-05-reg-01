package guided.gd3;

public interface Payable {
    double getPaymentAmount();
    
    default void printRecipt(){
        System.out.println("Struk Resmi - Total: RP " + getPaymentAmount());
    }
    
    static void logTransaction(String message){
        System.out.println("[AUDIT LOG] " + message);
    }
}
