package _06SOLID._01Lab.p01_SingleResponsibility;

public abstract class DrawingManagerImpl {

   protected final Renderer renderer;

    public DrawingManagerImpl(Renderer renderer) {
        this.renderer = renderer;
    }

}
