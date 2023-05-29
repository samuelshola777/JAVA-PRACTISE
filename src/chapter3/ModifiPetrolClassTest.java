package chapter3;

public class ModifiPetrolClassTest {


        private  String location;
        private String petrolType;
        private int literPurchase;
        private double pricePerLiter;

        private double percentageDiscount;


        public void setLocation(String location){
            this.location = location;
        }

        public void setPetrolType(String petrolType){
            this.petrolType = petrolType;
        }
        public void setLiterPurchase(int liter){

            this.literPurchase = liter;
        }
        public void setPricePerLiter (double amountPerLiter){
            this.pricePerLiter = amountPerLiter;
        }
        public void setPercentageDiscount(double discount){
            this.percentageDiscount = discount;
        }

        public  ModifiPetrolClassTest (String location ,String petrolType, int liter,double amountPerLiter, double discount){

            this.location = location;
            this.petrolType = petrolType;
            this.literPurchase = liter;
            this.pricePerLiter = amountPerLiter;
            this.percentageDiscount = discount;

        }

        public String getLocation(){
            return location;
        }
        public String getPetrolType(){
            return petrolType;
        }
        public int getLiterPurchase(){
            return literPurchase;
        }
        public double getPricePerLiter(){
            return pricePerLiter;
        }
        public  double getPercentageDiscount(){
            return percentageDiscount;
        }

    }
