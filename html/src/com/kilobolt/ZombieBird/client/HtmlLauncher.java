package com.kilobolt.ZombieBird.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.kilobolt.ZombieBird.ZBGame;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(272, 408);
        }

        @Override
        public ApplicationListener createApplicationListener () {
                return new ZBGame();
        }
}