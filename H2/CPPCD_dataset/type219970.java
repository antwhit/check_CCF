    public void run() {
        int aLength;
        boolean pas = true;
        Random rd = new Random();
        aLength = getArrayLength();
        boolean[] inBArray = new boolean[aLength];
        for (int i = 0; i < aLength; i++) {
            if (i % 2 == 0) inBArray[i] = true; else inBArray[i] = false;
        }
        setArray(inBArray);
        boolean[] outArray = getArray();
        for (int j = 0; j < aLength; j++) {
            if (inBArray[j] != outArray[j]) {
                pas = false;
                break;
            }
        }
        System.out.println();
        if (pas) System.out.println(" "); else System.out.println(" ");
    }