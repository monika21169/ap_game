package com.badlogic.drop;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.Viewport;
import org.w3c.dom.ls.LSOutput;

public class gamescreen4 implements Screen {
    private Stage stage;
    final Drop game;
    private Texture backgroundImage;
    private TextureRegion backgroundTexture;
    OrthographicCamera camera;
    Texture coins;
    Texture exit;
    Texture trans;
    Texture continuebutton;
    Texture newbutton;
    Texture shop;
    Texture tank1;
    Texture tank2;
    Texture settings;
    private Viewport gameport;
//    private Image newbutton;
    public gamescreen4(final Drop game) {


        Stage stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        Image bagImage = new Image(new Texture("tank.png"));
        bagImage.setSize(125, 125);
        stage.addActor(bagImage);
        bagImage.addListener(new ClickListener() {
            public void clicked(InputEvent event, float x, float y){
                Gdx.app.debug("DEBUG", "clicked");
            }
        });




//        Stage stage = new Stage();
//        Gdx.input.setInputProcessor(stage);
//        Image newbutton = new Image(new Texture("Newgame.png"));
////        System.out.println("123456");
//        newbutton.setSize(125, 125);
//        newbutton.setPosition(0,0);
////        System.out.println("hey586587");
//        stage.addActor(newbutton);
//        System.out.println("8745");


        this.game = game;
        coins = new Texture(Gdx.files.internal("Coins.png"));
        exit = new Texture(Gdx.files.internal("Exit.png"));
        continuebutton = new Texture(Gdx.files.internal("Continue.png"));
        newbutton = new Texture((FileHandle) Gdx.files.internal("Newgame.png"));
//        newbutton = new Image((Drawable) newbutton);
        shop = new Texture(Gdx.files.internal("shop.png"));
        tank1 = new Texture(Gdx.files.internal("tank.png"));
        tank2 = new Texture(Gdx.files.internal("tank2.png"));
        settings = new Texture(Gdx.files.internal("Settings.png"));
        trans = new Texture(Gdx.files.internal("trans.png"));
        backgroundImage = new Texture(Gdx.files.internal("mainmenu.png"));
        backgroundTexture = new TextureRegion(backgroundImage, 0, 0, 800, 480);
        camera = new OrthographicCamera();

        camera.setToOrtho(false, 800, 480);
        stage=new Stage(gameport);
//        stage.addActor(newbutton);

    }
    @Override
    public void show() {

    }

    protected void handleInput(){
        if(Gdx.input.justTouched()){
            if(Gdx.input.getX()<93 && Gdx.input.getX()>49 && Gdx.input.getY()>675-640 && Gdx.input.getY()<675-640){
                Circle gsm;
                gsm.set
                        (new settings(gsm));
            dispose();}
            update(float dt){
Input();    }
        }
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
        game.batch.draw(trans,750,410,45,45);


        game.batch.end();


        stage.act(delta);
        stage.draw();

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



