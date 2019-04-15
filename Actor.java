public class Actor extends Employee {
    private String genre;
    private int numFilms;

    public String cut() {
        return "I'm an actor. When I cut, I stop acting";
    }

    /**
     * @return the numFilms
     */
    public int getNumFilms() {
        return numFilms;
    }

    /**
     * @param numFilms the numFilms to set
     */
    public void setNumFilms(int numFilms) {
        this.numFilms = numFilms;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
}