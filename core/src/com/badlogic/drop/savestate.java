package com.badlogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Slider;

public class savestate implements Screen {


    private static final String TANK = "tank";
    private static final String TANK_STORED = "tank.saved";
    private static final String TANK_POSITION = "position";
    private static final String TANK_POSITION_SAVED = "position_saved";
    private static final String HEALTH = "health";

    protected Preferences getPrefs() {
        return Gdx.app.getPreferences(HEALTH);
    }

    public boolean isposition_savedEffectsEnabled() {
        return getPrefs().getBoolean(TANK_POSITION, true);
    }

    public void setposition_savedEffectsEnabled(boolean position_savedEffectsEnabled) {
        getPrefs().putBoolean(TANK_POSITION, position_savedEffectsEnabled);
        getPrefs().flush();
    }

    public boolean isMusicEnabled() {
        return getPrefs().getBoolean(TANK_STORED, true);
    }

    public void setMusicEnabled(boolean musicEnabled) {
        getPrefs().putBoolean(TANK_STORED, musicEnabled);
        getPrefs().flush();
    }

    public float getMusictank() {
        return getPrefs().getFloat(TANK, 0.5f);
    }

    public void setMusictank(float tank) {
        getPrefs().putFloat(TANK, tank);
        getPrefs().flush();
    }

    public float getposition_savedtank() {
        return getPrefs().getFloat(TANK_POSITION_SAVED, 0.5f);
    }

    public void setposition_savedtank(float tank) {
        getPrefs().putFloat(TANK_POSITION_SAVED, tank);
        getPrefs().flush();
    }

    private Stage stage;



    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
    }}


