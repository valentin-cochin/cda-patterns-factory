package cda.factory;

import cda.hello.Hello;

public abstract class Dialog {

	public void render() {
		// other code before

		Hello helloWorld = createHello();
		helloWorld.render();
	}

	public abstract Hello createHello();
}
