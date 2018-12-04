package state;

public abstract class MovieState {

    Context context;

    public void setContext(Context context) {
        this.context = context;
    }
    public abstract void invite();

    public abstract void shoot();

    public abstract void submit();

    public abstract void show();
}
