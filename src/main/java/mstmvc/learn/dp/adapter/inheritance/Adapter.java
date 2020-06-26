package mstmvc.learn.dp.adapter.inheritance;

import mstmvc.learn.dp.adapter.Adaptee;
import mstmvc.learn.dp.adapter.Target;

class Adapter extends Adaptee implements Target {
	public String getName() {
		return this.getClassName();
	}
}
