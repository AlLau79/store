package Classes;
public class Book extends Item {
    
    private String author;
    private String publisher;
    private String category;

    public Book(String title, double price, int quantity, String author, String publisher, String category){
        super(title, price, quantity);
        this.setAuthor(author);
        this.setCategory(category);
        this.setPublisher(publisher);
    }

    @Override
    public String toString(){
        return "Author: " + getAuthor() + "\nTitle: " + getTitle() + "\nPublisher: " + getPublisher() + "\nCategory: " + getCategory() 
                + "\nPrice: " + getPrice() + "\nQuantity: " + getQuantity();
    }

    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }    
    
    public void setCategory(String category){
        this.category = category;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }

    public String getCategory(){
        return category;
    }
}
