import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@With
public class Course {

    private String id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}
