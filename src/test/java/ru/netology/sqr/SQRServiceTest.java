package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldCalculateAllSqrInDiapason() {
        SQRService service = new SQRService();
        int lowerLimit = 200;
        int upperLimit = 756;
        int expected = 13;

        int actual = service.calculateSqrNumbers(lowerLimit, upperLimit);
        assertEquals(expected, actual);

    }

    @Test
    void diapasonHasNegativeValue() {
        SQRService service = new SQRService();
        int lowerLimit = -200;
        int upperLimit = 756;
        int expected = 18;

        int actual = service.calculateSqrNumbers(lowerLimit, upperLimit);
        assertEquals(expected, actual);

    }

    @Test
    void diapasonIsEqualToSqrDiapason() {
        SQRService service = new SQRService();
        int lowerLimit = 10;
        int upperLimit = 99;
        int expected = 0;

        int actual = service.calculateSqrNumbers(lowerLimit, upperLimit);
        assertEquals(expected, actual);

    }

    @Test
    void sqrDiapasonIsBiggerThanI() {
        SQRService service = new SQRService();
        int lowerLimit = 10000;
        int upperLimit = 11000;
        int expected = 0;

        int actual = service.calculateSqrNumbers(lowerLimit, upperLimit);
        assertEquals(expected, actual);

    }

    @Test
    void sqrDiapasonIsLowerThanI() {
        SQRService service = new SQRService();
        int lowerLimit = 67;
        int upperLimit = 99;
        int expected = 0;

        int actual = service.calculateSqrNumbers(lowerLimit, upperLimit);
        assertEquals(expected, actual);

    }

    @Test
    void sqrDiapasonIsEqualToVerifiedDiapason() {
        SQRService service = new SQRService();
        int lowerLimit = 100;
        int upperLimit = 9801;
        int expected = 90;

        int actual = service.calculateSqrNumbers(lowerLimit, upperLimit);
        assertEquals(expected, actual);

    }
}