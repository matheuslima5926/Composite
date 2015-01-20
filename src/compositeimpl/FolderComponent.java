package compositeimpl;

/**
 * Created by misko on 20.1.2015.
 */
public abstract class FolderComponent {

    protected String name;

    public abstract void add(FolderComponent component);
    public abstract void remove(FolderComponent component);
    public abstract FolderComponent getComponent(int index);
    public abstract String getName();
    public abstract void displayNames();
}
