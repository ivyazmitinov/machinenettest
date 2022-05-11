package com.example.machinenettest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ServiceTestForceMocks {

    @Test
    @DisplayName("Should returns 1 when the heh is not starts with sus and not ends with sass")
    public void testM2WhenHehIsNotStartsWithSusAndNotEndsWithSassThenReturns1() {

        when(intProvider.provideInt()).thenReturn(0);

        int result = service.m2("heh");

        assertEquals(1, result);
    }

    @Test
    @DisplayName("Should returns intProvider.provideInt() + 90000 when the heh ends with sass")
    public void testM2WhenHehEndsWithSassThenReturnsIntProviderProvideIntPlus90000() {

        when(intProvider.provideInt()).thenReturn(1);

        int result = service.m2("sass");

        assertEquals(90001, result);
    }

}