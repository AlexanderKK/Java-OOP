package _05Polymorphism._02Exercises._03Word;

public class CutTransform implements TextTransform {

    private String lastCut;

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex){
        lastCut = text.substring(startIndex, endIndex);
        text.delete(startIndex, endIndex);
    }

    public String getLastCut() {
        return lastCut;
    }

}