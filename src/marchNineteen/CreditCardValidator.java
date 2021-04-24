package HM.marchNineteen;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

enum typeOfCreditCard {VISA, MASTER_CARD, EXPRESS, VISA_GOLD, AMERICAN_EXPRESS}

public class CreditCardValidator {
    public void validateCreditCard(int amountDigitsInCard, String typeCreditCard, boolean hasAnOwner, Calendar datee, int cvv) {
        class CreditCard {
            private int amountOfDigitsInCard;
            private String typeOfCreditCard;
            private typeOfCreditCard type;
            private boolean hasAOwner;
            private Calendar date;
            private int cvvCode;

            public CreditCard() {
                this.amountOfDigitsInCard = amountDigitsInCard;
                this.typeOfCreditCard = typeCreditCard;
                this.hasAOwner = hasAnOwner;
                this.date = datee;
                this.cvvCode = cvv;
            }

            public int getAmountOfDigitsInCard() {
                return amountOfDigitsInCard;
            }

            public String getTypeOfCreditCard() {
                return typeOfCreditCard;
            }

            public boolean isHasAOwner() {
                return hasAOwner;
            }

            public Calendar getDate() {
                return date;
            }

            public int getCvvCode() {
                return cvvCode;
            }

            public void validateCreditCard() {
                if (!isHasAOwner()) {
                    System.out.println("У вас безымянная карта.");
                }
                if (getAmountOfDigitsInCard() == 16) {
                    System.out.println("Номер карты  валиден.");
                }
                for (typeOfCreditCard s : type.values()) {
                    if (getTypeOfCreditCard().toLowerCase().equals(s.toString().toLowerCase())) {
                        System.out.println("Ваш тип карты: "+ s.toString() + ".");
                    }
                }
                if (getDate().compareTo(new GregorianCalendar()) > 0) {
                    System.out.println("Срок действия карты не истек. \nВаша карта действительна до: " + getDate().getTime());
                }
                if (getCvvCode() > 100 && getCvvCode() < 999) {
                    System.out.println("Ваш CVV код  валиден.");
                }


            }


        }
        CreditCard creditCard = new CreditCard();
        creditCard.validateCreditCard();
    }
}


