    public void run() {
        int arrayLength;
        boolean pass = true;
        Random rd = new Random();
        arrayLength = getArrayLength();
        boolean[] inArray = new boolean[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if (i % 2 == 0) inArray[i] = true; else inArray[i] = false;
        }
        setArray(inArray);
        boolean[] outArray = getArray();
        for (int i = 0; i < arrayLength; i++) {
            if (inArray[i] != outArray[i]) {
                pass = false;
                break;
            }
        }
        System.out.println();
        if (pass) System.out.println(" "); else System.out.println(" ");
    }