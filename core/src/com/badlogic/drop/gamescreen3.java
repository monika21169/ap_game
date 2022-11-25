package com.badlogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;

public class gamescreen3 implements Screen {
    final Drop game;
    float x,y;
    private Texture backgroundImage;
    private TextureRegion backgroundTexture;
    OrthographicCamera camera;
    public gamescreen3(final Drop game) {
        this.game = game;
        backgroundImage = new Texture(Gdx.files.internal("Screen3.png"));
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
        game.batch.end();
        if (Gdx.input.justTouched()) {
            game.setScreen(new gamescreen4(game));
            dispose();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            y=y+4;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            y=y-4;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            x=x-4;
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            x=x+4;
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
