package com.badlogic.drop;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class mygame extends Game {
    {
        Stage stage;
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
        Object render1 = render;
        {
            //Clear the screen, set the clear color, yada, yada

            stage.act(Gdx.graphics.getDeltaTime()); //Perform ui logic
            stage.draw(); //Draw the ui
        }
    }

    @Override
    public void create() {
        
    }
}
