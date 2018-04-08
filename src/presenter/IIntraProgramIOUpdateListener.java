package presenter;

/**
 * Интерфейс внутрипрограммного слушателя событий обновлений устройств ввода-вывода.
 * (функционал, необходимый для управления view компонентами из программы, выполняющейся
 * на эмуляторе)
 * Класс, заинтересованный в обработке событий обновлений устройств ввода-вывода,
 * реализует этот интерфейс и объект этого класса передаётся в метод
 * setIOActionsListener(IIntraProgramIOUpdateListener actionsListener) класса-эмулятора,
 * реализующего интерфейс {@link emulator.IEmulator}.
 * @author Maxim Rozhkov
 */
public interface IIntraProgramIOUpdateListener {

    /**
     * Метод вызывается, когда исполняемая эмулятором программа инициирует вывод данных в консоль
     * вывода.
     * @param value выводимое значение.
     */
    void consoleOut(int value);

    /**
     * Метод вызывается, когда исполняемая эмулятором программа инициирует запрос ввода данных
     * из консоли ввода.
     * @return введёное в консоль ввода значение.
     */
    int requestOfInput();

    /**
     * Метод вызывается, когда видеопамять пиксельного экрана модифицируется.
     */
    void pixelScreenUpdate();

    /**
     * Метод вызывается, когда видеопамять символьного экрана модифицируется.
     */
    void characterScreenUpdate();
}