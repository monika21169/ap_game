package com.badlogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.ProgressBar;
import com.badlogic.gdx.utils.ScreenUtils;
public class screen1 implements Screen {
    final Drop game;
    SpriteBatch batch;
    Texture img;
    float x,y;
    private Texture backgroundImage;
    private TextureRegion backgroundTexture;
    public static final int V_WIDTH =480;
    public static final int v_HEIGHT =208;
    private Skin skin;
    private Stage stage;


    @Override
    public void create () {
        skin = new Skin(Gdx.files.internal("metalui/metal-ui.json"));

        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);

        //Begin layout
        TextButton textButton = new TextButton("Hello", skin);
        stage.addActor(textButton);
    }
    OrthographicCamera camera;
    public screen1(final Drop game) {
        this.game = game;

        ProgressBar progressBar = new ProgressBar(0, 100, .1f, false, skin);
        root.add(progressBar);
        progressBar.setAnimateDuration(.25f);
        backgroundImage = new Texture(Gdx.files.internal("Screen1.png"));
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
        game.batch.draw(backgroundTexture, 0, 0, 800, 480);
        game.font.draw(game.batch, "", 300, 240);
        game.font.draw(game.batch, "", 300, 140);
        game.batch.end();

//        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
//            y=y+4;
//        }
//        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
//            y=y-4;
//        }
//        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
//            x=x-4;
//        }
//        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
//            x=x+4;
//        }


        if (Gdx.input.isTouched()) {
            game.setScreen(new screen2(game));
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
