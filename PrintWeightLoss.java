public class PrintWeightloss extends Weightloss{
    public PrintWeightloss(WeightLossModel model){
        super(model);
    }
    public void Print(){
        System.out.println("**********************************");
        System.out.println("CUSTOMER WEIGHTLOSS PRINTOUT");
        System.out.println("**********************************");
        System.out.println("CUSTOMER NAME:"+GetCustomerName());
        System.out.println("WEIGHT LOSS:"+GetWeightloss()+"KG");
        System.out.println("**********************************");
    }}
