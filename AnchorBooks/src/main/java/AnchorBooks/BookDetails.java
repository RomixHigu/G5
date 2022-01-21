package AnchorBooks;

public class BookDetails extends Book{

	private String link;
	private String pages;
	private Integer year;
	private Integer price;
	private Integer lastPrice;
	private Boolean delivery;
	
	
	
	public BookDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getPages() {
		return pages;
	}
	public void setPages(String pages) {
		this.pages = pages;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(Integer lastPrice) {
		this.lastPrice = lastPrice;
	}
	public Boolean getDelivery() {
		return delivery;
	}
	public void setDelivery(Boolean delivery) {
		this.delivery = delivery;
	}
	@Override
	public String toString() {
		return "\nBookDetails [Id = " +getId()+ "Author= "+getAuthor()+ "Country= "+getCountry()+"Image Link= "+getImageLink()+"Language ="+ getLanguage()+ "Link= " + link + "Pages= " + pages +"Title= "+getTitle()+ "Year= " + year + "Price =" + price + "Last Price= "
				+ lastPrice + "Delivery =" + delivery + "]\n";
	}
	
	
	
}
