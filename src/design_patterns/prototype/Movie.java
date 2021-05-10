package design_patterns.prototype;

public class Movie extends Item{
    private String runtime ; /* movie duration */

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
}
