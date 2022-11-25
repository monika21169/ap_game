package com.badlogic.drop;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.ScreenUtils;


public class gamescreen4 implements Screen {
    private Stage stage;
    final Drop game;
    private Texture backgroundImage;
    private TextureRegion backgroundTexture;
    OrthographicCamera camera;
    Texture coins;
    Texture exit;
    Texture continuebutton;
    Texture newbutton;
    Texture shop;
//    float y;
//    float x;
//    Texture trans;
//    Texture tank1;
//    Texture tank2;
    Texture settings;
    public gamescreen4(final Drop game) {
        this.game = game;
        coins = new Texture(Gdx.files.internal("Coins.png"));
        exit = new Texture(Gdx.files.internal("Exit.png"));
        continuebutton = new Texture(Gdx.files.internal("Continue.png"));
        newbutton = new Texture(Gdx.files.internal("Newgame.png"));
        shop = new Texture(Gdx.files.internal("shop.png"));
        settings = new Texture(Gdx.files.internal("Settings.png"));
        backgroundImage = new Texture(Gdx.files.internal("mainmenu.png"));
        backgroundTexture = new TextureRegion(backgroundImage, 0, 0, 800, 480);
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
//        trans = new Texture(Gdx.files.internal("trans.png"));
//        tank1 = new Texture(Gdx.files.internal("tank.png"));
//        game.batch.draw(trans,750,410,45,45);
//        tank2 = new Texture(Gdx.files.internal("tank2.png"));
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
        game.batch.draw(newbutton,30,390,305,55);
        game.batch.draw(continuebutton,30,320,305,55);
        game.batch.draw(exit,65,250,185,55);
        game.batch.draw(shop,50,20,185,55);
        game.batch.end();
        if (Gdx.input.justTouched()) {
            game.setScreen(new gamescreen5(game));
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