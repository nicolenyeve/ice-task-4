public abstract class  Weightloss implements IWeightloss {
     String CustomerName;
    double Weightloss;

    public  Weightloss(WeightLossModel model){
        this.CustomerName=model.CustomerName;
        this.Weightloss=model.WeighLoss;
    }

    @Override
    public String GetCustomerName() {
        return CustomerName;
    }
    @Override
    public double GetWeightloss(){
        return Weightloss;
    }
}
