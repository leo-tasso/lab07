package it.unibo.mvc.view;

import it.unibo.mvc.api.DrawNumberController;
import it.unibo.mvc.api.DrawNumberView;
import it.unibo.mvc.api.DrawResult;

public final class DrawNumberConsoleView implements DrawNumberView {


    @Override
    public void setController(final DrawNumberController observer) {
    }

    @Override
    public void start() {
    }

    @Override
    public void result(final DrawResult res) {
        System.out.println(res.getDescription());
    }

}
