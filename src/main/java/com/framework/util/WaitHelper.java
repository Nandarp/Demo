package com.framework.util;

public class WaitHelper {

    /**
     * Wait For seconds.
     *
     * @param  seconds
     */
    public static void waitForSeconds(final int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException ignore) { }
    }
}
