package com.tigerdev.geowars;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class GeoWars extends ApplicationAdapter {

	private Stage stage;
	
	@Override
	public void create () {
		stage = new Stage(new ScreenViewport());
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
	}

	public void dispose() {
		stage.dispose();
	}

}
