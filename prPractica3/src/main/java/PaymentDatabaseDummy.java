public class PaymentDatabaseDummy implements PaymentDatabase{
    @Override
    public void advertisementPublished(String advertiserName) {

    }

    @Override
    public boolean advertiserHasFunds(String advertiserName) {
        return false;
    }
}
