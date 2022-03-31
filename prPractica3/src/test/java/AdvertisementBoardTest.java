import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AdvertisementBoardTest {
  private AdvertisementBoard board;
  @BeforeEach
  public void setup(){
    board = new AdvertisementBoard();
  }
  @Test
  public void ABoardHasAnAdvertisementWhenItIsCreated() {
    assertEquals(1,board.numberOfPublishedAdvertisements());
  }

  @Test
  public void PublishAnAdvertisementByTheCompanyIncreasesTheNumberOfAdvertisementsByOne() {
   int valorPrevio = board.numberOfPublishedAdvertisements();
   var ad = new Advertisement("Title", "Text","THE Company");
   var payment = new PaymentDatabaseDummy();
   var database = new AdvertiserDatabaseDummy();
   board.publish(ad,database,payment);
   assertEquals(valorPrevio+1,board.numberOfPublishedAdvertisements());
  }

  @Test
  public void WhenAnAdvertiserHasNoFoundsTheAdvertisementIsNotPublished() {
    int valorPrevio = board.numberOfPublishedAdvertisements();
    var ad = new Advertisement("Title","Text","Pepe Gotera y Otilio");
    var database = mock(AdvertiserDatabaseDummy.class);
    var payment = new PaymentDatabaseDummy();

    Mockito.when(database.findAdviser("Pepe Gotera y Otilio")).thenReturn(true);

    board.publish(ad,database,payment);

    assertEquals(valorPrevio,board.numberOfPublishedAdvertisements());

  }

  @Test
  public void AnAdvertisementIsPublishedIfTheAdvertiserIsRegisteredAndHasFunds() {
    int valorPrevio = board.numberOfPublishedAdvertisements();
    var ad = new Advertisement("Title","Text","Robin Robot");
    var database = mock(AdvertiserDatabaseDummy.class);
    var payment = mock(PaymentDatabaseDummy.class);
    Mockito.when(database.findAdviser("Robin Robot")).thenReturn(true);
    Mockito.when(payment.advertiserHasFunds("Robin Robot")).thenReturn(true);

    board.publish(ad,database,payment);

    verify(payment).advertisementPublished("Robin Robot");

    assertEquals(valorPrevio+1,board.numberOfPublishedAdvertisements());
  }

  @Test
  public void WhenTheOwnerMakesTwoPublicationsAndTheFirstOneIsDeletedItIsNotInTheBoard(){
    var ad1 = new Advertisement("Ad1","Text","THE Company");
    var ad2 = new Advertisement("Ad2","Text","THE Company");

    var database = new AdvertiserDatabaseDummy();
    var payment = new PaymentDatabaseDummy();

    board.publish(ad1,database,payment);
    board.publish(ad2,database,payment);

    assertEquals(ad1,board.findByTitle("Ad1"));

    board.deleteAdvertisement("Ad1","THE Company");

    assertEquals(null,board.findByTitle("Ad1"));
  }

  @Test
  public void AnExistingAdvertisementIsNotPublished() {

  }

  @Test
  public void AnExceptionIsRaisedIfTheBoardIsFullAndANewAdvertisementIsPublished() {}
}