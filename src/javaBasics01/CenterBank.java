package javaBasics01;

public class CenterBank {
    public static void main(String[] args) {
        OFBBankAbs ofbBankAbs = new OFBBankAbs();
        NBU nbuBankAbs = new NBU();
        KapitalBank kapitalBankAbs = new KapitalBank();
        ofbBankAbs.rate();
        nbuBankAbs.rate();
        kapitalBankAbs.rate();


    }
}
