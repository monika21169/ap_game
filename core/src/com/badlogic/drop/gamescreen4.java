package com.badlogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class gamescreen4 implements Screen {
    final Drop game;
    private Texture backgroundImage;
    private TextureRegion backgroundTexture;
    OrthographicCamera camera;
    Texture coins;
    Texture exit;
    Texture continuebutton;
    Texture newbutton;
    Texture shop;
    Texture tank1;
    Texture tank2;
    Texture settings;


    public gamescreen4(final Drop game) {
        this.game = game;
        coins = new Texture(Gdx.files.internal("Coins.png"));
        exit = new Texture(Gdx.files.internal("exit.png"));
        continuebutton = new Texture(Gdx.files.internal("continue.png"));
        newbutton = new Texture(Gdx.files.internal("new.png"));
        shop = new Texture(Gdx.files.internal("shop.png"));
        tank1 = new Texture(Gdx.files.internal("tank.png"));
        tank2 = new Texture(Gdx.files.internal("tank2.png"));
        settings = new Texture(Gdx.files.internal("Settings.png"));
        backgroundImage = new Texture(Gdx.files.internal("Loading1.png"));
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
        game.batch.draw(settings,750,410,45,45);
        game.batch.draw(coins,700,415,35,35);
        game.batch.draw(newbutton,250,310,305,55);
        game.batch.draw(continuebutton,250,210,305,55);
        game.batch.draw(exit,250,110,185,55);
        game.batch.draw(shop,250,20,185,55);

        game.batch.end();

        boolean isPressed = Gdx.input.isKeyJustPressed(Input.Keys.E);
        //boolean isPressed=Gdx.input.isKeyJustPressed();



//        if (isPressed) {
//            game.setScreen(new gamescreen3(game));
//            dispose();
//        }
//
        if (isPressed) {
            game.setScreen(new gamescreen3(game));
            dispose();
        }
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
