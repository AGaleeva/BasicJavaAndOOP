package lesson24.paper;

public class MainPaper {
    public static void main(String[] args) {
        Paper paper = new Paper();
        WritingInstrument writingInstrument = new WritingInstrument();
        Pen pen = new Pen();
        Pencil pencil = new Pencil();
        Brush brush = new Brush();
        Marker marker = new Marker();

        paper.drawFigureOnMe("free shape", writingInstrument);
        paper.drawFigureOnMe("round", pen);
        paper.drawFigureOnMe("square", pencil);
        paper.drawFigureOnMe("picture", brush);
        paper.drawFigureOnMe("pyramid", marker);
    }
}
