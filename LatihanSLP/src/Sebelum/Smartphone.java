package Sebelum;

import java.util.Date;

public class Smartphone extends Product {
    @Override
    String setName() {
        return "Samsung S10+ Limited Edition";
    }
    @Override
    Date setExpiredDate() {
        return new Date(); // ???????
    }
}
