package implement;
interface d_payment{
    void pay();}
class upi implements d_payment{
    @Override
    public void pay(){
        System.out.print("payment done by UPI");

}
}
class credit_card implements d_payment{
   @Override
   public void pay(){
    System.err.println("payment is done by credit card");
   } }
 class Wallet implements d_payment{
    @Override
    public void pay(){
        System.out.print("cash payment done");
    }
}
    public class digital_payment{
        public static void main(String[] args) {
            d_payment UPI =new upi();
            d_payment c_card =new credit_card();
            d_payment wallet =new Wallet ();
            UPI.pay();
            c_card.pay();
            wallet.pay();
        }
    }