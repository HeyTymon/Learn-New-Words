public class GermanWord extends Word{

    String article;

    public GermanWord(String word, String articles) {
        super(word);
        this.article = articles;
    }

    public void setArticles(String articles) {
        this.article = articles;
    }

    public String getArticles() {
        return article;
    }

    @Override
    public String toString() {
        return article + " " + word;
    }
}
