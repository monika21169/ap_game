package com.badlogic.drop;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import jdk.javadoc.internal.doclets.formats.html.Table;

import java.awt.*;

public class score {
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


        scoreLabel = new Label(String.format("%05d", score),new Label.LabelStyle(new BitmapFont(), Color.WHITE));
        healthLabel = new Label(String.format("%03d", healthLabel),new Label.LabelStyle(new BitmapFont(), Color.WHITE));

        table.add((CharSequence) scoreLabel).expandX().padTop(10);


    }
}