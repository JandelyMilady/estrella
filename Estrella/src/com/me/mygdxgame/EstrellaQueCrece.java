package com.me.mygdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class EstrellaQueCrece implements ApplicationListener {
	
	private Texture texture;
	
	Stage stage;
	Image figura;
	Image estrella; 
	boolean izquierda=false;
	
	@Override
	public void create() {		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		
		
		texture = new Texture(Gdx.files.internal("data/estrella.png"));
		texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
		
		TextureRegion region = new TextureRegion(texture, 0, 0,128,128);
		
		stage = new Stage();
		figura =new Image (region);
		estrella = new Image(new Texture(Gdx.files.internal("data/estrella.png")));
		
		estrella.setX(500);
		estrella.setY(150);
		
		stage.addActor(estrella);
		
	
	}

	@Override
	public void dispose() {
		
		texture.dispose();
	}

	@Override
	public void render() {		
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		estrella.setY(estrella.getY()+3);
		estrella.setX(estrella.getX()-1);
		estrella.setScale(estrella.getScaleX()-0.1f,estrella.getScaleY()+0.1f);
		
		/*sprite.setRotation(sprite.getRotation()-1);
		prite.setX(sprite.getX()+2);
		sprite.setY(sprite.getY()+3);*/
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
}
