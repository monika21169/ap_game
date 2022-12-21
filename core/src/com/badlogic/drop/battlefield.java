package com.badlogic.drop;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.GL20;

public class battlefield implements Screen {
    ShapeRenderer shape;
    int x = 50;
    int y = 50;

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        x += 5;
        shape.begin(ShapeRenderer.ShapeType.Filled);
        shape.circle(x, y, 50);
        shape.end();
        shape.circle(50, 50, 50);
        shape.end();
        int xSpeed = 2;
        x += xSpeed;
        if (x > Gdx.graphics.getWidth()) {
            xSpeed = -5;
        }
        if (x < 0) {
            xSpeed = 5;
            Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
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

