package com.example.machinenettest;

public class ServiceTestUncommentedM1 {

    private Service service;
    private IntProvider intProvider;

    @BeforeEach
    public void setUp() {
        intProvider = mock(IntProvider.class);
        service = new Service(intProvider);
    }

    @Test
    @DisplayName("Should returns the provided int when it is 0")
    public void testM1WhenProvidedIntIs0ThenReturnsTheProvidedInt() {

        when(intProvider.getInt()).thenReturn(0);
        assertEquals(0, service.m1());
    }

    @Test
    @DisplayName("Should returns the provided int + 100 when it is between -1000 and 0")
    public void testM1WhenProvidedIntIsBetweenMinus1000And0ThenReturnsTheProvidedIntPlus100() {

        when(intProvider.getInt()).thenReturn(-500);
        assertEquals(-400, service.m1());
    }

    @Test
    @DisplayName("Should returns the provided int + 2 when it is greater than 0")
    public void testM1WhenProvidedIntIsGreaterThan0ThenReturnsTheProvidedIntPlus2() {

        when(intProvider.getInt()).thenReturn(1);
        assertEquals(3, service.m1());
    }

}