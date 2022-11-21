package com.badlogic.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class mygame extends Game {
    {
        Stage stage = new Stage();
        Texture myTexture;
        TextureRegion myTextureRegion;
        TextureRegionDrawable myTexRegionDrawable;
        ImageButton button;
        Object create = null;
        Object create1 = create;
        {
            myTexture = new Texture(Gdx.files.internal("tank.png"));
            myTextureRegion = new TextureRegion(myTexture);
            myTexRegionDrawable = new TextureRegionDrawable(myTextureRegion);
            button = new ImageButton(myTexRegionDrawable); //Set the button up

            stage = new Stage(new ScreenViewport()); //Set up a stage for the ui
            stage.addActor(button); //Add the button to the stage to perform rendering and take input.
            Gdx.input.setInputProcessor(stage); //Start taking input from the ui
        }
        Object render = null;
        Object render1 = null;
        {
            //Clear the screen, set the clear color, yada, yada

            stage.act(Gdx.graphics.getDeltaTime()); //Perform ui logic
            stage.draw(); //Draw the ui
        }
        Gdx.input.setInputProcessor(stage);
        Image bagImage = new Image(new Texture("Start.png"));
        bagImage.setSize(125, 125);
        stage.addActor(bagImage);
        bagImage.addListener(new ClickListener() {
            public void clicked(InputEvent event, float x, float y){
                Gdx.app.debug("DEBUG", "clicked");
            }
        });

//        public void render(float delta) {
//        stage.act(delta);
//        stage.draw();
    }

    @Override
    public void create() {
        
    }
}
