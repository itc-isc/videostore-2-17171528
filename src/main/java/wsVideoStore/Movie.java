package wsVideoStore;

public abstract class Movie
{
	public final static int	    NEW_RELEASE =   1;
	public final static int 	REGULAR	    =	2;
	public final static int 	CHILDRENS   =   3;
	private String title;
	protected int priceCode;

	public Movie(String title) {
		this.title 		= title;
	}
		
	public String getTitle () {
		return title;
	}

  public abstract double determineAmount(int daysRented);

  public abstract int determineFrequentRenterPoints(int daysRented);

  public int getPriceCode(){
	  return priceCode;
  }
}