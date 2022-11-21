package com.badlogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

import java.security.Key;

public class gamescreen2 implements Screen {
    final Drop game;
    private Texture backgroundImage;
    private TextureRegion backgroundTexture;
    OrthographicCamera camera;
    public gamescreen2(final Drop game) {
        this.game = game;
        backgroundImage = new Texture(Gdx.files.internal("Screen2.png"));
        backgroundTexture = new TextureRegion(backgroundImage, 0, 0, 800, 480);
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0, 0, 0, 0);

        camera.update();
        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.batch.draw(backgroundTexture, 0,0, 800, 480);
        game.font.draw(game.batch, "Welcome to Tank!", 300, 240);
        game.font.draw(game.batch, "Click anywhere to begin!", 300, 140);

        game.batch.end();
        if (Gdx.input.justTouched()) {
            game.setScreen(new gamescreen3(game));
            dispose();
        }
//        boolean isPressed = Gdx.input.isKeyPressed(Input.Keys.A);
//        if (isPressed) {
//            game.setScreen(new gamescreen3(game));
//            dispose();
//        }

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

    }
}