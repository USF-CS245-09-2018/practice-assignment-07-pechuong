public class ArrayList implements List {

	private Object[] arr;
	private int tail;

	public ArrayList() {
		this.arr = new Object[10];
		this.tail = 0;
	}

	public void add(Object obj) {
		if (this.tail + 1 < this.arr.length) {
			this.arr[tail++] = obj;
		} else {
			growArray();
			add(obj);
		}
	}

	public void add(int pos, Object obj) {
		if (pos < 0 || pos >= this.arr.length || this.tail + 1 >= this.arr.length) {
			growArray();
			add(pos, obj);
		} else {
			if (pos > this.tail) {
				add(obj);
				return;
			}
			for (int i = tail; i > pos; i--) {
				this.arr[i] = this.arr[i - 1];
			}
			this.arr[pos] = obj;
		}
	}


	public Object get(int pos) {
		return (pos < 0 || pos >= this.arr.length || pos > this.tail) ? null : this.arr[pos]; 
	}

	public Object remove(int pos) {
		this.tail--;
		return (pos < 0 || pos >= this.arr.length || pos > this.tail || this.tail <= 0) ? null : this.arr[tail--];
	}

	public int size() {
		return this.tail;
	}

	public void growArray() {
		Object[] newArr = new Object[this.arr.length * 2];
		for (int i = 0; i < this.arr.length; i++) {
			newArr[i] = this.arr[i];
		}
		this.arr = newArr;
	}
}
			
