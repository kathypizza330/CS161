
public class Set extends LinkedList implements ISet {

	public void add(Object item) {
		// System.out.println(in(item));
		if (in(item) == false) {
			super.add(item);
			return;
		}
	}

	public boolean in(Object item) {
		Node current = this.head();
		for (int i = 0; i < this.size(); i++) {
			if (current.getItem().equals(item))
				return true;
			current = current.getNext();
		}
		return false;
	}

	public Object[] toArray() {
		Object[] array = new Object[this.size()];
		if (this.size() == 0)
			return array;
		Node current = this.head();
		for (int i = 0; i < this.size(); i++) {
			array[i] = current.getItem();
			current = current.getNext();
		}
		return array;
	}

	public ISet fromArray(Object[] elements) {
		ISet set = new Set();
		if (elements.length == 0 || elements == null) {
			return set;
		}
		for (int i = 0; i < elements.length; i++) {
			set.add(elements[i]);
		}
		return set;
	}

	public ISet intersection(ISet other) {
		ISet set = new Set();
		Set that = (Set) other;
		Node thatCurrent = that.head();
		for (int j = 0; j < that.size(); j++) {
			if (this.in(thatCurrent.getItem()))
				set.add(thatCurrent.getItem());
			thatCurrent = thatCurrent.getNext();
		}
		return set;
	}

	public ISet union(ISet other) {
		ISet set = this;
		Set that = (Set) other;
		// Node current = this.head();
		// for (int i = 0; i < this.size(); i++) {
		Node thatCurrent = that.head();
		for (int j = 0; j < that.size(); j++) {
			// System.out.print("this "+current);
			// System.out.println(" that "+thatCurrent);
			// if (!current.getItem().equals(thatCurrent.getItem()))
			if (in(thatCurrent.getItem()) == false)
				set.add(thatCurrent.getItem());
			thatCurrent = thatCurrent.getNext();
			// System.out.println("set "+set);
		}
		// current = current.getNext();
		// }
		return set;

	}

}
