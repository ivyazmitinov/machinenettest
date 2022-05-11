package com.example.machinenettest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ServiceTestSetupAndClasses {

    @Test
    @DisplayName("Should returns 1 when the heh is not starts with sus and not ends with sass")
    public void testM2WhenHehIsNotStartsWithSusAndNotEndsWithSassThenReturns1() {

        Service service = new Service();
        int result = service.m2("heh");
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Should returns intProvider.provideInt() + 90000 when the heh ends with sass")
    public void testM2WhenHehEndsWithSassThenReturnsIntProviderProvideIntPlus90000() {

        String heh = "sass";
        int expected = 90000;
        IntProvider intProvider = mock(IntProvider.class);
        when(intProvider.provideInt()).thenReturn(expected);
        Service service = new Service(intProvider);

        int actual = service.m2(heh);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should returns intProvider.provideInt() + 2 when the heh starts with sus and intProvider.provideInt() is greater than -1000 and less than 0")
    public void testM2WhenHehStartsWithSusAndIntProviderProvideIntIsGreaterThanMinus1000AndLessThan0ThenReturnsIntProviderProvideIntPlus2() {

        String heh = "sus";
        IntProvider intProvider = mock(IntProvider.class);
        when(intProvider.provideInt()).thenReturn(-999);
        Service service = new Service(intProvider);

        int result = service.m2(heh);

        assertEquals(-997, result);
    }

    @Test
    @DisplayName("Should returns intProvider.provideInt() when the heh starts with sus and intProvider.provideInt() is equal to 0")
    public void testM2WhenHehStartsWithSusAndIntProviderProvideIntIsEqualTo0ThenReturnsIntProviderProvideInt() {

        String heh = "sus";
        IntProvider intProvider = mock(IntProvider.class);
        when(intProvider.provideInt()).thenReturn(0);
        Service service = new Service(intProvider);

        int result = service.m2(heh);

        assertEquals(0, result);
    }

}