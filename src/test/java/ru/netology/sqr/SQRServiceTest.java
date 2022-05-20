package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void test(int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.squareInRange(min, max);

        assertEquals(expected, actual);
    }

}