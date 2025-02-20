package hello;

public class Activity5 {
	public static void main(String[] args) {
		String title = "The Shining";
		Book newNovel = new MyBook();
		newNovel.setTitle(title);
		System.out.println("The title is: " + newNovel.getTitle());
	}
}
	
	abstract class Book{
		String title;
		abstract void setTitle(String R);
		 public String getTitle() {
			 return title;
		 }
	}

		 class MyBook extends Book{
			
			public void setTitle(String R) {
				title = R;
				 
		}
		
		 }