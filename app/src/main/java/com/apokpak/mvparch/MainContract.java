package com.apokpak.mvparch;

/**
 * Created by ryanalfi on 16/07/18.
 */

public interface MainContract {
    interface MainView{
        void showProgress();

        void hideProgress();

        void setQuote(String string);
    }

    interface GetQuoteInteractor {
        interface OnFinishedListener {
            void onFinished(String string);
        }

        void getNextQuote(OnFinishedListener onFinishedListener);
    }

    interface Presenter {
        void onButtonClick();

        void onDestroy();
    }
}
