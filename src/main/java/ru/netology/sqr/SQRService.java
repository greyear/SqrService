package ru.netology.sqr;

public class SQRService {

    public int squareInRange(int min, int max) {
        int num = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    num++;
                }
            }
        }
        return num;
    }
}
