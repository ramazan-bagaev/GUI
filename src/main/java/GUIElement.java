import java.util.Collection;

abstract class GUIElement {

    private GUIElement parent;
    private Collection<GUIElement> children;

    public abstract boolean isInside(Point point);
}
