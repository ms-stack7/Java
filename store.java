public class store  //store class 
{
    // applying value in attributes
    private int StoreID;
    private String storename;
    private String location;
    private String openinghours;
    private double totalsales;
    private double totaldiscount;
    // applying constructor  
    public store(int StoreID,String storename, String location,String openinghours){
        this.StoreID = StoreID;
        this.storename=storename;
        this.location=location;
        this.openinghours=openinghours;
        this.totalsales=0;
        this.totaldiscount=0;
        
    }
    // mutetor method
     public void settotalsales(double totalsales){
         this.totalsales=totalsales;
     }
     public void settotaldiscount(double totaldiscount){
         this.totaldiscount=totaldiscount;
     }
     //applying accessor method
    public double gettotalsales(){
        return this.totalsales;
    }
    public int getStoreID(){
        return this.StoreID;
    }
    public String getstorename(){
        return this.storename;
    }
    public String getlocation(){
        return this.location;
    }
    public String getopeninghours(){
        return this.openinghours;
    }
    public double getotalsales(){
        return this.totalsales;
    }
   // display method
   public void display(){
       if(totalsales==0 || totaldiscount==0)
       {
           System.out.println("total discount and total sales are initialized to 0");
       }else{
           System.out.println("storeID:"+ getStoreID());
           System.out.println("storeName:"+ getstorename());
           System.out.println("location:"+ getlocation());
           System.out.println("openinghours:"+ getopeninghours());
           System.out.println("totalsales:"+gettotalsales());
     }      
       }
}