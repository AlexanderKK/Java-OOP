package _05Polymorphism._02Exercises._03Word;

public class PasteTransform implements TextTransform {

    private final CutTransform cutTransform;

    public PasteTransform(CutTransform cutTransform) {
        this.cutTransform = cutTransform;
    }

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        if(cutTransform.getLastCut() != null) {
            text.replace(startIndex, endIndex, cutTransform.getLastCut());
        }
    }

}
