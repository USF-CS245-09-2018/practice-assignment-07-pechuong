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
			for (int i = tail; i > pos; i--) {
				this.arr[i] = this.arr[i - 1];
			}
			this.arr[pos] = obj;
		}
	}


	public Object get(int pos) {


	}

	public Object remove(int pos) {



	}

	public int size() {


	}

	public void growArray() {
		Object[] newArr = new Object[this.arr.length * 2];
		for (int i = 0; i < this.arr.length; i++) {
			newArr[i] = this.arr[i];
		}
		this.arr = newArr;
	}
}
			
