class Example034 {

    public static void main(String[] args) {
        int i = 17;
        Integer ii = new Integer(i);
        double d = 17.0;
        C2 c2 = new C2();
        C1 c1 = c2;
        c1.m1(i);
        c2.m1(i);
        c1.m1(d);
        c2.m1(d);
        c1.m2(i);
        c2.m2(i);
        c2.m2(ii);
        c2.m3(ii);
        c2.m4(i);
    }
}
