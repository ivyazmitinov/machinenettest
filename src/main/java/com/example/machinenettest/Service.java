package com.example.machinenettest;

public class Service {

    private final IntProvider intProvider;

    public Service(IntProvider intProvider) {
        this.intProvider = intProvider;
    }

//    public int m1() {
//        if (intProvider.provideInt() == 0) {
//            return intProvider.provideInt();
//        } else if (intProvider.provideInt() > -1000 && intProvider.provideInt() < 0) {
//            return intProvider.provideInt() + 100;
//        } else {
//            return intProvider.provideInt() + 2;
//        }
//    }

    public int m2(String heh) {
        if (heh.startsWith("sus")) {
            if (intProvider.provideInt() == 0) {
                return intProvider.provideInt();
            } else if (intProvider.provideInt() > -1000 && intProvider.provideInt() < 0) {
                return intProvider.provideInt() + 100;
            } else {
                return intProvider.provideInt() + 2;
            }
        } else if (heh.endsWith("sass")) {
            return intProvider.provideInt() + 90000;
        }
        return 1;
    }
}
