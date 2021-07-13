package PlayChapter2;

public class MobilePhone {
    private String imei;
    private  PhoneManufacturer make;
    private String model;
    private int storageSpace;
    private static final String INVALID_IMEI = "INVALID_IMEI";
    private static int simCardSlots;

    private MobilePhone(){
    super();
    }
    public MobilePhone(String imei) {
    if(imei == ""){
        this.imei = MobilePhone.INVALID_IMEI;
    }else {
        this.imei = imei;
    }
    }
    public MobilePhone(String imeiNumber, PhoneManufacturer make){
        this(imeiNumber);
        this.make =  make;
    }
    public MobilePhone(String imeiNumber, PhoneManufacturer make, String phoneModel){
    this(imeiNumber, make);
    model = phoneModel;
    }
    public MobilePhone(String imeiNumber, PhoneManufacturer make, int storage) {
        this(imeiNumber, make);
        storageSpace = storage;
    }

    public static int getSimCardSlots() {
        return simCardSlots;
    }

    public static void setSimCardSlots(int simCardSlots) {
        MobilePhone.simCardSlots = simCardSlots;
    }

    public  void setImei(String imeiNumber) {
    imei = imeiNumber;
    }
    public String getImei(){
    return this.imei;
    }
    public void setMake(PhoneManufacturer make) {
        this.make = make;
    }

    public PhoneManufacturer getMake() {
        return make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setStorageSpace(int storageSpace) {
        this.storageSpace = storageSpace;
    }
    public int getStorageSpace() {
        return storageSpace;
    }
    public Connection  makeCall(int phoneNumber){
       Connection theCall = new Connection();
       return theCall;
    }

}