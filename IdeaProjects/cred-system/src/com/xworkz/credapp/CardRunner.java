package  com.xworkz.credapp;

import com.xworkz.credapp.dao.CardDao;
import com.xworkz.credapp.dto.CardDto;

public class CardRunner {

    public static void  main(String crd[]){

        CardDto cardDto=new CardDto();
        cardDto.setCardNumber(126545689778L);
        cardDto.setCardId(23);
        cardDto.setCardHoldername("Chinmayi");
        cardDto.setCvv(234);
        cardDto.setExpiryDate("12/29");

        CardDao cardDao=new CardDao();

        cardDao.getCardDetails(cardDto);
    }
}
