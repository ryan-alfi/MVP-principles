package com.apokpak.mvparch;

/**
 * Created by ryanalfi on 16/07/18.
 */

public interface GetQuoteInteractor {
    interface OnFinishedListener {
        void onFinished(String string);
    }

    void getNextQuote(OnFinishedListener listener);
}
