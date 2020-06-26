package mstmvc.learn.dp.adapter.delegation;

import mstmvc.learn.dp.adapter.Adaptee;
import mstmvc.learn.dp.adapter.Target;

class Adapter implements Target {
	private Adaptee adaptee;
	public Adapter() {
		this.adaptee = new Adaptee();
	}

	public String getName() {
		return this.adaptee.getClassName();
	}
}