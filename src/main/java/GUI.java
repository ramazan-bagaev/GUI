import java.util.Collection;

public abstract class GUI {

    private GUITree guiTree;
    private GUIElementRenderer renderer;

    public void render() {
        for(int i = 0; i < guiTree.getDepth(); i++) {
            Collection<GUIElement> elementsOnRender = guiTree.getElementsLevel(i);
            renderGUIElements(elementsOnRender);
        }
    }

    public void addElement(GUIElement guiElement) {
        guiTree.addElement(guiElement);
    }

    public void removeElement(GUIElement guiElement) {
        guiTree.removeElement(guiElement);
    }

    public abstract Collection<GUIElement> onAction(Action action);

    private void renderGUIElements(Collection<GUIElement> guiElements) {
        for(GUIElement guiElement: guiElements) {
            renderer.render(guiElement);
        }
    }

}
