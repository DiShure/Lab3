import java.util.Calendar;
import java.util.TimeZone;

class MyTime {
    private int hour;
    private int minute;
    private int second;

    // Безаргументный конструктор, который создает объект типа MyTime для текущего времени
    public MyTime() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);
    }

    // Конструктор, который создает объект типа MyTime с указанным временем в миллисекундах
    public MyTime(long elapseTime) {
        setTime(elapseTime);
    }

    // Конструктор, который создает объект типа MyTime с указанными часами, минутами и секундами
    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getter-методы
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    // Метод для установки времени с помощью прошедшего времени
    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime / 1000;
        this.second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        this.hour = (int) (totalHours % 24);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
