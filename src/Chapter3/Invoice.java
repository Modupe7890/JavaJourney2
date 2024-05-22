package Chapter3;

public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private double itemPerPrice;
    private double invoiceAmount;
    public Invoice (String partNumber, String partDescription, int quantityPurchased, double itemPerPrice, double invoiceAmount) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if (quantityPurchased<0){
            this.quantityPurchased = quantityPurchased;
        }
        if (itemPerPrice<0.0) {
            this.itemPerPrice = itemPerPrice;
        }
        this.invoiceAmount = invoiceAmount;
    }

        public void setPartNumber (String partNumber){
            this.partNumber = partNumber;
        }
        public String getPartNumber() {
            return partNumber;
        }
        public void setPartDescription (String partDescription){
            this.partDescription = partDescription;
        }
        public String getPartDescription() {
            return partDescription;
        }
        public void setQuantityPurchased (int quantityPurchased){
            this.quantityPurchased = quantityPurchased;
        }
        public int geQuantityPurchased() {
            return quantityPurchased;
        }
        public void setItemPerPrice (double itemPerPrice){
            this.itemPerPrice = itemPerPrice;
        }
        public double getItemPerPrice(){
            return itemPerPrice;
        }
        public double setInvoiceAmount (double invoiceAmount){
        this.invoiceAmount = quantityPurchased * itemPerPrice;;
            return invoiceAmount;
        }
}
