package com.badlogic.drop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import jdk.javadoc.internal.doclets.formats.html.Table;

import java.awt.*;

public class score implements Screen {
    public Stage stage;
    private Viewport viewport;
    private  Integer score;
    private Integer health;
    Label scoreLabel;
    Label healthLabel;

    public score(SpriteBatch sb){
        score =0;
        health =100;
        viewport = new FitViewport(screen1.V_WIDTH,screen1.v_HEIGHT,new OrthographicCamera());
        stage =new Stage(viewport,sb);
        Table table = new Table();
        table.top();
        table.setFillParent(true);
        skin = new Skin(Gdx.files.internal("metalui/metal-ui.json"));

        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);

        Table root = new Table();
        root.setFillParent(true);
        stage.addActor(root);

        scoreLabel = new Label(String.format("%05d", score),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        healthLabel = new Label(String.format("%03d", healthLabel),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        Button button = new Button(skin);
        root.add(button);

        Label label = new Label("First line", skin);
        button.add(label);

        button.row();
        label = new Label("Second line", skin);
        button.add(label);
        Button button = new Button(skin);
        root.add(button);
        button.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                System.out.println("Hey, you clicked me!");
            }
        });

        table.add((CharSequence) scoreLabel).expandX().padTop(10);


    }

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

    }
}