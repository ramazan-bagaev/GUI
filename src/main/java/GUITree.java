import java.util.Collection;

abstract class GUITree {

    private GUIElement root;

    abstract Collection<GUIElement> getElementsLevel(int level);

    abstract int getDepth();

    abstract void addElement(GUIElement guiElement);

    abstract void removeElement(GUIElement guiElement);
}
