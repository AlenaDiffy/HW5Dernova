package ru.netology.sqr;

public class SQRService {
    int lowerLimit;
    int upperLimit;

    public int calculateSqrNumbers(int lowerLimit, int upperLimit) {
        int i;
        int count;
        count = 0;
        for (i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit && i * i <= upperLimit) {
                count = count + 1;
            }
        }
        return count;
    }
}
