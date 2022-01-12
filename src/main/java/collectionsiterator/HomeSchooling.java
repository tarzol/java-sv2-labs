package collectionsiterator;

import java.sql.ClientInfoStatus;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HomeSchooling {

    List<OnlineLesson> onlineLessons = new ArrayList<>();

    public List<OnlineLesson> getOnlineLessons() {
        return new ArrayList<>(onlineLessons);
    }

    public void add(OnlineLesson lesson) {
        onlineLessons.add(lesson);
    }

    public void addNewLesson(OnlineLesson lesson) {
        //Iterator<OnlineLesson> iterator = onlineLessons.iterator();
        int index = onlineLessons.size();
        if (onlineLessons.size() < 3) {
            onlineLessons.add(lesson);
        }
        for ( int i = 0; i < onlineLessons.size()-1; i++) {
            LocalDateTime startTimeBeforeLesson = onlineLessons.get(i).getLocalDateTime();
            LocalDateTime startTimeAfterLesson = onlineLessons.get(i+1).getLocalDateTime();
            if (startTimeBeforeLesson.isBefore(lesson.getLocalDateTime()) && startTimeAfterLesson.isAfter(lesson.getLocalDateTime())) {
                index = i+1;
            }
            onlineLessons.add(index, lesson);
        }
    }

    public List<OnlineLesson> getLessonsByTitle(String title) {
        List<OnlineLesson> resultLessons = new ArrayList<>();
        Iterator<OnlineLesson> iterator = onlineLessons.iterator();
        while (iterator.hasNext()) {
            OnlineLesson onlineLesson = iterator.next();
            if (onlineLesson.getName().equals(title)) {
                resultLessons.add(onlineLesson);
            }
        }
        return resultLessons;
    }

    public void removeLesson(LocalDateTime startTime) {
        for ( Iterator<OnlineLesson> iterator = onlineLessons.iterator(); iterator.hasNext(); ){
            if (iterator.next().getLocalDateTime().equals(startTime)) {
                iterator.remove();
            }
        }
    }
}
