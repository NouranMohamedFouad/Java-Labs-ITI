package packageLibrary;

public class Magazine extends LibraryItem 
{
    private String publisher;
    
    /////////////////////////////////////////
    public Magazine(int id, String title, String publisher) {
        super(id, title);
        this.publisher = publisher;
    }
    /////////////////////////////////////////
    public String getPublisher() {
        return publisher;
    }
    /////////////////////////////////////////
    @Override
    public String getItemDetails() 
    {
        return "Magazine [ID: " +id + ", Title: " +title +
               ", Publisher: " + publisher + "]";
    }
    //////////////////////////////////////////
}

