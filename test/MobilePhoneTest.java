import PlayChapter2.MobilePhone;
import PlayChapter2.PhoneManufacturer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MobilePhoneTest {
    MobilePhone mikePhone;
    MobilePhone henryIphone;
    MobilePhone henryTecnoPhone;
    @BeforeEach
    void setUp(){
        mikePhone = new MobilePhone("mikePhone", PhoneManufacturer.APPLE);
        mikePhone.setModel("iPhone xs max");
        mikePhone.setStorageSpace(512);
        mikePhone.makeCall(233469);


        henryIphone = new MobilePhone("henryphoneimei", PhoneManufacturer.APPLE, "iphone8");
        henryIphone.makeCall(80221440);

        henryTecnoPhone = new MobilePhone("henrytecnoimei", PhoneManufacturer.TECHNO, 64);
        henryTecnoPhone.setModel("spark4");

    }
        @Test
        void showSimCardSlots(){
            System.out.println("Slot count in Mike's phone is " + mikePhone.getSimCardSlots());
            System.out.println("Slot count in henryIphone's phone is " + henryIphone.getSimCardSlots());
            System.out.println("Slot count in henryTechnoPhone's phone is " + henryTecnoPhone.getSimCardSlots());

        }

}
