    public static void main(String[] args) throws Exception {
        String connect = " ";
        String wait = " ";
        String str = " ";
        LCD.drawString(wait, 1, 1);
        Thread.sleep(5);
        LCD.refresh();
        BTConnection btcon = Bluetooth.waitForConnection();
        LCD.clear();
        LCD.drawString(connect, 1, 2);
        Thread.sleep(5);
        LCD.refresh();
        while (!Button.ESCAPE.isPressed()) {
            LCD.drawString(str, 1, 3);
            LCD.drawInt(btcon.getSignalStrength(), 3, 9, 3);
            LCD.refresh();
            Thread.sleep(1000);
        }
        btcon.close();
    }
