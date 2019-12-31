public class MovieMedia  {
    private String type;
    private String title;
    private String koreanTitle;
    private String director;
    private String actors;
    private int year;
    private String subtitle;
    private String fileName;
    private String resolution;

    public MovieMedia() {
        reset();
    }

    public MovieMedia(String type, String title, String koreanTitle, String director, String actors, int year,
                      String subtitle, String fileName, String resolution) {
        this.type = type;
        this.title = title;
        this.koreanTitle = koreanTitle;
        this.director = director;
        this.actors = actors;
        this.year = year;
        this.subtitle = subtitle;
        this.fileName = fileName;
        this.resolution = resolution;
    }

    public String toString() {
        return new String("Type: " + type + "\nTitle: " + title + "\nKoreanTitle: " + koreanTitle
                 + "\nDirector: " + director + "\nActors: " + actors + "\nYear: " + year + "\nSubtitle: " + subtitle
                + "\nFileName: " + fileName + "\nresolution: " + resolution + "\n\n");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKoreanTitle() {
        return koreanTitle;
    }

    public void setKoreanTitle(String koreanTitle) {
        this.koreanTitle = koreanTitle;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public boolean find(String str) {
        if (type.equals(str) || title.equals(str) || koreanTitle.equals(str) || director.equals(str)
                 || actors.contains(str) || subtitle.equals(str) || fileName.equals(str) || resolution.equals(str)) {
            return true;
        }
        return false;
    }

    public void reset() {
        type = null;
        title = null;
        koreanTitle = null;
        director = null;
        actors = null;
        year = 0;
        subtitle = null;
        fileName = null;
        resolution = null;
    }
}
