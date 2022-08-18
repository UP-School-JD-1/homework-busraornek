package reading.book;

public enum BookType {
	
    ACTION("Action"), ROMANCE("Romance"), FICTION("Fiction"),DETECTIVE("Detective") , NON_FICTION("Non fiction"), FANTASY("Fantasy") , SCIENTIFIC("Scientific"), HORROR("Horror"),PHILOSOPHY("Philosopy"), SELF_HELP("Self-Help")  ;

	private String description;

    BookType(final String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}



