package cda.factory;

import cda.hello.Hello;
import cda.hello.SwingHello;

// Concrete creator
public class SwingDialog extends Dialog {

	@Override
	public Hello createHello() {
		return new SwingHello();
	}

}
