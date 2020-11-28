package mapper;

import bean.Comment;
import bean.Rank;
import bean.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    User selectUserByName(String name);
    int insertUser(User user);
    List<Rank> gameHistory(String name);
    int insertComment(Comment comment);
    int insertRank(Rank rank);
}
