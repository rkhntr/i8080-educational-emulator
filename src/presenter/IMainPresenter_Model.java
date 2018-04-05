package presenter;

public interface IMainPresenter_Model {
    void consoleOut(int value);
    int requestOfInput();
    void pixelScreenUpdate(int[][] memory);
    void characterScreenUpdate(int[][] colorMemory, int[][] charMemory);
}