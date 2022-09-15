package chapter3;

public class PetrolPurchase {

    private String stationLocation;
    private String petrolType;

    private int numberlLiter;
    private double literPrice;

    private double purchaseDiscount;


    public PetrolPurchase(String stationLocation, String petrolType, int numberlLiter, double literPrice, double purchaseDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.literPrice = literPrice;
        this.numberlLiter = numberlLiter;
        this.purchaseDiscount = purchaseDiscount;
    }


    public void setStationLocation(String petrol){
        this.stationLocation = stationLocation;
    }
    public void setPetrolType(String petrolType){
        this.petrolType = petrolType;
    }
    public void setnumberlliter(int numberlLiter){
        this.numberlLiter = numberlLiter;
    }
    public void setLiterPrice (double AmountPerLiter){
        this.literPrice = literPrice;

    }
    public void setPurchaseDiscount(double discountAmount){
        this.purchaseDiscount = purchaseDiscount;
    }

    public String getStationLocation(){
        return stationLocation;
    }
    public String getPetrolType(){
        return petrolType;
    }
    public int getnumberlLiter(){
        return numberlLiter;
    }
    public double getLiterPrice(){
        return literPrice;
    }
    public double getPurchaseDiscount(){
        return purchaseDiscount;
    }

    public double petrolTransprice() {
        double petrolTrans = literPrice * numberlLiter;
        return petrolTrans;
    }


}
