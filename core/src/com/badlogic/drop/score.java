package com.badlogic.drop;

import com.badlogic.gdx.graphics.OrthographicCamera;
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
        viewport = new FitViewport(screen1.V_WIDTH,screen1.v_HEIGHT,new OrthographicCamera());
        stage =new Stage(viewport,sb);
        Table table = new Table();
        table.top();



    }
}