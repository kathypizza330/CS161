

public class LinkedBookList {

	private BookNode head;
	private int size;
	
	public LinkedBookList(){
		head = null;
		size = 0;
	}
	
	public int size(){
		return size;
	}
	
	//IMPLEMENT -- adds a book to the end of the linked list
	public void add(Book b){
		if (size == 0){
		head = new BookNode(b);
		size++;
		return;}

		BookNode current = head;
		while (current.getNext() != null){
		current = current.getNext();}
		BookNode newNode = new BookNode(b);
		current.setNext(newNode);
		size++;
		return;
	}
	
	//IMPLEMENT -- adds a book at the specific index, or at the end if index is greater than size
	public void add(Book b, int index){
		if (size == 0){
		head = new BookNode(b);
		size++;
		return;}
		if (index<=0 || index>=size){
		BookNode current = head;
		while (current.getNext() != null){
		current = current.getNext();}
		BookNode newNode = new BookNode(b);
		current.setNext(newNode);
		size++;
		return;}

		BookNode current = head;
		for (int i = 0; i<index-1; i++){
		current = current.getNext();}
		BookNode temp = current.getNext().getNext();
		BookNode newNode = new BookNode(b);
		current.setNext(newNode);
		current.getNext().setNext(temp);
		size++;
		return;
	}
	
	//IMPLEMENT -- removes a book and returns it, or returns null if it is not present
	public Book remove(Book b){
		if (head==null) return null;

		if (head.getBook().equals(b)){
		head = head.getNext();
		size--;
		return b;}

		BookNode current = head;
		while (current.getNext() != null){
		if (current.getNext().getBook().equals(b)){
		current.setNext(current.getNext().getNext());
		size--;
		return b;}
		current = current.getNext();}
		return null;
	}

	//IMPLEMENT -- removes a book at a specific indexand returns it, 
	//or returns null if it is not present
	public Book remove(int index){
		if (head==null) return null;

		if (index<=0 || index>=size) return null;

		BookNode current = head;
		for (int i = 0; i<index-1; i++){
		current = current.getNext();
		}
		Book here = current.getNext().getBook();
		current.setNext(current.getNext().getNext());
		size--;
		return here;
	}
	
	//IMPLEMENT -- returns the total number of pages in the linked list
	public int totalPages(){
		if (size == 0){
		return 0;}

		int page = 0;
		BookNode current = head;
		while (current!= null){
		page+=current.getNumPages();
		current = current.getNext();}
		return page;
	}
	
	public String toString()
	{
		String res = "";
		BookNode current = head;
		while (current!= null){
		res+=current+"\n";
		current = current.getNext();}
		return res;
	}
	
}




