package pti.gyak;

class Complex {
    long func(long a, long b, long c) {
        if (a != 365) {
            if (a != 594) {
                a = -a;
            } else {
                if (b < c) {
                    a = c;
                } else {
                    a = -b;
                }
            }
        }
        return a;
    }
}