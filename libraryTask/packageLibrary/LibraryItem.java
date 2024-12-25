package packageLibrary;

public abstract class LibraryItem 
{
     int id;
     String title;

    ////////////////////////////////////////////
    public LibraryItem(int id, String title) 
    {
        this.id = id;
        this.title = title;
    }
    ////////////////////////////////////////////
    public int getId() 
    {
        return id;
    }
    ////////////////////////////////////////////
    public String getTitle() 
    {
        return title;
    }
    ///////////////////////////////////////////
    public abstract String getItemDetails();
}
